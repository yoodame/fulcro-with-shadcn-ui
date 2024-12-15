(ns com.fulcrologic.shadcn-ui.components.ui.ui-tabs
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/tabs" :refer [TabsTrigger TabsList TabsContent Tabs]])))

(def ui-tabs-trigger
  "No docstring available for TabsTrigger"
   #?(:cljs (h/factory-apply TabsTrigger)))

(def ui-tabs-list
  "No docstring available for TabsList"
   #?(:cljs (h/factory-apply TabsList)))

(def ui-tabs-content
  "No docstring available for TabsContent"
   #?(:cljs (h/factory-apply TabsContent)))

(def ui-tabs
  "No docstring available for Tabs"
   #?(:cljs (h/factory-apply Tabs)))
