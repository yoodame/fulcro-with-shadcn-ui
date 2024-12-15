(ns com.fulcrologic.shadcn-ui.components.ui.ui-form
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/form" :refer [FormMessage FormLabel FormItem FormField FormDescription FormControl Form]])))

(def ui-form-message
  "No docstring available for FormMessage"
   #?(:cljs (h/factory-apply FormMessage)))

(def ui-form-label
  "No docstring available for FormLabel"
   #?(:cljs (h/factory-apply FormLabel)))

(def ui-form-item
  "No docstring available for FormItem"
   #?(:cljs (h/factory-apply FormItem)))

(def ui-form-field
  "No docstring available for FormField"
   #?(:cljs (h/factory-apply FormField)))

(def ui-form-description
  "No docstring available for FormDescription"
   #?(:cljs (h/factory-apply FormDescription)))

(def ui-form-control
  "No docstring available for FormControl"
   #?(:cljs (h/factory-apply FormControl)))

(def ui-form
  "No docstring available for Form"
   #?(:cljs (h/factory-apply Form)))
