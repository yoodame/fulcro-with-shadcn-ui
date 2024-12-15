(ns com.fulcrologic.shadcn-ui.components.ui.ui-sheet
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/sheet" :refer [SheetTrigger SheetTitle SheetPortal SheetOverlay SheetHeader SheetFooter SheetDescription SheetContent SheetClose Sheet]])))

(def ui-sheet-trigger
  "No docstring available for SheetTrigger"
   #?(:cljs (h/factory-apply SheetTrigger)))

(def ui-sheet-title
  "No docstring available for SheetTitle"
   #?(:cljs (h/factory-apply SheetTitle)))

(def ui-sheet-portal
  "No docstring available for SheetPortal"
   #?(:cljs (h/factory-apply SheetPortal)))

(def ui-sheet-overlay
  "No docstring available for SheetOverlay"
   #?(:cljs (h/factory-apply SheetOverlay)))

(def ui-sheet-header
  "No docstring available for SheetHeader"
   #?(:cljs (h/factory-apply SheetHeader)))

(def ui-sheet-footer
  "No docstring available for SheetFooter"
   #?(:cljs (h/factory-apply SheetFooter)))

(def ui-sheet-description
  "No docstring available for SheetDescription"
   #?(:cljs (h/factory-apply SheetDescription)))

(def ui-sheet-content
  "No docstring available for SheetContent"
   #?(:cljs (h/factory-apply SheetContent)))

(def ui-sheet-close
  "No docstring available for SheetClose"
   #?(:cljs (h/factory-apply SheetClose)))

(def ui-sheet
  "No docstring available for Sheet"
   #?(:cljs (h/factory-apply Sheet)))
