(ns com.fulcrologic.shadcn-ui.components.ui.ui-accordion
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/accordion" :refer [AccordionTrigger AccordionItem AccordionContent Accordion]])))

(def ui-accordion-trigger
  "AccordionTrigger 
Toggles the collapsed state of its associated item. 

 Props: 
    - asChild (boolean | false) - When true, changes the rendered element to the one passed as a child, merging their props. 

 Data Attributes: 
    - [data-state] - open or closed
    - [data-disabled] - Present when disabled
    - [data-orientation] - vertical or horizontal"
   #?(:cljs (h/factory-apply AccordionTrigger)))

(def ui-accordion-item
  "AccordionItem 
Contains all the parts of a collapsible section. 

 Props: 
    - asChild (boolean | false) - When true, changes the rendered element to the one passed as a child, merging their props.
    - disabled (boolean | false) - When true, prevents the user from interacting with this item.
    - value (string | ) - A unique string value that identifies the item. 

 Data Attributes: 
    - [data-state] - open or closed
    - [data-disabled] - Present when disabled
    - [data-orientation] - vertical or horizontal"
   #?(:cljs (h/factory-apply AccordionItem)))

(def ui-accordion-content
  "AccordionContent 
Contains the collapsible content for an item. 

 Props: 
    - asChild (boolean | false) - When true, changes the rendered element to the one passed as a child, merging their props.
    - forceMount (boolean | ) - Forces the content to remain mounted when closed, useful for animations. 

 Data Attributes: 
    - [data-state] - open or closed
    - [data-disabled] - Present when disabled
    - [data-orientation] - vertical or horizontal"
   #?(:cljs (h/factory-apply AccordionContent)))

(def ui-accordion
  "Accordion 
Contains all the parts of an accordion. 

 Props: 
    - asChild (boolean | false) - When true, changes the rendered element to the one passed as a child, merging their props.
    - type (single | multiple | ) - Determines whether one (single) or multiple (multiple) items can be opened at once.
    - value (string | ) - Controlled value of the opened item when type=single. Must be used with onValueChange.
    - defaultValue (string | ) - Initial open item value when rendered and type=single, for uncontrolled usage.
    - onValueChange ((value: string) => void | ) - Callback when expanded state of item changes (type=single).
    - value (string[] | []) - Controlled values of opened items when type=multiple. Must be used with onValueChange.
    - defaultValue (string[] | []) - Initial array of opened items when rendered and type=multiple, for uncontrolled usage.
    - onValueChange ((value: string[]) => void | ) - Callback when expanded state of items changes (type=multiple).
    - collapsible (boolean | false) - When type=single, allows all items to be closed by clicking the open item again.
    - disabled (boolean | false) - When true, prevents user interaction with the entire accordion.
    - dir (ltr | rtl | ltr) - Reading direction. If omitted, assumes LTR.
    - orientation (horizontal | vertical | vertical) - The orientation of the accordion. 

 Data Attributes: 
    - [data-orientation] - vertical or horizontal"
   #?(:cljs (h/factory-apply Accordion)))
