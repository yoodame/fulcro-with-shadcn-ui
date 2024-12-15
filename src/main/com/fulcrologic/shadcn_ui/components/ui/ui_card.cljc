(ns com.fulcrologic.shadcn-ui.components.ui.ui-card
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/card" :refer [CardTitle CardHeader CardFooter CardDescription CardContent Card]])))

(def ui-card-title
  "No docstring available for CardTitle"
   #?(:cljs (h/factory-apply CardTitle)))

(def ui-card-header
  "No docstring available for CardHeader"
   #?(:cljs (h/factory-apply CardHeader)))

(def ui-card-footer
  "No docstring available for CardFooter"
   #?(:cljs (h/factory-apply CardFooter)))

(def ui-card-description
  "No docstring available for CardDescription"
   #?(:cljs (h/factory-apply CardDescription)))

(def ui-card-content
  "No docstring available for CardContent"
   #?(:cljs (h/factory-apply CardContent)))

(def ui-card
  "No docstring available for Card"
   #?(:cljs (h/factory-apply Card)))
