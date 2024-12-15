(ns com.fulcrologic.shadcn-ui.components.ui.ui-breadcrumb
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/breadcrumb" :refer [BreadcrumbSeparator BreadcrumbPage BreadcrumbList BreadcrumbLink BreadcrumbItem BreadcrumbEllipsis Breadcrumb]])))

(def ui-breadcrumb-separator
  "No docstring available for BreadcrumbSeparator"
   #?(:cljs (h/factory-apply BreadcrumbSeparator)))

(def ui-breadcrumb-page
  "No docstring available for BreadcrumbPage"
   #?(:cljs (h/factory-apply BreadcrumbPage)))

(def ui-breadcrumb-list
  "No docstring available for BreadcrumbList"
   #?(:cljs (h/factory-apply BreadcrumbList)))

(def ui-breadcrumb-link
  "No docstring available for BreadcrumbLink"
   #?(:cljs (h/factory-apply BreadcrumbLink)))

(def ui-breadcrumb-item
  "No docstring available for BreadcrumbItem"
   #?(:cljs (h/factory-apply BreadcrumbItem)))

(def ui-breadcrumb-ellipsis
  "No docstring available for BreadcrumbEllipsis"
   #?(:cljs (h/factory-apply BreadcrumbEllipsis)))

(def ui-breadcrumb
  "No docstring available for Breadcrumb"
   #?(:cljs (h/factory-apply Breadcrumb)))
