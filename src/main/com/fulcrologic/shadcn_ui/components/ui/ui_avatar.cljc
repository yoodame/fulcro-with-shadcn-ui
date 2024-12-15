(ns com.fulcrologic.shadcn-ui.components.ui.ui-avatar
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/avatar" :refer [AvatarImage AvatarFallback Avatar]])))

(def ui-avatar-image
  "No docstring available for AvatarImage"
   #?(:cljs (h/factory-apply AvatarImage)))

(def ui-avatar-fallback
  "No docstring available for AvatarFallback"
   #?(:cljs (h/factory-apply AvatarFallback)))

(def ui-avatar
  "No docstring available for Avatar"
   #?(:cljs (h/factory-apply Avatar)))
