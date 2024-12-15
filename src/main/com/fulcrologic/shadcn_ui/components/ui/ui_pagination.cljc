(ns com.fulcrologic.shadcn-ui.components.ui.ui-pagination
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/pagination" :refer [PaginationPrevious PaginationNext PaginationLink PaginationItem PaginationEllipsis PaginationContent Pagination]])))

(def ui-pagination-previous
  "No docstring available for PaginationPrevious"
   #?(:cljs (h/factory-apply PaginationPrevious)))

(def ui-pagination-next
  "No docstring available for PaginationNext"
   #?(:cljs (h/factory-apply PaginationNext)))

(def ui-pagination-link
  "No docstring available for PaginationLink"
   #?(:cljs (h/factory-apply PaginationLink)))

(def ui-pagination-item
  "No docstring available for PaginationItem"
   #?(:cljs (h/factory-apply PaginationItem)))

(def ui-pagination-ellipsis
  "No docstring available for PaginationEllipsis"
   #?(:cljs (h/factory-apply PaginationEllipsis)))

(def ui-pagination-content
  "No docstring available for PaginationContent"
   #?(:cljs (h/factory-apply PaginationContent)))

(def ui-pagination
  "No docstring available for Pagination"
   #?(:cljs (h/factory-apply Pagination)))
