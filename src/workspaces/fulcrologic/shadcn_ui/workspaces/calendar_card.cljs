(ns fulcrologic.shadcn-ui.workspaces.calendar-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.fulcro.react.hooks :as hooks]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.model :as wsm]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-calendar]]))

(defsc UiCalendar
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}
   :use-hooks?    true}
  (let [[date set-date] (hooks/use-state (js/Date.))]
    (dom/div {}
      (ui-calendar {:mode "single"
                    :selected date
                    :onSelect set-date}
                    :className "rounded-md border shadow"))))

(ws/defcard ui-calendar
  {::wsm/card-width  6
   ::wsm/card-height 10}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCalendar
     ::ct.fulcro/app        {}}))
