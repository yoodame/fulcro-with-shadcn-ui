(ns fulcrologic.shadcn-ui.workspaces.select-card

  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-select ui-select-content ui-select-group ui-select-item ui-select-label ui-select-trigger ui-select-value]]))

(defsc UiSelectCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-select {}
    (ui-select-trigger {:className "w-[180px]"}
      (ui-select-value {:placeholder "Select a fruit or vegetable"}))
    (ui-select-content {}
      (ui-select-group {}
        (ui-select-label {} "Fruits")
        (ui-select-item {:value "apple"} "Apple")
        (ui-select-item {:value "banana"} "Banana")
        (ui-select-item {:value "blueberry"} "Blueberry")
        (ui-select-item {:value "grapes"} "Grapes")
        (ui-select-item {:value "pineapple"} "Pineapple"))
      (ui-select-group {}
        (ui-select-label {} "Vegetables")
        (ui-select-item {:value "carrot"} "Carrot")
        (ui-select-item {:value "cucumber"} "Cucumber")
        (ui-select-item {:value "potato"} "Potato")
        (ui-select-item {:value "tomato"} "Tomato")))))

(ws/defcard ui-select-card
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSelectCard
     ::ct.fulcro/app        {}}))
