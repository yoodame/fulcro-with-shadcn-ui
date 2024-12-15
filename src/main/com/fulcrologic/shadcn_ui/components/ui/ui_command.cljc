(ns com.fulcrologic.shadcn-ui.components.ui.ui-command
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/command" :refer [CommandShortcut CommandSeparator CommandList CommandItem CommandInput CommandGroup CommandEmpty CommandDialog Command]])))

(def ui-command-shortcut
  "No docstring available for CommandShortcut"
   #?(:cljs (h/factory-apply CommandShortcut)))

(def ui-command-separator
  "No docstring available for CommandSeparator"
   #?(:cljs (h/factory-apply CommandSeparator)))

(def ui-command-list
  "No docstring available for CommandList"
   #?(:cljs (h/factory-apply CommandList)))

(def ui-command-item
  "No docstring available for CommandItem"
   #?(:cljs (h/factory-apply CommandItem)))

(def ui-command-input
  "No docstring available for CommandInput"
   #?(:cljs (h/factory-apply CommandInput)))

(def ui-command-group
  "No docstring available for CommandGroup"
   #?(:cljs (h/factory-apply CommandGroup)))

(def ui-command-empty
  "No docstring available for CommandEmpty"
   #?(:cljs (h/factory-apply CommandEmpty)))

(def ui-command-dialog
  "No docstring available for CommandDialog"
   #?(:cljs (h/factory-apply CommandDialog)))

(def ui-command
  "No docstring available for Command"
   #?(:cljs (h/factory-apply Command)))
