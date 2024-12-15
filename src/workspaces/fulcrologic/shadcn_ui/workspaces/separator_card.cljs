(ns fulcrologic.shadcn-ui.workspaces.separator-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-separator]]))

(defsc UiSeparator
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (dom/div {:className "space-y-1"}
      (dom/h4 {:className "text-sm font-medium leading-none"} "Radix Primitives")
      (dom/p {:className "text-sm text-muted-foreground"}
        "An open-source UI component library."))
    (ui-separator {:className "my-4"})
    (dom/div {:className "flex h-5 items-center space-x-4 text-sm"}
      (dom/div {} "Blog")
      (ui-separator {:orientation "vertical"})
      (dom/div {} "Docs")
      (ui-separator {:orientation "vertical"})
      (dom/div {} "Source"))))

(ws/defcard ui-separator
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSeparator
     ::ct.fulcro/app        {}}))
