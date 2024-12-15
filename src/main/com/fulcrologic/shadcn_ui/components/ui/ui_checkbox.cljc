(ns com.fulcrologic.shadcn-ui.components.ui.ui-checkbox
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/checkbox" :refer [Checkbox]])))

(def ui-checkbox
  "No docstring available for Checkbox"
   #?(:cljs (h/wrapped-factory-apply Checkbox)))
