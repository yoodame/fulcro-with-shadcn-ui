(ns com.fulcrologic.shadcn-ui.components.ui.ui-label
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/label" :refer [Label]])))

(def ui-label
  "No docstring available for Label"
   #?(:cljs (h/factory-apply Label)))
