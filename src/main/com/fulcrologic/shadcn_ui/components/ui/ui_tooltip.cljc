(ns com.fulcrologic.shadcn-ui.components.ui.ui-tooltip
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/tooltip" :refer [TooltipTrigger TooltipProvider TooltipContent Tooltip]])))

(def ui-tooltip-trigger
  "No docstring available for TooltipTrigger"
   #?(:cljs (h/factory-apply TooltipTrigger)))

(def ui-tooltip-provider
  "No docstring available for TooltipProvider"
   #?(:cljs (h/factory-apply TooltipProvider)))

(def ui-tooltip-content
  "No docstring available for TooltipContent"
   #?(:cljs (h/factory-apply TooltipContent)))

(def ui-tooltip
  "No docstring available for Tooltip"
   #?(:cljs (h/factory-apply Tooltip)))
