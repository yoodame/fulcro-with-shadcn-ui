(ns com.fulcrologic.shadcn-ui.components.ui.ui-alert
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/alert" :refer [AlertTitle AlertDescription Alert]])))

(def ui-alert-title
  "No docstring available for AlertTitle"
   #?(:cljs (h/factory-apply AlertTitle)))

(def ui-alert-description
  "No docstring available for AlertDescription"
   #?(:cljs (h/factory-apply AlertDescription)))

(def ui-alert
  "No docstring available for Alert"
   #?(:cljs (h/factory-apply Alert)))
