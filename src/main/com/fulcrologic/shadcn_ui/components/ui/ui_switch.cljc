(ns com.fulcrologic.shadcn-ui.components.ui.ui-switch
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/switch" :refer [Switch]])))

(def ui-switch
  "No docstring available for Switch"
   #?(:cljs (h/factory-apply Switch)))
