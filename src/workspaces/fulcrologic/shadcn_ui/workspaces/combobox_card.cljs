(ns fulcrologic.shadcn-ui.workspaces.combobox-card
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [com.fulcrologic.fulcro.dom :as dom]
    [com.fulcrologic.fulcro.react.hooks :as hooks]
    [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
    [nubank.workspaces.core :as ws]
    [nubank.workspaces.model :as wsm]
    [com.fulcrologic.shadcn-ui.lucide-icons :refer [check-icon chevrons-up-down-icon]]
    [com.fulcrologic.shadcn-ui.components.ui.ui-button :refer [ui-button]]
    [com.fulcrologic.shadcn-ui.components.ui.ui-command :refer [ui-command ui-command-empty ui-command-group ui-command-input ui-command-item ui-command-list]]
    [com.fulcrologic.shadcn-ui.components.ui.ui-popover :refer [ui-popover ui-popover-content ui-popover-trigger]]))


(defsc UiComboboxCard
  [this {:keys [ui/fireworks]}]
  {:query         [:ui/fireworks]
   :ident         (fn [] [::id "singleton"])
   :use-hooks?    true}
  (let [[open set-open] (hooks/useState false)
        [value set-value] (hooks/useState "")]
    (ui-popover {:open open
                 :onOpenChange set-open}
      (ui-popover-trigger {:asChild true}
        (ui-button {:variant "outline"
                    :role "combobox"
                    :aria-expanded open
                    :className "w-[200px] justify-between"}
          (if (and (some? value) (seq value))
            (some->> (filter #(= (:value %) value) fireworks) first :label)
            "Select framework...")
          (chevrons-up-down-icon {:className "opacity-50"})))
      (ui-popover-content {:className "w-[200px] p-0"}
        (ui-command {}
          (ui-command-input {:placeholder "Search framework..." :className "h-9"})
          (ui-command-list {}
            (ui-command-empty {} "No framework found.")
            (ui-command-group {}
              (map #(ui-command-item
                      {:key (:value %)
                       :value (:value %)
                       :onSelect (fn [current-value]
                                   (set-value (if (= current-value value) "" current-value))
                                   (set-open false))}
                      (:label %)
                      (check-icon {:className (str "ml-auto " (if (= value (:value %)) "opacity-100" "opacity-0"))}))
                fireworks))))))))



(ws/defcard ui-combobox-card
  {::wsm/card-width  6
   ::wsm/card-height 6}
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root       UiComboboxCard
     ::ct.fulcro/initial-state {:ui/fireworks [{:value "next.js" :label "Next.js"}
                                               {:value "nuxt.js" :label "Nuxt.js"}
                                               {:value "remix" :label "Remix"}
                                               {:value "astro" :label "Astro"}]}}))
