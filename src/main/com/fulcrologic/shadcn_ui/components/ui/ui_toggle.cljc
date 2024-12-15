(ns com.fulcrologic.shadcn-ui.components.ui.ui-toggle
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/toggle" :refer [Toggle]])))

(def ui-toggle
  "No docstring available for Toggle"
   #?(:cljs (h/factory-apply Toggle)))
