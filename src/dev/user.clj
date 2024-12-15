(ns user
  (:require
    [clojure.string :as str]
    [clojure.data.json :as json]
    [clojure.java.io :refer [as-file file make-parents reader]]))

;; The path to the repository
(def repo-path "/Users/yawodame/development/fulcrologic/shadcn-ui-wrapper")
(def out-path "src/main/com/fulcrologic/shadcn_ui/")
(def js-path "src/js")
(def shadcn-ns "com.fulcrologic.shadcn-ui")
(def component-regex #"exports\.([A-Z][a-zA-Z0-9]*)")

(defn extract-js-function-names
  ([file-path]
   (let [file-content (slurp (file file-path))]
     (extract-js-function-names file-content file-path)))
  ([file-content file-path]
   (->> (re-seq component-regex file-content)
     (map last)
     (distinct)
     (filter some?)
     (vec))))

(def factories-preamble
  (str "(ns " shadcn-ns ".factories
   (:require
     #?(:cljs [\"/shadcn-ui\" :as suir])
     [" shadcn-ns ".factory-helpers :as h]))\n\n"))

(def icons-preamble
  (str "(ns " shadcn-ns ".lucide-icons
   (:require
     #?(:cljs [\"lucide-react\" :as icon])
     [" shadcn-ns ".factory-helpers :as h]))\n\n"))

(defn hyphenated [camelCase]
  (-> camelCase
    (str/replace #"([A-Z])" "-$1")
    (str/lower-case)
    (str/replace #"^-" "")))

(defn quoted [s] (str "\"" s "\""))
(defn escaped [s] (str/replace s "\"" "\\\""))

(def input-factory-classes
  #{"Input"
    "Checkbox"
    "FormInput"
    "DropdownSearchInput"
    "Search"
    "TextArea"})

(defn factory-helper [class]
  (if (contains? input-factory-classes class)
    "wrapped-factory-apply"
    "factory-apply"))

(defn factory-helper-function
  ([{:keys [class factory-name docstring]}]
     (factory-helper-function class factory-name docstring "suir/"))
  ([class factory-name docstring]
     (factory-helper-function class factory-name docstring nil))
  ([class factory-name docstring prefix]
     (let [class-ref (if (string? prefix)
                       (str prefix "/" class)
                       class)]
       (str "(def " factory-name "\n"
         "  \""
         (escaped docstring)
         "\""
         "\n  "
         " #?(:cljs (h/" (factory-helper class) " " class-ref ")))\n"))))

(defn factory-ns-cljs [ns factories module-path]
  (let [classes (str/join " " (mapv :class factories))
        preamble (str "(ns " ns "\n"
                   "  (:require\n"
                   "    [" shadcn-ns ".factory-helpers :as h]\n"
                   "    #?(:cljs [\"" module-path "\" :refer [" classes "]])))\n\n")
        factories (map (fn [{:keys [class factory-name docstring]}]
                         (factory-helper-function class factory-name docstring))
                    factories)]
    (str preamble (str/join "\n" factories))))


(defn props->str
  "Converts a map of props to a string.
  {name type default description} => name (type | default) - description"
  [props]
  (if (seq props)
    (let [doc-str (map (fn [{:keys [name type default description]}]
                         (str name " (" type " | " default ") - " description))
                    props)]
      (str "\n Props: \n    - " (str/join "\n    - " doc-str)))))

(defn read-info [filename]
  (with-open [r (reader (as-file filename))]
    (json/read r :key-fn keyword)))

(defn gen-docstring [component data]
  (let [description (get-in data [:description])
        props (props->str (get-in data [:props]))
        data-attributes (->> (get-in data [:dataAttributes])
                          (map (fn [{:keys [attribute values]}]
                               (str attribute " - " values)))
                          (str/join "\n    - ")
                          (str "\n Data Attributes: \n    - "))]
    (if data
      (str/join " \n" (filter some? [component description props data-attributes]))
      (str "No docstring available for " component))))

(defn gen-components-map [out-path]
  (fn [[dir file js-path]]
    (let [doc-data (read-info "src/dev/components_data.json")
          full-path (str (.getPath dir) "/" file)
          module-path (-> full-path
                        (str/replace js-path "")
                        (str/replace #"\.js$" ""))
          tree (-> module-path str/lower-case (str/split #"/"))
          treeparts    (subvec tree 1 (- (count tree) 1))
          factory-name (str "ui-" (hyphenated (str/replace file #"\.js$" "")))
          filename (str out-path (str/join "/" treeparts) "/" (str/replace factory-name #"-" "_") ".cljc")
          nns          (str shadcn-ns "." (str/join "." treeparts) "." factory-name)
          classes (extract-js-function-names (str dir "/" file))
          factories     (->> classes
                        (map #(hash-map
                                :class %
                                :factory-name (str "ui-" (hyphenated %))
                                :docstring (gen-docstring % (get-in doc-data [(keyword %)]))))
                        (into []))]
      {:module-path module-path
       :filename filename
       :ns nns
       :classes classes
       :factories factories})))

(defn gen-js-entry [modules]
  (let [preamble (map (fn [{:keys [classes module-path]}]
                        (str "const { "
                          (str/join ", " classes)
                          " } = require(\"."
                          module-path
                          "\");"))
                   modules)
        module-exports ["module.exports = {"
                        (str/join ",\n" (mapcat :classes modules))
                        "};"]]
    (str (str/join "\n" preamble)
      "\n\n"
      (str/join "\n" module-exports))))

;(defn gen-dynamic-js-imports [modules]
;  (let [preamble (map (fn [{:keys [classes module-path]}]
;                        (str "const { "
;                          (str/join ", " classes)
;                          " } = require(\"."
;                          module-path
;                          "\");"))
;                   modules)
;        lines (->> (mapcat (fn [{:keys [factories module-path]}]
;                             (mapv #(vector
;                                      (:factory-name %)
;                                      (:class %)
;                                      (str "." module-path)) factories))
;                    modules)
;                  (map (fn [[name class path]] (str "\"" class "\": () => require("\" path "\")." class ",")))
;                  (str/join "\n"))
;        module-exports ["const dynamicImports = {"
;                        lines
;                        "};"]]
;    (str (str/join "\n" module-exports)
;      "\n\n"
;      "module.exports = dynamicImports;")))

(defn gen-cljs-factories [modules]
  (let [factories (map (fn [{:keys [factories]}]
                         (str/join "\n" (map factory-helper-function factories)))
                    modules)]
    (str factories-preamble (str/join "\n" factories))))

(defn gen-cljs-icons [modules]
  (let [factories (mapv (fn [[class factory-name]]
                          (factory-helper-function class factory-name "Lucide React Icon" "icon"))
                    modules)]
    (str icons-preamble (str/join "\n" factories))))

(defn gen-components [directories]
  (let [js-path (str repo-path "/" js-path)
        full-dirs (map #(file js-path %) directories)
        js-files (->> full-dirs
                   (mapcat (fn [dir]
                             (->> (file-seq dir)
                               (filter #(.isFile %))
                               (map #(vector dir (.getName %) js-path)))))
                   (filter #(str/ends-with? (second %) ".js")))
        modules (->> js-files
                  (map (gen-components-map out-path))
                  (sort-by :ns))]

    (spit (as-file (str js-path "/shadcn-ui.js")) (gen-js-entry modules))
    (spit (as-file (str out-path "/factories.cljc")) (gen-cljs-factories modules))
    (doseq [{:keys [ns factories filename module-path]} modules]
      (make-parents filename)
      (spit (as-file filename) (factory-ns-cljs ns factories module-path)))
    modules))

;(def icon-regex #"\"([^\"]+)\": \(")
(def icon-regex #"exports\.([A-Z][a-zA-Z0-9]*)Icon")

(defn gen-lucide-icons [js-filename]
  (let [modules (->> (slurp (file js-filename))
                       (re-seq icon-regex)
                       (map last)
                       (distinct)
                       (filter some?)
                       (sort)
                       (mapv #(vector % (str (hyphenated %) "-icon"))))]
    (spit (as-file (str out-path "/lucide_icons.cljc")) (gen-cljs-icons modules))))

(comment
  ;; To generate the factories for the components in the UI library
  ;; run the following command:
  ;; npm run shadcn:add-all | npm run shadcn:add
  ;; npm run build:babel
  ;; Then update the project path def and/or shadcn-ns def
  ;; and run the following command:
  (gen-components ["components/ui"])

  (gen-lucide-icons "node_modules/lucide-react/dynamicIconImports.js")
  (gen-lucide-icons "node_modules/lucide-react/dist/cjs/lucide-react.js")
  nil)
