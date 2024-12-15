(ns com.fulcrologic.shadcn-ui.components.ui.ui-alert-dialog
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/alert-dialog" :refer [AlertDialogTrigger AlertDialogTitle AlertDialogPortal AlertDialogOverlay AlertDialogHeader AlertDialogFooter AlertDialogDescription AlertDialogContent AlertDialogCancel AlertDialogAction AlertDialog]])))

(def ui-alert-dialog-trigger
  "AlertDialogTrigger 
A button that opens the dialog. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - [data-state] - open or closed"
   #?(:cljs (h/factory-apply AlertDialogTrigger)))

(def ui-alert-dialog-title
  "AlertDialogTitle 
An accessible name announced when the dialog is opened. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialogTitle)))

(def ui-alert-dialog-portal
  "AlertDialogPortal 
Portals the overlay and content into the body by default. 

 Props: 
    - forceMount (boolean | ) - Forces mounting when more control is needed, useful for controlling animations.
    - container (HTMLElement | document.body) - Specify a container element to portal the content into. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialogPortal)))

(def ui-alert-dialog-overlay
  "AlertDialogOverlay 
A layer that covers the inert portion of the view when the dialog is open. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props.
    - forceMount (boolean | ) - Forces mounting when more control is needed. Inherits from AlertDialog.Portal. 

 Data Attributes: 
    - [data-state] - open or closed"
   #?(:cljs (h/factory-apply AlertDialogOverlay)))

(def ui-alert-dialog-header
  "No docstring available for AlertDialogHeader"
   #?(:cljs (h/factory-apply AlertDialogHeader)))

(def ui-alert-dialog-footer
  "No docstring available for AlertDialogFooter"
   #?(:cljs (h/factory-apply AlertDialogFooter)))

(def ui-alert-dialog-description
  "AlertDialogDescription 
An accessible description announced when the dialog is opened. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialogDescription)))

(def ui-alert-dialog-content
  "AlertDialogContent 
Contains content to be rendered when the dialog is open. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props.
    - forceMount (boolean | ) - Forces mounting when more control is needed. Inherits from AlertDialog.Portal.
    - onOpenAutoFocus ((event: Event) => void | ) - Called when focus moves to the destructive action after opening. Can prevent by event.preventDefault.
    - onCloseAutoFocus ((event: Event) => void | ) - Called when focus moves to the trigger after closing. Can prevent by event.preventDefault.
    - onEscapeKeyDown ((event: KeyboardEvent) => void | ) - Called when the escape key is pressed. Can prevent by event.preventDefault. 

 Data Attributes: 
    - [data-state] - open or closed"
   #?(:cljs (h/factory-apply AlertDialogContent)))

(def ui-alert-dialog-cancel
  "AlertDialogCancel 
A button that closes the dialog, visually distinct from AlertDialog.Action. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialogCancel)))

(def ui-alert-dialog-action
  "AlertDialogAction 
A button that closes the dialog, visually distinct from AlertDialog.Cancel. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialogAction)))

(def ui-alert-dialog
  "AlertDialog 
A modal dialog that interrupts the user with important content and expects a response. 

 Props: 
    - defaultOpen (boolean | ) - The open state of the dialog when initially rendered. Use when you do not need to control its open state.
    - open (boolean | ) - The controlled open state of the dialog. Must be used in conjunction with onOpenChange.
    - onOpenChange ((open: boolean) => void | ) - Event handler called when the open state of the dialog changes. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply AlertDialog)))
