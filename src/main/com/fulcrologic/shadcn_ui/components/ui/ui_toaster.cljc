(ns com.fulcrologic.shadcn-ui.components.ui.ui-toaster
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/toaster" :refer [Toaster]])))

(def ui-toaster
  "No docstring available for Toaster"
   #?(:cljs (h/factory-apply Toaster)))
