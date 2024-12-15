(ns fulcrologic.shadcn-ui.workspaces.aspect-ratio-card
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.components.ui.ui-aspect-ratio :refer [ui-aspect-ratio]]))


(defsc UiAspectRatio
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {:className "w-[450px]"}
    (ui-aspect-ratio {:ratio (/ 16 9)
                      :className "bg-muted"}
      (dom/img {:src "https://images.unsplash.com/photo-1588345921523-c2dcdb7f1dcd?w=800&dpr=2&q=80"
                :className "h-full w-full rounded-md object-cover"}))))

(ws/defcard ui-aspect-ratio
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiAspectRatio
     ::ct.fulcro/app        {}}))
