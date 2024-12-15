(ns fulcrologic.shadcn-ui.workspaces.toggle-group-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.lucide-icons :refer [bold-icon italic-icon underline-icon]]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-toggle-group ui-toggle-group-item]]))

(defsc UiToggleGroup
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-toggle-group {:type "multiple"}
    (ui-toggle-group-item {:value "bold" :aria-label "Toggle bold"}
      (bold-icon {:className "size-4"}))
    (ui-toggle-group-item {:value "italic" :aria-label "Toggle italic"}
      (italic-icon {:className "size-4"}))
    (ui-toggle-group-item {:value "underline" :aria-label "Toggle underline"}
      (underline-icon {:className "size-4"}))))


(ws/defcard ui-toggle-group
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiToggleGroup
     ::ct.fulcro/app        {}}))
