(ns com.fulcrologic.shadcn-ui.components.ui.ui-progress
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/progress" :refer [Progress]])))

(def ui-progress
  "No docstring available for Progress"
   #?(:cljs (h/factory-apply Progress)))
