(ns com.fulcrologic.shadcn-ui.components.ui.ui-chart
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/chart" :refer [ChartTooltipContent ChartTooltip ChartStyle ChartLegendContent ChartLegend ChartContainer]])))

(def ui-chart-tooltip-content
  "No docstring available for ChartTooltipContent"
   #?(:cljs (h/factory-apply ChartTooltipContent)))

(def ui-chart-tooltip
  "No docstring available for ChartTooltip"
   #?(:cljs (h/factory-apply ChartTooltip)))

(def ui-chart-style
  "No docstring available for ChartStyle"
   #?(:cljs (h/factory-apply ChartStyle)))

(def ui-chart-legend-content
  "No docstring available for ChartLegendContent"
   #?(:cljs (h/factory-apply ChartLegendContent)))

(def ui-chart-legend
  "No docstring available for ChartLegend"
   #?(:cljs (h/factory-apply ChartLegend)))

(def ui-chart-container
  "No docstring available for ChartContainer"
   #?(:cljs (h/factory-apply ChartContainer)))
