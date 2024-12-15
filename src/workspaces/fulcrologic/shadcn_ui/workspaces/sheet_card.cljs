(ns fulcrologic.shadcn-ui.workspaces.sheet-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-sheet ui-sheet-close ui-sheet-content ui-sheet-description ui-sheet-header ui-sheet-title ui-sheet-footer ui-sheet-trigger ui-button ui-label ui-input]]))

(defsc UiSheet
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (ui-sheet {}
      (ui-sheet-trigger {:asChild true}
        (ui-button {:variant "outline"} "Open"))
      (ui-sheet-content {}
        (ui-sheet-header {}
          (ui-sheet-title {} "Edit profile")
          (ui-sheet-description {}
            "Make changes to your profile here. Click save when you're done."))
        (dom/div {:className "grid gap-4 py-4"}
          (dom/div {:className "grid grid-cols-4 items-center gap-4"}
            (ui-label {:htmlFor "name" :className "text-right"} "Name")
            (ui-input {:id "name" :value "Pedro Duarte" :className "col-span-3"}))
          (dom/div {:className "grid grid-cols-4 items-center gap-4"}
            (ui-label {:htmlFor "username" :className "text-right"} "Username")
            (ui-input {:id "username" :value "@peduarte" :className "col-span-3"})))
        (ui-sheet-footer {}
          (ui-sheet-close {:asChild true}
            (ui-button {:type "submit"} "Save changes")))))))

(ws/defcard ui-sheet
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiSheet
     ::ct.fulcro/app        {}}))
