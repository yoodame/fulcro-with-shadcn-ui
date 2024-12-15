(ns fulcrologic.shadcn-ui.workspaces.toast-card
  (:require
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.components :as comp]
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom.html-entities :as ent]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.hooks :refer [use-toast]]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-toast-action ui-button ui-toaster]]))

(defsc UiToast
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}
   :use-hooks?    true}
  (let [{:keys [toast]} (use-toast)]
    (comp/fragment
      (ui-toaster) ;; Add the Toaster component to the UI
      (ui-button {:variant "outline"
                  :onClick #(toast (clj->js {:title       "Uh oh! Something went wrong."
                                             :description "This is a toast"
                                             :action (ui-toast-action {:altText "Try again"
                                                                       :onClick (fn [] (js/alert "Nice Try!"))}
                                                       "Try again")}))}
        "Show Toast"))))


(ws/defcard ui-toast
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiToast
     ::ct.fulcro/app        {}}))

