(ns com.fulcrologic.shadcn-ui.components.ui.ui-popover
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/popover" :refer [PopoverTrigger PopoverContent PopoverAnchor Popover]])))

(def ui-popover-trigger
  "No docstring available for PopoverTrigger"
   #?(:cljs (h/factory-apply PopoverTrigger)))

(def ui-popover-content
  "No docstring available for PopoverContent"
   #?(:cljs (h/factory-apply PopoverContent)))

(def ui-popover-anchor
  "No docstring available for PopoverAnchor"
   #?(:cljs (h/factory-apply PopoverAnchor)))

(def ui-popover
  "No docstring available for Popover"
   #?(:cljs (h/factory-apply Popover)))
