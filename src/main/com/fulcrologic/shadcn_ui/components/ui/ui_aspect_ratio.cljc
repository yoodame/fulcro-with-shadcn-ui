(ns com.fulcrologic.shadcn-ui.components.ui.ui-aspect-ratio
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/aspect-ratio" :refer [AspectRatio]])))

(def ui-aspect-ratio
  "AspectRatio 
Displays content within a desired ratio. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props.
    - ratio (number | 1) - The desired ratio for the content. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AspectRatio)))
