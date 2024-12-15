(ns fulcrologic.shadcn-ui.workspaces.context-menu-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-context-menu ui-context-menu-checkbox-item ui-context-menu-content ui-context-menu-item ui-context-menu-label ui-context-menu-radio-group ui-context-menu-radio-item ui-context-menu-separator ui-context-menu-shortcut ui-context-menu-sub ui-context-menu-sub-content ui-context-menu-sub-trigger ui-context-menu-trigger]]))

(defsc UiContextMenuCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-context-menu {}
    (ui-context-menu-trigger {:className "flex h-[150px] w-[300px] items-center justify-center rounded-md border border-dashed text-sm"}
      "Right click here")
    (ui-context-menu-content {:className "w-64"}
      (ui-context-menu-item {:inset true}
        "Back"
        (ui-context-menu-shortcut {} "⌘["))
      (ui-context-menu-item {:inset true :disabled true}
        "Forward"
        (ui-context-menu-shortcut {} "⌘]"))
      (ui-context-menu-item {:inset true}
        "Reload"
        (ui-context-menu-shortcut {} "⌘R"))
      (ui-context-menu-sub {}
        (ui-context-menu-sub-trigger {:inset true} "More Tools")
        (ui-context-menu-sub-content {:className "w-48"}
          (ui-context-menu-item {}
            "Save Page As..."
            (ui-context-menu-shortcut {} "⇧⌘S"))
          (ui-context-menu-item {} "Create Shortcut...")
          (ui-context-menu-item {} "Name Window...")
          (ui-context-menu-separator {})
          (ui-context-menu-item {} "Developer Tools")))
      (ui-context-menu-separator {})
      (ui-context-menu-checkbox-item {:checked true}
        "Show Bookmarks Bar"
        (ui-context-menu-shortcut {} "⌘⇧B"))
      (ui-context-menu-checkbox-item {} "Show Full URLs")
      (ui-context-menu-separator {})
      (ui-context-menu-radio-group {:value "pedro"}
        (ui-context-menu-label {:inset true} "People")
        (ui-context-menu-separator {})
        (ui-context-menu-radio-item {:value "pedro"} "Pedro Duarte")
        (ui-context-menu-radio-item {:value "colm"} "Colm Tuite")))))

(ws/defcard ui-context-menu-card
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiContextMenuCard
     ::ct.fulcro/app        {}}))
