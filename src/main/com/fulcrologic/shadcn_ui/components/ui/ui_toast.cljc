(ns com.fulcrologic.shadcn-ui.components.ui.ui-toast
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/toast" :refer [ToastViewport ToastTitle ToastProvider ToastDescription ToastClose ToastAction Toast]])))

(def ui-toast-viewport
  "No docstring available for ToastViewport"
   #?(:cljs (h/factory-apply ToastViewport)))

(def ui-toast-title
  "No docstring available for ToastTitle"
   #?(:cljs (h/factory-apply ToastTitle)))

(def ui-toast-provider
  "No docstring available for ToastProvider"
   #?(:cljs (h/factory-apply ToastProvider)))

(def ui-toast-description
  "No docstring available for ToastDescription"
   #?(:cljs (h/factory-apply ToastDescription)))

(def ui-toast-close
  "No docstring available for ToastClose"
   #?(:cljs (h/factory-apply ToastClose)))

(def ui-toast-action
  "No docstring available for ToastAction"
   #?(:cljs (h/factory-apply ToastAction)))

(def ui-toast
  "No docstring available for Toast"
   #?(:cljs (h/factory-apply Toast)))
