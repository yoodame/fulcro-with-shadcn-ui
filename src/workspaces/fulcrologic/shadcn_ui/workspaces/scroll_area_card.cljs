(ns fulcrologic.shadcn-ui.workspaces.scroll-area-card
  (:require
    [com.fulcrologic.fulcro.components :as comp]
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-scroll-area ui-separator]]))

(defsc UiScrollAreaCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-scroll-area {:className "h-72 w-48 rounded-md border"}
    (dom/div {:className "p-4"}
      (dom/h4 {:className "mb-4 text-sm font-medium leading-none"} "Tags")
      (->> (reverse (vec (range 50)))
        (map #(str "v1.2.0-beta." (+ 1 %)))
        (map #(comp/fragment
                (dom/div {:key % :className "text-sm"} %)
                (ui-separator {:className "my-2"})))))))

(ws/defcard ui-scroll-area-card
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiScrollAreaCard
     ::ct.fulcro/app        {}}))
