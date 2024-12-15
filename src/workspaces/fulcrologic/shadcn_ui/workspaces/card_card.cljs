(ns fulcrologic.shadcn-ui.workspaces.card-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-card ui-card-content ui-card-description ui-card-footer ui-card-header ui-card-title ui-button]]))

(defsc UiCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-card {:className "w-[350px]"}
    (ui-card-header {}
      (ui-card-title {} "Create project")
      (ui-card-description {} "Deploy your new project in one-click."))
    (ui-card-content {:className "h-[100px]"}
      (ui-card-description {} "Card content area..."))
    (ui-card-footer {:className "flex justify-between"}
      (ui-button {:variant "outline"} "Cancel")
      (ui-button {} "Deploy"))))

(ws/defcard ui-card
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCard
     ::ct.fulcro/app        {}}))
