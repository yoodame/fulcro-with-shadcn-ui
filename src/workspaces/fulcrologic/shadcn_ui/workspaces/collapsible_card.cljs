(ns fulcrologic.shadcn-ui.workspaces.collapsible-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.react.hooks :as hooks]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.lucide-icons :refer [chevrons-up-down-icon]]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-collapsible ui-collapsible-content ui-collapsible-trigger ui-button]]))

(defsc UiCollapsibleCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}
   :use-hooks?     true}
  (let [[is-open set-open] (hooks/useState false)]
    (ui-collapsible {:open is-open
                     :onOpenChange set-open
                     :className "w-[350px] space-y-2"}
      (dom/div {:className "flex items-center justify-between space-x-4 px-4"}
        (dom/h4 {:className "text-sm font-semibold"}
          "@peduarte starred 3 repositories")
        (ui-collapsible-trigger {:asChild true}
          (ui-button {:variant "ghost" :size "sm"}
            (chevrons-up-down-icon {:className "h-4 w-4"})
            (dom/span {:className "sr-only"} "Toggle"))))
      (dom/div {:className "rounded-md border px-4 py-2 font-mono text-sm shadow-sm"}
        "@radix-ui/primitives")
      (ui-collapsible-content {:className "space-y-2"}
        (dom/div {:className "rounded-md border px-4 py-2 font-mono text-sm shadow-sm"}
          "@radix-ui/colors")
        (dom/div {:className "rounded-md border px-4 py-2 font-mono text-sm shadow-sm"}
          "@stitches/react")))))

(ws/defcard ui-collapsible-card
  {::wsm/card-width  6
   ::wsm/card-height 8}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCollapsibleCard
     ::ct.fulcro/app        {}}))
