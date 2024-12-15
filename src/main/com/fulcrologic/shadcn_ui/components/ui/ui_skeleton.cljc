(ns com.fulcrologic.shadcn-ui.components.ui.ui-skeleton
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/skeleton" :refer [Skeleton]])))

(def ui-skeleton
  "No docstring available for Skeleton"
   #?(:cljs (h/factory-apply Skeleton)))
