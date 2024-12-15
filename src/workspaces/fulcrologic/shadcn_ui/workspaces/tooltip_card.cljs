(ns fulcrologic.shadcn-ui.workspaces.tooltip-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-tooltip ui-tooltip-content ui-tooltip-provider ui-tooltip-trigger ui-button]]))

(defsc UiTooltip
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-tooltip-provider {}
    (ui-tooltip {}
      (ui-tooltip-trigger {:asChild true}
        (ui-button {:variant "outline"} "Hover"))
      (ui-tooltip-content {}
        (dom/p "Add to library")))))

(ws/defcard ui-tooltip
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiTooltip
     ::ct.fulcro/app        {}}))
