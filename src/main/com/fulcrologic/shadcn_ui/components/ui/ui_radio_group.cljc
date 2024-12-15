(ns com.fulcrologic.shadcn-ui.components.ui.ui-radio-group
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/radio-group" :refer [RadioGroupItem RadioGroup]])))

(def ui-radio-group-item
  "No docstring available for RadioGroupItem"
   #?(:cljs (h/factory-apply RadioGroupItem)))

(def ui-radio-group
  "No docstring available for RadioGroup"
   #?(:cljs (h/factory-apply RadioGroup)))
