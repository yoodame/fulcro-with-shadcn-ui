(ns com.fulcrologic.shadcn-ui.components.ui.ui-button
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/button" :refer [Button]])))

(def ui-button
  "No docstring available for Button"
   #?(:cljs (h/factory-apply Button)))
