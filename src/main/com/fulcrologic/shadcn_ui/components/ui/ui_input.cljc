(ns com.fulcrologic.shadcn-ui.components.ui.ui-input
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/input" :refer [Input]])))

(def ui-input
  "No docstring available for Input"
   #?(:cljs (h/wrapped-factory-apply Input)))
