(ns com.fulcrologic.shadcn-ui.components.ui.ui-select
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/select" :refer [SelectValue SelectTrigger SelectSeparator SelectScrollUpButton SelectScrollDownButton SelectLabel SelectItem SelectGroup SelectContent Select]])))

(def ui-select-value
  "No docstring available for SelectValue"
   #?(:cljs (h/factory-apply SelectValue)))

(def ui-select-trigger
  "No docstring available for SelectTrigger"
   #?(:cljs (h/factory-apply SelectTrigger)))

(def ui-select-separator
  "No docstring available for SelectSeparator"
   #?(:cljs (h/factory-apply SelectSeparator)))

(def ui-select-scroll-up-button
  "No docstring available for SelectScrollUpButton"
   #?(:cljs (h/factory-apply SelectScrollUpButton)))

(def ui-select-scroll-down-button
  "No docstring available for SelectScrollDownButton"
   #?(:cljs (h/factory-apply SelectScrollDownButton)))

(def ui-select-label
  "No docstring available for SelectLabel"
   #?(:cljs (h/factory-apply SelectLabel)))

(def ui-select-item
  "No docstring available for SelectItem"
   #?(:cljs (h/factory-apply SelectItem)))

(def ui-select-group
  "No docstring available for SelectGroup"
   #?(:cljs (h/factory-apply SelectGroup)))

(def ui-select-content
  "No docstring available for SelectContent"
   #?(:cljs (h/factory-apply SelectContent)))

(def ui-select
  "No docstring available for Select"
   #?(:cljs (h/factory-apply Select)))
