(ns com.fulcrologic.shadcn-ui.components.ui.ui-badge
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/badge" :refer [Badge]])))

(def ui-badge
  "No docstring available for Badge"
   #?(:cljs (h/factory-apply Badge)))
