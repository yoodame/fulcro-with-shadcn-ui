(ns fulcrologic.shadcn-ui.workspaces.checkbox-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-checkbox ui-label]]))

(defsc UiCheckboxCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {:className "flex items-center space-x-2"}
    (ui-checkbox {:id "terms"})
    (ui-label {:htmlFor "terms"} "Accept terms and conditions")))

(ws/defcard ui-checkbox-card
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCheckboxCard
     ::ct.fulcro/app        {}}))
