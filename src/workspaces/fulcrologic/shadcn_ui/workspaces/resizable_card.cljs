(ns fulcrologic.shadcn-ui.workspaces.resizable-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-resizable-handle ui-resizable-panel ui-resizable-panel-group]]))

(defsc UiResizableCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-resizable-panel-group {:direction "horizontal"
                             :className "max-w-md rounded-lg border md:min-w-[450px]"}
    (ui-resizable-panel {:defaultSize 50}
      (dom/div {:className "flex h-[200px] items-center justify-center p-6"}
        (dom/span {:className "font-semibold"} "One")))
    (ui-resizable-handle {:withHandle true})
    (ui-resizable-panel {:defaultSize 50}
      (ui-resizable-panel-group {:direction "vertical"}
        (ui-resizable-panel {:defaultSize 25}
          (dom/div {:className "flex h-full items-center justify-center p-6"}
            (dom/span {:className "font-semibold"} "Two")))
        (ui-resizable-handle {})
        (ui-resizable-panel {:defaultSize 75}
          (dom/div {:className "flex h-full items-center justify-center p-6"}
            (dom/span {:className "font-semibold"} "Three")))))))

(ws/defcard ui-resizable-card
  {::wsm/card-width  6
   ::wsm/card-height 8}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiResizableCard
     ::ct.fulcro/app        {}}))
