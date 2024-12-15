(ns com.fulcrologic.shadcn-ui.components.ui.ui-table
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/table" :refer [TableRow TableHeader TableHead TableFooter TableCell TableCaption TableBody Table]])))

(def ui-table-row
  "No docstring available for TableRow"
   #?(:cljs (h/factory-apply TableRow)))

(def ui-table-header
  "No docstring available for TableHeader"
   #?(:cljs (h/factory-apply TableHeader)))

(def ui-table-head
  "No docstring available for TableHead"
   #?(:cljs (h/factory-apply TableHead)))

(def ui-table-footer
  "No docstring available for TableFooter"
   #?(:cljs (h/factory-apply TableFooter)))

(def ui-table-cell
  "No docstring available for TableCell"
   #?(:cljs (h/factory-apply TableCell)))

(def ui-table-caption
  "No docstring available for TableCaption"
   #?(:cljs (h/factory-apply TableCaption)))

(def ui-table-body
  "No docstring available for TableBody"
   #?(:cljs (h/factory-apply TableBody)))

(def ui-table
  "No docstring available for Table"
   #?(:cljs (h/factory-apply Table)))
