(ns com.fulcrologic.shadcn-ui.components.ui.ui-textarea
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/textarea" :refer [Textarea]])))

(def ui-textarea
  "No docstring available for Textarea"
   #?(:cljs (h/factory-apply Textarea)))
