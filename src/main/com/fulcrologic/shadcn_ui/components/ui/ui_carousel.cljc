(ns com.fulcrologic.shadcn-ui.components.ui.ui-carousel
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/carousel" :refer [CarouselPrevious CarouselNext CarouselItem CarouselContent Carousel]])))

(def ui-carousel-previous
  "No docstring available for CarouselPrevious"
   #?(:cljs (h/factory-apply CarouselPrevious)))

(def ui-carousel-next
  "No docstring available for CarouselNext"
   #?(:cljs (h/factory-apply CarouselNext)))

(def ui-carousel-item
  "No docstring available for CarouselItem"
   #?(:cljs (h/factory-apply CarouselItem)))

(def ui-carousel-content
  "No docstring available for CarouselContent"
   #?(:cljs (h/factory-apply CarouselContent)))

(def ui-carousel
  "No docstring available for Carousel"
   #?(:cljs (h/factory-apply Carousel)))
