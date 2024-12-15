(ns fulcrologic.shadcn-ui.workspaces.badge-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.dom.html-entities :as ent]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.components.ui.ui-badge :refer [ui-badge]]))

(defsc UiBadge
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (let [spacer (dom/span nil ent/nbsp ent/nbsp ent/nbsp)]
    (comp/fragment
      (ui-badge {} "Badge")
      spacer
      (ui-badge {:variant "secondary"} "Badge")
      spacer
      (ui-badge {:variant "outline"} "Badge")
      spacer
      (ui-badge {:variant "destructive"} "Badge"))))


(ws/defcard ui-badge
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiBadge
     ::ct.fulcro/app        {}}))
