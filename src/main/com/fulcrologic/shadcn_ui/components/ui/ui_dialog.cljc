(ns com.fulcrologic.shadcn-ui.components.ui.ui-dialog
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/dialog" :refer [DialogTrigger DialogTitle DialogPortal DialogOverlay DialogHeader DialogFooter DialogDescription DialogContent DialogClose Dialog]])))

(def ui-dialog-trigger
  "No docstring available for DialogTrigger"
   #?(:cljs (h/factory-apply DialogTrigger)))

(def ui-dialog-title
  "No docstring available for DialogTitle"
   #?(:cljs (h/factory-apply DialogTitle)))

(def ui-dialog-portal
  "No docstring available for DialogPortal"
   #?(:cljs (h/factory-apply DialogPortal)))

(def ui-dialog-overlay
  "No docstring available for DialogOverlay"
   #?(:cljs (h/factory-apply DialogOverlay)))

(def ui-dialog-header
  "No docstring available for DialogHeader"
   #?(:cljs (h/factory-apply DialogHeader)))

(def ui-dialog-footer
  "No docstring available for DialogFooter"
   #?(:cljs (h/factory-apply DialogFooter)))

(def ui-dialog-description
  "No docstring available for DialogDescription"
   #?(:cljs (h/factory-apply DialogDescription)))

(def ui-dialog-content
  "No docstring available for DialogContent"
   #?(:cljs (h/factory-apply DialogContent)))

(def ui-dialog-close
  "No docstring available for DialogClose"
   #?(:cljs (h/factory-apply DialogClose)))

(def ui-dialog
  "No docstring available for Dialog"
   #?(:cljs (h/factory-apply Dialog)))
