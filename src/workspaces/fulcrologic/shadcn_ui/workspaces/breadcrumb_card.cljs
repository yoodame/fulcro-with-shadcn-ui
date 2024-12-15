(ns fulcrologic.shadcn-ui.workspaces.breadcrumb-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.lucide-icons :refer [slash-icon]]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-breadcrumb ui-breadcrumb-item ui-breadcrumb-separator ui-breadcrumb-link ui-breadcrumb-list ui-breadcrumb-page]]))

(defsc UiBreadcrumb
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-breadcrumb {}
    (ui-breadcrumb-list {}
      (ui-breadcrumb-item {}
        (ui-breadcrumb-link {:href ""} "Home"))
      (ui-breadcrumb-separator {}
        (slash-icon))
      (ui-breadcrumb-item {}
        (ui-breadcrumb-link {:href ""} "Account"))
      (ui-breadcrumb-separator {}
        (slash-icon))
      (ui-breadcrumb-item {}
        (ui-breadcrumb-page {} "Settings")))))

(ws/defcard ui-breadcrumb
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiBreadcrumb
     ::ct.fulcro/app        {}}))
