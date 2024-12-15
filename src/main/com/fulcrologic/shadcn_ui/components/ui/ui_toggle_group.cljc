(ns com.fulcrologic.shadcn-ui.components.ui.ui-toggle-group
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/toggle-group" :refer [ToggleGroupItem ToggleGroup]])))

(def ui-toggle-group-item
  "No docstring available for ToggleGroupItem"
   #?(:cljs (h/factory-apply ToggleGroupItem)))

(def ui-toggle-group
  "No docstring available for ToggleGroup"
   #?(:cljs (h/factory-apply ToggleGroup)))
