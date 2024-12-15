(ns fulcrologic.shadcn-ui.workspaces.avatar-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.components.ui.ui-avatar :refer [ui-avatar ui-avatar-image ui-avatar-fallback]]))

(defsc UiAvatar
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-avatar {}
    (ui-avatar-image {:src  "https://github.com/shadcn.png"
                      :alt  "@shadcn"})
    (ui-avatar-fallback {} "CN")))


(ws/defcard ui-avatar
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiAvatar
     ::ct.fulcro/app        {}}))
