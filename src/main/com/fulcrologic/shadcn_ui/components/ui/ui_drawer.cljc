(ns com.fulcrologic.shadcn-ui.components.ui.ui-drawer
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/drawer" :refer [DrawerTrigger DrawerTitle DrawerPortal DrawerOverlay DrawerHeader DrawerFooter DrawerDescription DrawerContent DrawerClose Drawer]])))

(def ui-drawer-trigger
  "No docstring available for DrawerTrigger"
   #?(:cljs (h/factory-apply DrawerTrigger)))

(def ui-drawer-title
  "No docstring available for DrawerTitle"
   #?(:cljs (h/factory-apply DrawerTitle)))

(def ui-drawer-portal
  "No docstring available for DrawerPortal"
   #?(:cljs (h/factory-apply DrawerPortal)))

(def ui-drawer-overlay
  "No docstring available for DrawerOverlay"
   #?(:cljs (h/factory-apply DrawerOverlay)))

(def ui-drawer-header
  "No docstring available for DrawerHeader"
   #?(:cljs (h/factory-apply DrawerHeader)))

(def ui-drawer-footer
  "No docstring available for DrawerFooter"
   #?(:cljs (h/factory-apply DrawerFooter)))

(def ui-drawer-description
  "No docstring available for DrawerDescription"
   #?(:cljs (h/factory-apply DrawerDescription)))

(def ui-drawer-content
  "No docstring available for DrawerContent"
   #?(:cljs (h/factory-apply DrawerContent)))

(def ui-drawer-close
  "No docstring available for DrawerClose"
   #?(:cljs (h/factory-apply DrawerClose)))

(def ui-drawer
  "No docstring available for Drawer"
   #?(:cljs (h/factory-apply Drawer)))
