(ns fulcrologic.shadcn-ui.workspaces.progress-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.react.hooks :as hooks]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-progress]]))

(defsc UiProgressCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}
   :use-hooks?     true}
  (let [[progress set-progress] (hooks/useState 13)]
    (hooks/use-effect
      (fn []
        (let [timer (js/setTimeout #(set-progress 66) 500)]
          (fn [] (js/clearTimeout timer))))
      #js [])
    (dom/div {:className "w-full h-full flex items-center justify-center"}
      (ui-progress {:value progress :className "w-[60%]"}))))

(ws/defcard ui-progress-card
  {::wsm/card-width  6
   ::wsm/card-height 6
   ::wsm/align {:flex 1}}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiProgressCard
     ::ct.fulcro/app        {}}))

