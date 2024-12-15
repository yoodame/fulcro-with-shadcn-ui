(ns fulcrologic.shadcn-ui.workspaces.toggle-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.dom.html-entities :as ent]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.lucide-icons :refer [bold-icon italic-icon underline-icon]]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-toggle]]))

(defsc UiToggle
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (let [spacer (dom/span nil ent/nbsp ent/nbsp ent/nbsp)]
    (comp/fragment
      (ui-toggle {:pressed true :aria-label "Toggle bold"}
        (bold-icon {:className "size-4"}))
      spacer
      (ui-toggle {:variant "outline" :aria-label "Toggle italic"}
        (italic-icon {:className "size-4"}))
      spacer
      (ui-toggle {:aria-label "Toggle italic"}
        (italic-icon {:className "size-4"})
        "Italic")
      spacer
      (ui-toggle {:variant "outline" :aria-label "Toggle italic"}
        (italic-icon {:className "size-4"})
        "Italic"))))

(ws/defcard ui-toggle
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiToggle
     ::ct.fulcro/app        {}}))
