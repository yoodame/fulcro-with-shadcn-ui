(ns com.fulcrologic.shadcn-ui.components.ui.ui-resizable
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/resizable" :refer [ResizablePanelGroup ResizablePanel ResizableHandle]])))

(def ui-resizable-panel-group
  "No docstring available for ResizablePanelGroup"
   #?(:cljs (h/factory-apply ResizablePanelGroup)))

(def ui-resizable-panel
  "No docstring available for ResizablePanel"
   #?(:cljs (h/factory-apply ResizablePanel)))

(def ui-resizable-handle
  "No docstring available for ResizableHandle"
   #?(:cljs (h/factory-apply ResizableHandle)))
