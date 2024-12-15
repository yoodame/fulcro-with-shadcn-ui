(ns fulcrologic.shadcn-ui.workspaces.radio-group-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-radio-group ui-radio-group-item ui-label]]))

(defsc UiRadioGroupCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-radio-group {:defaultValue "comfortable"}
    (dom/div {:className "flex items-center space-x-2"}
      (ui-radio-group-item {:value "default" :id "r1"})
      (ui-label {:htmlFor "r1"} "Default"))
    (dom/div {:className "flex items-center space-x-2"}
      (ui-radio-group-item {:value "comfortable" :id "r2"})
      (ui-label {:htmlFor "r2"} "Comfortable"))
    (dom/div {:className "flex items-center space-x-2"}
      (ui-radio-group-item {:value "compact" :id "r3"})
      (ui-label {:htmlFor "r3"} "Compact"))))


(ws/defcard ui-radio-group-card
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiRadioGroupCard
     ::ct.fulcro/app        {}}))
