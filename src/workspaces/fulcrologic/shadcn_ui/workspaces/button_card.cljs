(ns fulcrologic.shadcn-ui.workspaces.button-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.dom.html-entities :as ent]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-button]]))

(defsc UiButton
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (let [spacer (dom/span nil ent/nbsp ent/nbsp ent/nbsp)]
    (dom/div {}
      (ui-button {} "Button")
      spacer
      (ui-button {:variant "secondary"} "Secondary")
      spacer
      (ui-button {:variant "destructive"} "Destructive")
      spacer
      (ui-button {:variant "outline"} "Outline"))))

(ws/defcard ui-button
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiButton
     ::ct.fulcro/app        {}}))


