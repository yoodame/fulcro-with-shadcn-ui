(ns fulcrologic.shadcn-ui.workspaces.alert-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.lucide-icons :refer [terminal-icon alert-circle-icon]]
            [com.fulcrologic.shadcn-ui.components.ui.ui-alert :refer [ui-alert ui-alert-title ui-alert-description]]))

(defsc UiAlert
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (comp/fragment
    (dom/div {:className "flex w-full justify-center p-8 items-center"}
      (ui-alert {}
        (terminal-icon {:className "h-4 w-4"})
        (ui-alert-title {} "Heads up!")
        (ui-alert-description {} "You can add components to your app using the cli.")))
    (dom/div {:className "flex w-full justify-center p-8 items-center"}
      (ui-alert {:variant "destructive"}
        (alert-circle-icon {:className "h-4 w-4"})
        (ui-alert-title {} "Error")
        (ui-alert-description {} "Your session has expired. Please log in again.")))))

(ws/defcard ui-alert
  {::wsm/card-width  6
   ::wsm/card-height 10
   ::wsm/align       {:flex 1}}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiAlert
     ::ct.fulcro/app        {}}))
