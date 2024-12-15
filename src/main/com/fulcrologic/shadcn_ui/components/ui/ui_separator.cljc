(ns com.fulcrologic.shadcn-ui.components.ui.ui-separator
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/separator" :refer [Separator]])))

(def ui-separator
  "No docstring available for Separator"
   #?(:cljs (h/factory-apply Separator)))
