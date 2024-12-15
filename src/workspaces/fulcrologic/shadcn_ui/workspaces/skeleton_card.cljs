(ns fulcrologic.shadcn-ui.workspaces.skeleton-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-skeleton]]))

(defsc UiSkeleton
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {:className "flex items-center space-x-4"}
    (ui-skeleton {:className "h-12 w-12 rounded-full"})
    (dom/div {:className "space-y-2"}
      (ui-skeleton {:className "h-4 w-[250px]"})
      (ui-skeleton {:className "h-4 w-[200px]"}))))

(ws/defcard ui-skeleton
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSkeleton
     ::ct.fulcro/app        {}}))
