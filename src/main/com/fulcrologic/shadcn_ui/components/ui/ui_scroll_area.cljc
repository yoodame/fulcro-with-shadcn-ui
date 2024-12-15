(ns com.fulcrologic.shadcn-ui.components.ui.ui-scroll-area
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/scroll-area" :refer [ScrollBar ScrollArea]])))

(def ui-scroll-bar
  "No docstring available for ScrollBar"
   #?(:cljs (h/factory-apply ScrollBar)))

(def ui-scroll-area
  "No docstring available for ScrollArea"
   #?(:cljs (h/factory-apply ScrollArea)))
