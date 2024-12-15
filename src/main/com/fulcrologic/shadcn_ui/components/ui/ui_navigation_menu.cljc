(ns com.fulcrologic.shadcn-ui.components.ui.ui-navigation-menu
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/navigation-menu" :refer [NavigationMenuViewport NavigationMenuTrigger NavigationMenuList NavigationMenuLink NavigationMenuItem NavigationMenuIndicator NavigationMenuContent NavigationMenu]])))

(def ui-navigation-menu-viewport
  "No docstring available for NavigationMenuViewport"
   #?(:cljs (h/factory-apply NavigationMenuViewport)))

(def ui-navigation-menu-trigger
  "No docstring available for NavigationMenuTrigger"
   #?(:cljs (h/factory-apply NavigationMenuTrigger)))

(def ui-navigation-menu-list
  "No docstring available for NavigationMenuList"
   #?(:cljs (h/factory-apply NavigationMenuList)))

(def ui-navigation-menu-link
  "No docstring available for NavigationMenuLink"
   #?(:cljs (h/factory-apply NavigationMenuLink)))

(def ui-navigation-menu-item
  "No docstring available for NavigationMenuItem"
   #?(:cljs (h/factory-apply NavigationMenuItem)))

(def ui-navigation-menu-indicator
  "No docstring available for NavigationMenuIndicator"
   #?(:cljs (h/factory-apply NavigationMenuIndicator)))

(def ui-navigation-menu-content
  "No docstring available for NavigationMenuContent"
   #?(:cljs (h/factory-apply NavigationMenuContent)))

(def ui-navigation-menu
  "No docstring available for NavigationMenu"
   #?(:cljs (h/factory-apply NavigationMenu)))
