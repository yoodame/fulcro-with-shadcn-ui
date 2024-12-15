(ns fulcrologic.shadcn-ui.workspaces.slider-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-slider]]))

(defsc UiSlider
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (ui-slider {:id "slider"
                :defaultValue [30]
                :max 100
                :step 1
                :className "w-[300px]"})))

(ws/defcard ui-slider
  {::wsm/card-width  6
   ::wsm/card-height 6}

  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSlider
     ::ct.fulcro/app        {}}))
