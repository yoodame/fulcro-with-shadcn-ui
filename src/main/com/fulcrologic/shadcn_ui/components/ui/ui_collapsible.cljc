(ns com.fulcrologic.shadcn-ui.components.ui.ui-collapsible
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/collapsible" :refer [CollapsibleTrigger CollapsibleContent Collapsible]])))

(def ui-collapsible-trigger
  "No docstring available for CollapsibleTrigger"
   #?(:cljs (h/factory-apply CollapsibleTrigger)))

(def ui-collapsible-content
  "No docstring available for CollapsibleContent"
   #?(:cljs (h/factory-apply CollapsibleContent)))

(def ui-collapsible
  "No docstring available for Collapsible"
   #?(:cljs (h/factory-apply Collapsible)))
