(ns fulcrologic.shadcn-ui.workspaces.carousel-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-carousel ui-carousel-item ui-carousel-content ui-carousel-previous ui-carousel-next ui-card ui-card-content]]))

(defsc UiCarousel
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-carousel {:className "w-[350px]"}
    (ui-carousel-content {}
      (mapv
        (fn [i]
          (ui-carousel-item {:key i
                             :className "md:basis-1/2 lg:basis-1/3"}
            (dom/div {:className "p-1"}
              (ui-card {}
               (ui-card-content {:className "flex aspect-square items-center justify-center p-6"}
                 (dom/span {:className "text-3xl font-semibold"}
                   (str (+ i 1))))))))
        (range 5)))
      (ui-carousel-previous {})
      (ui-carousel-next {})))

(ws/defcard ui-carousel
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCarousel
     ::ct.fulcro/app        {}}))
