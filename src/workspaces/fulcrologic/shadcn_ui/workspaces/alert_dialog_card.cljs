(ns fulcrologic.shadcn-ui.workspaces.alert-dialog-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.components.ui.ui-button :refer [ui-button]]
            [com.fulcrologic.shadcn-ui.components.ui.ui-alert-dialog :refer [ui-alert-dialog ui-alert-dialog-trigger ui-alert-dialog-content ui-alert-dialog-header ui-alert-dialog-title ui-alert-dialog-description ui-alert-dialog-footer ui-alert-dialog-cancel ui-alert-dialog-action]]))

(defsc UiAlertDialog
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
   (ui-alert-dialog {}
     (ui-alert-dialog-trigger {:asChild true}
       (ui-button {:variant "outline"} "Show Dialog"))
     (ui-alert-dialog-content {}
       (ui-alert-dialog-header {}
         (ui-alert-dialog-title {} "Are you absolutely sure?")
         (ui-alert-dialog-description {}
           "This action cannot be undone. This will permanently delete your account and remove your data from our servers."))
       (ui-alert-dialog-footer {}
         (ui-alert-dialog-cancel {} "Cancel")
         (ui-alert-dialog-action {} "Continue")))))

(ws/defcard ui-alert-dialog
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiAlertDialog
     ::ct.fulcro/app        {}}))
