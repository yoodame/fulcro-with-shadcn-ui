(ns com.fulcrologic.shadcn-ui.components.ui.ui-slider
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/slider" :refer [Slider]])))

(def ui-slider
  "No docstring available for Slider"
   #?(:cljs (h/factory-apply Slider)))
