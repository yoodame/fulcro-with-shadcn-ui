(ns fulcrologic.shadcn-ui.workspaces.tabs-card
  (:require
   [com.fulcrologic.fulcro.components :refer [defsc]]
   [com.fulcrologic.fulcro.dom :as dom]
   [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
   [nubank.workspaces.core :as ws]
   [nubank.workspaces.model :as wsm]
   [com.fulcrologic.shadcn-ui.factories :refer [ui-tabs ui-tabs-content ui-tabs-list ui-tabs-trigger ui-card ui-card-header ui-card-title ui-card-content]]))

(defsc UiTabs
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-tabs {:defaultValue "account" :className "w-[400px]"}
    (ui-tabs-list {:className "grid w-full grid-cols-2"}
      (ui-tabs-trigger {:value "account"} "Account")
      (ui-tabs-trigger {:value "password"} "Password"))
    (ui-tabs-content {:value "account"}
      (ui-card {}
        (ui-card-header {}
          (ui-card-title {} "Account"))
        (ui-card-content {} "Make changes to your account here.")))
    (ui-tabs-content {:value "password"}
      (ui-card {}
        (ui-card-header {}
          (ui-card-title {} "Password"))
        (ui-card-content {} "Change your password here.")))))

(ws/defcard ui-tabs
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiTabs
     ::ct.fulcro/app        {}}))
