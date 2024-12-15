(ns com.fulcrologic.shadcn-ui.components.ui.ui-calendar
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/calendar" :refer [Calendar]])))

(def ui-calendar
  "No docstring available for Calendar"
   #?(:cljs (h/factory-apply Calendar)))
