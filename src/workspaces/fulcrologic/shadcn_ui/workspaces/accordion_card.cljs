(ns fulcrologic.shadcn-ui.workspaces.accordion-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.components.ui.ui-accordion :refer [ui-accordion ui-accordion-item ui-accordion-trigger ui-accordion-content]]))

(defsc UiAccordion
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {:className "flex min-h-[350px] w-full justify-center p-10 items-center"}
    (ui-accordion {:type "single" :collapsible true :className "w-full"}
      (ui-accordion-item {:value "item-1"}
        (ui-accordion-trigger {} "Is it accessible?")
        (ui-accordion-content {} "Yes. It adheres to the WAI-ARIA design pattern."))
      (ui-accordion-item {:value "item-2"}
        (ui-accordion-trigger {} "Is it responsive?")
        (ui-accordion-content {} "Yes. It is responsive to different screen sizes."))
      (ui-accordion-item {:value "item-3"}
        (ui-accordion-trigger {} "Is it customizable?")
        (ui-accordion-content {} "Yes. It is customizable to fit your needs.")))))

(ws/defcard ui-accordion
  {::wsm/card-width  6
   ::wsm/card-height 10
   ::wsm/align       {:flex 1}}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiAccordion
     ::ct.fulcro/app        {}}))

