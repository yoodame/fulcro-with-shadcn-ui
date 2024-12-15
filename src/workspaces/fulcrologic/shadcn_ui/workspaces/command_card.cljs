(ns fulcrologic.shadcn-ui.workspaces.command-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.lucide-icons :refer [calculator-icon calendar-icon credit-card-icon settings-icon smile-icon user-icon]]
    [com.fulcrologic.shadcn-ui.factories :refer [ui-command ui-command-empty ui-command-group ui-command-input ui-command-item ui-command-list ui-command-separator ui-command-shortcut]]))

(defsc UiCommandCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (ui-command {:className "rounded-lg border shadow-md md:min-w-[450px]"}
    (ui-command-input {:placeholder "Type a command or search..."})
    (ui-command-list {}
      (ui-command-empty {} "No results found.")
      (ui-command-group {:heading "Suggestions"}
        (ui-command-item {}
          (calendar-icon {})
          (dom/span {} "Calendar"))
        (ui-command-item {}
          (smile-icon {})
          (dom/span {} "Search Emoji"))
        (ui-command-item {:disabled true}
          (calculator-icon {})
          (dom/span {} "Calculator")))
      (ui-command-separator {})
      (ui-command-group {:heading "Settings"}
        (ui-command-item {}
          (user-icon {})
          (dom/span {} "Profile")
          (ui-command-shortcut {} "⌘P"))
        (ui-command-item {}
          (credit-card-icon {})
          (dom/span {} "Billing")
          (ui-command-shortcut {} "⌘B"))
        (ui-command-item {}
          (settings-icon {})
          (dom/span {} "Settings")
          (ui-command-shortcut {} "⌘S"))))))

(ws/defcard ui-command-card
  {::wsm/card-width  6
   ::wsm/card-height 11}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiCommandCard
     ::ct.fulcro/app        {}}))
