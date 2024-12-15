(ns com.fulcrologic.shadcn-ui.components.ui.ui-hover-card
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/hover-card" :refer [HoverCardTrigger HoverCardContent HoverCard]])))

(def ui-hover-card-trigger
  "No docstring available for HoverCardTrigger"
   #?(:cljs (h/factory-apply HoverCardTrigger)))

(def ui-hover-card-content
  "No docstring available for HoverCardContent"
   #?(:cljs (h/factory-apply HoverCardContent)))

(def ui-hover-card
  "No docstring available for HoverCard"
   #?(:cljs (h/factory-apply HoverCard)))
