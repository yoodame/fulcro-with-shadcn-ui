(ns fulcrologic.shadcn-ui.workspaces.switch-card

  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-switch ui-label]]))

(defsc UiSwitch
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {:className "flex items-center space-x-2"}
    (ui-switch {:id "airplane-mode"})
    (ui-label {} "Airplane Mode")))

(ws/defcard ui-switch
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSwitch
     ::ct.fulcro/app        {}}))
