(ns com.fulcrologic.shadcn-ui.factories
   (:require
     #?(:cljs ["/shadcn-ui" :as suir])
     [com.fulcrologic.shadcn-ui.factory-helpers :as h]))

(def ui-accordion-trigger
  "AccordionTrigger 
Toggles the collapsed state of its associated item. 

 Props: 
    - asChild (boolean | false) - When true, changes the rendered element to the one passed as a child, merging their props. 

 Data Attributes: 
    - [data-state] - open or closed
    - [data-disabled] - Present when disabled
    - [data-orientation] - vertical or horizontal"
   #?(:cljs (h/factory-apply suir/AccordionTrigger)))

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
   #?(:cljs (h/factory-apply suir/AccordionItem)))

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
   #?(:cljs (h/factory-apply suir/AccordionContent)))

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
   #?(:cljs (h/factory-apply suir/Accordion)))

(def ui-alert-title
  "No docstring available for AlertTitle"
   #?(:cljs (h/factory-apply suir/AlertTitle)))

(def ui-alert-description
  "No docstring available for AlertDescription"
   #?(:cljs (h/factory-apply suir/AlertDescription)))

(def ui-alert
  "No docstring available for Alert"
   #?(:cljs (h/factory-apply suir/Alert)))

(def ui-alert-dialog-trigger
  "AlertDialogTrigger 
A button that opens the dialog. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - [data-state] - open or closed"
   #?(:cljs (h/factory-apply suir/AlertDialogTrigger)))

(def ui-alert-dialog-title
  "AlertDialogTitle 
An accessible name announced when the dialog is opened. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialogTitle)))

(def ui-alert-dialog-portal
  "AlertDialogPortal 
Portals the overlay and content into the body by default. 

 Props: 
    - forceMount (boolean | ) - Forces mounting when more control is needed, useful for controlling animations.
    - container (HTMLElement | document.body) - Specify a container element to portal the content into. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialogPortal)))

(def ui-alert-dialog-overlay
  "AlertDialogOverlay 
A layer that covers the inert portion of the view when the dialog is open. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props.
    - forceMount (boolean | ) - Forces mounting when more control is needed. Inherits from AlertDialog.Portal. 

 Data Attributes: 
    - [data-state] - open or closed"
   #?(:cljs (h/factory-apply suir/AlertDialogOverlay)))

(def ui-alert-dialog-header
  "No docstring available for AlertDialogHeader"
   #?(:cljs (h/factory-apply suir/AlertDialogHeader)))

(def ui-alert-dialog-footer
  "No docstring available for AlertDialogFooter"
   #?(:cljs (h/factory-apply suir/AlertDialogFooter)))

(def ui-alert-dialog-description
  "AlertDialogDescription 
An accessible description announced when the dialog is opened. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialogDescription)))

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
   #?(:cljs (h/factory-apply suir/AlertDialogContent)))

(def ui-alert-dialog-cancel
  "AlertDialogCancel 
A button that closes the dialog, visually distinct from AlertDialog.Action. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialogCancel)))

(def ui-alert-dialog-action
  "AlertDialogAction 
A button that closes the dialog, visually distinct from AlertDialog.Cancel. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialogAction)))

(def ui-alert-dialog
  "AlertDialog 
A modal dialog that interrupts the user with important content and expects a response. 

 Props: 
    - defaultOpen (boolean | ) - The open state of the dialog when initially rendered. Use when you do not need to control its open state.
    - open (boolean | ) - The controlled open state of the dialog. Must be used in conjunction with onOpenChange.
    - onOpenChange ((open: boolean) => void | ) - Event handler called when the open state of the dialog changes. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AlertDialog)))

(def ui-aspect-ratio
  "AspectRatio 
Displays content within a desired ratio. 

 Props: 
    - asChild (boolean | false) - Change the default rendered element for the one passed as a child, merging their props.
    - ratio (number | 1) - The desired ratio for the content. 

 Data Attributes: 
    - "
   #?(:cljs (h/factory-apply suir/AspectRatio)))

(def ui-avatar-image
  "No docstring available for AvatarImage"
   #?(:cljs (h/factory-apply suir/AvatarImage)))

(def ui-avatar-fallback
  "No docstring available for AvatarFallback"
   #?(:cljs (h/factory-apply suir/AvatarFallback)))

(def ui-avatar
  "No docstring available for Avatar"
   #?(:cljs (h/factory-apply suir/Avatar)))

(def ui-badge
  "No docstring available for Badge"
   #?(:cljs (h/factory-apply suir/Badge)))

(def ui-breadcrumb-separator
  "No docstring available for BreadcrumbSeparator"
   #?(:cljs (h/factory-apply suir/BreadcrumbSeparator)))

(def ui-breadcrumb-page
  "No docstring available for BreadcrumbPage"
   #?(:cljs (h/factory-apply suir/BreadcrumbPage)))

(def ui-breadcrumb-list
  "No docstring available for BreadcrumbList"
   #?(:cljs (h/factory-apply suir/BreadcrumbList)))

(def ui-breadcrumb-link
  "No docstring available for BreadcrumbLink"
   #?(:cljs (h/factory-apply suir/BreadcrumbLink)))

(def ui-breadcrumb-item
  "No docstring available for BreadcrumbItem"
   #?(:cljs (h/factory-apply suir/BreadcrumbItem)))

(def ui-breadcrumb-ellipsis
  "No docstring available for BreadcrumbEllipsis"
   #?(:cljs (h/factory-apply suir/BreadcrumbEllipsis)))

(def ui-breadcrumb
  "No docstring available for Breadcrumb"
   #?(:cljs (h/factory-apply suir/Breadcrumb)))

(def ui-button
  "No docstring available for Button"
   #?(:cljs (h/factory-apply suir/Button)))

(def ui-calendar
  "No docstring available for Calendar"
   #?(:cljs (h/factory-apply suir/Calendar)))

(def ui-card-title
  "No docstring available for CardTitle"
   #?(:cljs (h/factory-apply suir/CardTitle)))

(def ui-card-header
  "No docstring available for CardHeader"
   #?(:cljs (h/factory-apply suir/CardHeader)))

(def ui-card-footer
  "No docstring available for CardFooter"
   #?(:cljs (h/factory-apply suir/CardFooter)))

(def ui-card-description
  "No docstring available for CardDescription"
   #?(:cljs (h/factory-apply suir/CardDescription)))

(def ui-card-content
  "No docstring available for CardContent"
   #?(:cljs (h/factory-apply suir/CardContent)))

(def ui-card
  "No docstring available for Card"
   #?(:cljs (h/factory-apply suir/Card)))

(def ui-carousel-previous
  "No docstring available for CarouselPrevious"
   #?(:cljs (h/factory-apply suir/CarouselPrevious)))

(def ui-carousel-next
  "No docstring available for CarouselNext"
   #?(:cljs (h/factory-apply suir/CarouselNext)))

(def ui-carousel-item
  "No docstring available for CarouselItem"
   #?(:cljs (h/factory-apply suir/CarouselItem)))

(def ui-carousel-content
  "No docstring available for CarouselContent"
   #?(:cljs (h/factory-apply suir/CarouselContent)))

(def ui-carousel
  "No docstring available for Carousel"
   #?(:cljs (h/factory-apply suir/Carousel)))

(def ui-chart-tooltip-content
  "No docstring available for ChartTooltipContent"
   #?(:cljs (h/factory-apply suir/ChartTooltipContent)))

(def ui-chart-tooltip
  "No docstring available for ChartTooltip"
   #?(:cljs (h/factory-apply suir/ChartTooltip)))

(def ui-chart-style
  "No docstring available for ChartStyle"
   #?(:cljs (h/factory-apply suir/ChartStyle)))

(def ui-chart-legend-content
  "No docstring available for ChartLegendContent"
   #?(:cljs (h/factory-apply suir/ChartLegendContent)))

(def ui-chart-legend
  "No docstring available for ChartLegend"
   #?(:cljs (h/factory-apply suir/ChartLegend)))

(def ui-chart-container
  "No docstring available for ChartContainer"
   #?(:cljs (h/factory-apply suir/ChartContainer)))

(def ui-checkbox
  "No docstring available for Checkbox"
   #?(:cljs (h/wrapped-factory-apply suir/Checkbox)))

(def ui-collapsible-trigger
  "No docstring available for CollapsibleTrigger"
   #?(:cljs (h/factory-apply suir/CollapsibleTrigger)))

(def ui-collapsible-content
  "No docstring available for CollapsibleContent"
   #?(:cljs (h/factory-apply suir/CollapsibleContent)))

(def ui-collapsible
  "No docstring available for Collapsible"
   #?(:cljs (h/factory-apply suir/Collapsible)))

(def ui-command-shortcut
  "No docstring available for CommandShortcut"
   #?(:cljs (h/factory-apply suir/CommandShortcut)))

(def ui-command-separator
  "No docstring available for CommandSeparator"
   #?(:cljs (h/factory-apply suir/CommandSeparator)))

(def ui-command-list
  "No docstring available for CommandList"
   #?(:cljs (h/factory-apply suir/CommandList)))

(def ui-command-item
  "No docstring available for CommandItem"
   #?(:cljs (h/factory-apply suir/CommandItem)))

(def ui-command-input
  "No docstring available for CommandInput"
   #?(:cljs (h/factory-apply suir/CommandInput)))

(def ui-command-group
  "No docstring available for CommandGroup"
   #?(:cljs (h/factory-apply suir/CommandGroup)))

(def ui-command-empty
  "No docstring available for CommandEmpty"
   #?(:cljs (h/factory-apply suir/CommandEmpty)))

(def ui-command-dialog
  "No docstring available for CommandDialog"
   #?(:cljs (h/factory-apply suir/CommandDialog)))

(def ui-command
  "No docstring available for Command"
   #?(:cljs (h/factory-apply suir/Command)))

(def ui-context-menu-trigger
  "No docstring available for ContextMenuTrigger"
   #?(:cljs (h/factory-apply suir/ContextMenuTrigger)))

(def ui-context-menu-sub-trigger
  "No docstring available for ContextMenuSubTrigger"
   #?(:cljs (h/factory-apply suir/ContextMenuSubTrigger)))

(def ui-context-menu-sub-content
  "No docstring available for ContextMenuSubContent"
   #?(:cljs (h/factory-apply suir/ContextMenuSubContent)))

(def ui-context-menu-sub
  "No docstring available for ContextMenuSub"
   #?(:cljs (h/factory-apply suir/ContextMenuSub)))

(def ui-context-menu-shortcut
  "No docstring available for ContextMenuShortcut"
   #?(:cljs (h/factory-apply suir/ContextMenuShortcut)))

(def ui-context-menu-separator
  "No docstring available for ContextMenuSeparator"
   #?(:cljs (h/factory-apply suir/ContextMenuSeparator)))

(def ui-context-menu-radio-item
  "No docstring available for ContextMenuRadioItem"
   #?(:cljs (h/factory-apply suir/ContextMenuRadioItem)))

(def ui-context-menu-radio-group
  "No docstring available for ContextMenuRadioGroup"
   #?(:cljs (h/factory-apply suir/ContextMenuRadioGroup)))

(def ui-context-menu-portal
  "No docstring available for ContextMenuPortal"
   #?(:cljs (h/factory-apply suir/ContextMenuPortal)))

(def ui-context-menu-label
  "No docstring available for ContextMenuLabel"
   #?(:cljs (h/factory-apply suir/ContextMenuLabel)))

(def ui-context-menu-item
  "No docstring available for ContextMenuItem"
   #?(:cljs (h/factory-apply suir/ContextMenuItem)))

(def ui-context-menu-group
  "No docstring available for ContextMenuGroup"
   #?(:cljs (h/factory-apply suir/ContextMenuGroup)))

(def ui-context-menu-content
  "No docstring available for ContextMenuContent"
   #?(:cljs (h/factory-apply suir/ContextMenuContent)))

(def ui-context-menu-checkbox-item
  "No docstring available for ContextMenuCheckboxItem"
   #?(:cljs (h/factory-apply suir/ContextMenuCheckboxItem)))

(def ui-context-menu
  "No docstring available for ContextMenu"
   #?(:cljs (h/factory-apply suir/ContextMenu)))

(def ui-dialog-trigger
  "No docstring available for DialogTrigger"
   #?(:cljs (h/factory-apply suir/DialogTrigger)))

(def ui-dialog-title
  "No docstring available for DialogTitle"
   #?(:cljs (h/factory-apply suir/DialogTitle)))

(def ui-dialog-portal
  "No docstring available for DialogPortal"
   #?(:cljs (h/factory-apply suir/DialogPortal)))

(def ui-dialog-overlay
  "No docstring available for DialogOverlay"
   #?(:cljs (h/factory-apply suir/DialogOverlay)))

(def ui-dialog-header
  "No docstring available for DialogHeader"
   #?(:cljs (h/factory-apply suir/DialogHeader)))

(def ui-dialog-footer
  "No docstring available for DialogFooter"
   #?(:cljs (h/factory-apply suir/DialogFooter)))

(def ui-dialog-description
  "No docstring available for DialogDescription"
   #?(:cljs (h/factory-apply suir/DialogDescription)))

(def ui-dialog-content
  "No docstring available for DialogContent"
   #?(:cljs (h/factory-apply suir/DialogContent)))

(def ui-dialog-close
  "No docstring available for DialogClose"
   #?(:cljs (h/factory-apply suir/DialogClose)))

(def ui-dialog
  "No docstring available for Dialog"
   #?(:cljs (h/factory-apply suir/Dialog)))

(def ui-drawer-trigger
  "No docstring available for DrawerTrigger"
   #?(:cljs (h/factory-apply suir/DrawerTrigger)))

(def ui-drawer-title
  "No docstring available for DrawerTitle"
   #?(:cljs (h/factory-apply suir/DrawerTitle)))

(def ui-drawer-portal
  "No docstring available for DrawerPortal"
   #?(:cljs (h/factory-apply suir/DrawerPortal)))

(def ui-drawer-overlay
  "No docstring available for DrawerOverlay"
   #?(:cljs (h/factory-apply suir/DrawerOverlay)))

(def ui-drawer-header
  "No docstring available for DrawerHeader"
   #?(:cljs (h/factory-apply suir/DrawerHeader)))

(def ui-drawer-footer
  "No docstring available for DrawerFooter"
   #?(:cljs (h/factory-apply suir/DrawerFooter)))

(def ui-drawer-description
  "No docstring available for DrawerDescription"
   #?(:cljs (h/factory-apply suir/DrawerDescription)))

(def ui-drawer-content
  "No docstring available for DrawerContent"
   #?(:cljs (h/factory-apply suir/DrawerContent)))

(def ui-drawer-close
  "No docstring available for DrawerClose"
   #?(:cljs (h/factory-apply suir/DrawerClose)))

(def ui-drawer
  "No docstring available for Drawer"
   #?(:cljs (h/factory-apply suir/Drawer)))

(def ui-dropdown-menu-trigger
  "No docstring available for DropdownMenuTrigger"
   #?(:cljs (h/factory-apply suir/DropdownMenuTrigger)))

(def ui-dropdown-menu-sub-trigger
  "No docstring available for DropdownMenuSubTrigger"
   #?(:cljs (h/factory-apply suir/DropdownMenuSubTrigger)))

(def ui-dropdown-menu-sub-content
  "No docstring available for DropdownMenuSubContent"
   #?(:cljs (h/factory-apply suir/DropdownMenuSubContent)))

(def ui-dropdown-menu-sub
  "No docstring available for DropdownMenuSub"
   #?(:cljs (h/factory-apply suir/DropdownMenuSub)))

(def ui-dropdown-menu-shortcut
  "No docstring available for DropdownMenuShortcut"
   #?(:cljs (h/factory-apply suir/DropdownMenuShortcut)))

(def ui-dropdown-menu-separator
  "No docstring available for DropdownMenuSeparator"
   #?(:cljs (h/factory-apply suir/DropdownMenuSeparator)))

(def ui-dropdown-menu-radio-item
  "No docstring available for DropdownMenuRadioItem"
   #?(:cljs (h/factory-apply suir/DropdownMenuRadioItem)))

(def ui-dropdown-menu-radio-group
  "No docstring available for DropdownMenuRadioGroup"
   #?(:cljs (h/factory-apply suir/DropdownMenuRadioGroup)))

(def ui-dropdown-menu-portal
  "No docstring available for DropdownMenuPortal"
   #?(:cljs (h/factory-apply suir/DropdownMenuPortal)))

(def ui-dropdown-menu-label
  "No docstring available for DropdownMenuLabel"
   #?(:cljs (h/factory-apply suir/DropdownMenuLabel)))

(def ui-dropdown-menu-item
  "No docstring available for DropdownMenuItem"
   #?(:cljs (h/factory-apply suir/DropdownMenuItem)))

(def ui-dropdown-menu-group
  "No docstring available for DropdownMenuGroup"
   #?(:cljs (h/factory-apply suir/DropdownMenuGroup)))

(def ui-dropdown-menu-content
  "No docstring available for DropdownMenuContent"
   #?(:cljs (h/factory-apply suir/DropdownMenuContent)))

(def ui-dropdown-menu-checkbox-item
  "No docstring available for DropdownMenuCheckboxItem"
   #?(:cljs (h/factory-apply suir/DropdownMenuCheckboxItem)))

(def ui-dropdown-menu
  "No docstring available for DropdownMenu"
   #?(:cljs (h/factory-apply suir/DropdownMenu)))

(def ui-form-message
  "No docstring available for FormMessage"
   #?(:cljs (h/factory-apply suir/FormMessage)))

(def ui-form-label
  "No docstring available for FormLabel"
   #?(:cljs (h/factory-apply suir/FormLabel)))

(def ui-form-item
  "No docstring available for FormItem"
   #?(:cljs (h/factory-apply suir/FormItem)))

(def ui-form-field
  "No docstring available for FormField"
   #?(:cljs (h/factory-apply suir/FormField)))

(def ui-form-description
  "No docstring available for FormDescription"
   #?(:cljs (h/factory-apply suir/FormDescription)))

(def ui-form-control
  "No docstring available for FormControl"
   #?(:cljs (h/factory-apply suir/FormControl)))

(def ui-form
  "No docstring available for Form"
   #?(:cljs (h/factory-apply suir/Form)))

(def ui-hover-card-trigger
  "No docstring available for HoverCardTrigger"
   #?(:cljs (h/factory-apply suir/HoverCardTrigger)))

(def ui-hover-card-content
  "No docstring available for HoverCardContent"
   #?(:cljs (h/factory-apply suir/HoverCardContent)))

(def ui-hover-card
  "No docstring available for HoverCard"
   #?(:cljs (h/factory-apply suir/HoverCard)))

(def ui-input
  "No docstring available for Input"
   #?(:cljs (h/wrapped-factory-apply suir/Input)))

(def ui-input-o-t-p-slot
  "No docstring available for InputOTPSlot"
   #?(:cljs (h/factory-apply suir/InputOTPSlot)))

(def ui-input-o-t-p-separator
  "No docstring available for InputOTPSeparator"
   #?(:cljs (h/factory-apply suir/InputOTPSeparator)))

(def ui-input-o-t-p-group
  "No docstring available for InputOTPGroup"
   #?(:cljs (h/factory-apply suir/InputOTPGroup)))

(def ui-input-o-t-p
  "No docstring available for InputOTP"
   #?(:cljs (h/factory-apply suir/InputOTP)))

(def ui-label
  "No docstring available for Label"
   #?(:cljs (h/factory-apply suir/Label)))

(def ui-menubar-trigger
  "No docstring available for MenubarTrigger"
   #?(:cljs (h/factory-apply suir/MenubarTrigger)))

(def ui-menubar-sub-trigger
  "No docstring available for MenubarSubTrigger"
   #?(:cljs (h/factory-apply suir/MenubarSubTrigger)))

(def ui-menubar-sub-content
  "No docstring available for MenubarSubContent"
   #?(:cljs (h/factory-apply suir/MenubarSubContent)))

(def ui-menubar-sub
  "No docstring available for MenubarSub"
   #?(:cljs (h/factory-apply suir/MenubarSub)))

(def ui-menubar-shortcut
  "No docstring available for MenubarShortcut"
   #?(:cljs (h/factory-apply suir/MenubarShortcut)))

(def ui-menubar-separator
  "No docstring available for MenubarSeparator"
   #?(:cljs (h/factory-apply suir/MenubarSeparator)))

(def ui-menubar-radio-item
  "No docstring available for MenubarRadioItem"
   #?(:cljs (h/factory-apply suir/MenubarRadioItem)))

(def ui-menubar-radio-group
  "No docstring available for MenubarRadioGroup"
   #?(:cljs (h/factory-apply suir/MenubarRadioGroup)))

(def ui-menubar-portal
  "No docstring available for MenubarPortal"
   #?(:cljs (h/factory-apply suir/MenubarPortal)))

(def ui-menubar-menu
  "No docstring available for MenubarMenu"
   #?(:cljs (h/factory-apply suir/MenubarMenu)))

(def ui-menubar-label
  "No docstring available for MenubarLabel"
   #?(:cljs (h/factory-apply suir/MenubarLabel)))

(def ui-menubar-item
  "No docstring available for MenubarItem"
   #?(:cljs (h/factory-apply suir/MenubarItem)))

(def ui-menubar-group
  "No docstring available for MenubarGroup"
   #?(:cljs (h/factory-apply suir/MenubarGroup)))

(def ui-menubar-content
  "No docstring available for MenubarContent"
   #?(:cljs (h/factory-apply suir/MenubarContent)))

(def ui-menubar-checkbox-item
  "No docstring available for MenubarCheckboxItem"
   #?(:cljs (h/factory-apply suir/MenubarCheckboxItem)))

(def ui-menubar
  "No docstring available for Menubar"
   #?(:cljs (h/factory-apply suir/Menubar)))

(def ui-navigation-menu-viewport
  "No docstring available for NavigationMenuViewport"
   #?(:cljs (h/factory-apply suir/NavigationMenuViewport)))

(def ui-navigation-menu-trigger
  "No docstring available for NavigationMenuTrigger"
   #?(:cljs (h/factory-apply suir/NavigationMenuTrigger)))

(def ui-navigation-menu-list
  "No docstring available for NavigationMenuList"
   #?(:cljs (h/factory-apply suir/NavigationMenuList)))

(def ui-navigation-menu-link
  "No docstring available for NavigationMenuLink"
   #?(:cljs (h/factory-apply suir/NavigationMenuLink)))

(def ui-navigation-menu-item
  "No docstring available for NavigationMenuItem"
   #?(:cljs (h/factory-apply suir/NavigationMenuItem)))

(def ui-navigation-menu-indicator
  "No docstring available for NavigationMenuIndicator"
   #?(:cljs (h/factory-apply suir/NavigationMenuIndicator)))

(def ui-navigation-menu-content
  "No docstring available for NavigationMenuContent"
   #?(:cljs (h/factory-apply suir/NavigationMenuContent)))

(def ui-navigation-menu
  "No docstring available for NavigationMenu"
   #?(:cljs (h/factory-apply suir/NavigationMenu)))

(def ui-pagination-previous
  "No docstring available for PaginationPrevious"
   #?(:cljs (h/factory-apply suir/PaginationPrevious)))

(def ui-pagination-next
  "No docstring available for PaginationNext"
   #?(:cljs (h/factory-apply suir/PaginationNext)))

(def ui-pagination-link
  "No docstring available for PaginationLink"
   #?(:cljs (h/factory-apply suir/PaginationLink)))

(def ui-pagination-item
  "No docstring available for PaginationItem"
   #?(:cljs (h/factory-apply suir/PaginationItem)))

(def ui-pagination-ellipsis
  "No docstring available for PaginationEllipsis"
   #?(:cljs (h/factory-apply suir/PaginationEllipsis)))

(def ui-pagination-content
  "No docstring available for PaginationContent"
   #?(:cljs (h/factory-apply suir/PaginationContent)))

(def ui-pagination
  "No docstring available for Pagination"
   #?(:cljs (h/factory-apply suir/Pagination)))

(def ui-popover-trigger
  "No docstring available for PopoverTrigger"
   #?(:cljs (h/factory-apply suir/PopoverTrigger)))

(def ui-popover-content
  "No docstring available for PopoverContent"
   #?(:cljs (h/factory-apply suir/PopoverContent)))

(def ui-popover-anchor
  "No docstring available for PopoverAnchor"
   #?(:cljs (h/factory-apply suir/PopoverAnchor)))

(def ui-popover
  "No docstring available for Popover"
   #?(:cljs (h/factory-apply suir/Popover)))

(def ui-progress
  "No docstring available for Progress"
   #?(:cljs (h/factory-apply suir/Progress)))

(def ui-radio-group-item
  "No docstring available for RadioGroupItem"
   #?(:cljs (h/factory-apply suir/RadioGroupItem)))

(def ui-radio-group
  "No docstring available for RadioGroup"
   #?(:cljs (h/factory-apply suir/RadioGroup)))

(def ui-resizable-panel-group
  "No docstring available for ResizablePanelGroup"
   #?(:cljs (h/factory-apply suir/ResizablePanelGroup)))

(def ui-resizable-panel
  "No docstring available for ResizablePanel"
   #?(:cljs (h/factory-apply suir/ResizablePanel)))

(def ui-resizable-handle
  "No docstring available for ResizableHandle"
   #?(:cljs (h/factory-apply suir/ResizableHandle)))

(def ui-scroll-bar
  "No docstring available for ScrollBar"
   #?(:cljs (h/factory-apply suir/ScrollBar)))

(def ui-scroll-area
  "No docstring available for ScrollArea"
   #?(:cljs (h/factory-apply suir/ScrollArea)))

(def ui-select-value
  "No docstring available for SelectValue"
   #?(:cljs (h/factory-apply suir/SelectValue)))

(def ui-select-trigger
  "No docstring available for SelectTrigger"
   #?(:cljs (h/factory-apply suir/SelectTrigger)))

(def ui-select-separator
  "No docstring available for SelectSeparator"
   #?(:cljs (h/factory-apply suir/SelectSeparator)))

(def ui-select-scroll-up-button
  "No docstring available for SelectScrollUpButton"
   #?(:cljs (h/factory-apply suir/SelectScrollUpButton)))

(def ui-select-scroll-down-button
  "No docstring available for SelectScrollDownButton"
   #?(:cljs (h/factory-apply suir/SelectScrollDownButton)))

(def ui-select-label
  "No docstring available for SelectLabel"
   #?(:cljs (h/factory-apply suir/SelectLabel)))

(def ui-select-item
  "No docstring available for SelectItem"
   #?(:cljs (h/factory-apply suir/SelectItem)))

(def ui-select-group
  "No docstring available for SelectGroup"
   #?(:cljs (h/factory-apply suir/SelectGroup)))

(def ui-select-content
  "No docstring available for SelectContent"
   #?(:cljs (h/factory-apply suir/SelectContent)))

(def ui-select
  "No docstring available for Select"
   #?(:cljs (h/factory-apply suir/Select)))

(def ui-separator
  "No docstring available for Separator"
   #?(:cljs (h/factory-apply suir/Separator)))

(def ui-sheet-trigger
  "No docstring available for SheetTrigger"
   #?(:cljs (h/factory-apply suir/SheetTrigger)))

(def ui-sheet-title
  "No docstring available for SheetTitle"
   #?(:cljs (h/factory-apply suir/SheetTitle)))

(def ui-sheet-portal
  "No docstring available for SheetPortal"
   #?(:cljs (h/factory-apply suir/SheetPortal)))

(def ui-sheet-overlay
  "No docstring available for SheetOverlay"
   #?(:cljs (h/factory-apply suir/SheetOverlay)))

(def ui-sheet-header
  "No docstring available for SheetHeader"
   #?(:cljs (h/factory-apply suir/SheetHeader)))

(def ui-sheet-footer
  "No docstring available for SheetFooter"
   #?(:cljs (h/factory-apply suir/SheetFooter)))

(def ui-sheet-description
  "No docstring available for SheetDescription"
   #?(:cljs (h/factory-apply suir/SheetDescription)))

(def ui-sheet-content
  "No docstring available for SheetContent"
   #?(:cljs (h/factory-apply suir/SheetContent)))

(def ui-sheet-close
  "No docstring available for SheetClose"
   #?(:cljs (h/factory-apply suir/SheetClose)))

(def ui-sheet
  "No docstring available for Sheet"
   #?(:cljs (h/factory-apply suir/Sheet)))

(def ui-sidebar-trigger
  "No docstring available for SidebarTrigger"
   #?(:cljs (h/factory-apply suir/SidebarTrigger)))

(def ui-sidebar-separator
  "No docstring available for SidebarSeparator"
   #?(:cljs (h/factory-apply suir/SidebarSeparator)))

(def ui-sidebar-rail
  "No docstring available for SidebarRail"
   #?(:cljs (h/factory-apply suir/SidebarRail)))

(def ui-sidebar-provider
  "No docstring available for SidebarProvider"
   #?(:cljs (h/factory-apply suir/SidebarProvider)))

(def ui-sidebar-menu-sub-item
  "No docstring available for SidebarMenuSubItem"
   #?(:cljs (h/factory-apply suir/SidebarMenuSubItem)))

(def ui-sidebar-menu-sub-button
  "No docstring available for SidebarMenuSubButton"
   #?(:cljs (h/factory-apply suir/SidebarMenuSubButton)))

(def ui-sidebar-menu-sub
  "No docstring available for SidebarMenuSub"
   #?(:cljs (h/factory-apply suir/SidebarMenuSub)))

(def ui-sidebar-menu-skeleton
  "No docstring available for SidebarMenuSkeleton"
   #?(:cljs (h/factory-apply suir/SidebarMenuSkeleton)))

(def ui-sidebar-menu-item
  "No docstring available for SidebarMenuItem"
   #?(:cljs (h/factory-apply suir/SidebarMenuItem)))

(def ui-sidebar-menu-button
  "No docstring available for SidebarMenuButton"
   #?(:cljs (h/factory-apply suir/SidebarMenuButton)))

(def ui-sidebar-menu-badge
  "No docstring available for SidebarMenuBadge"
   #?(:cljs (h/factory-apply suir/SidebarMenuBadge)))

(def ui-sidebar-menu-action
  "No docstring available for SidebarMenuAction"
   #?(:cljs (h/factory-apply suir/SidebarMenuAction)))

(def ui-sidebar-menu
  "No docstring available for SidebarMenu"
   #?(:cljs (h/factory-apply suir/SidebarMenu)))

(def ui-sidebar-inset
  "No docstring available for SidebarInset"
   #?(:cljs (h/factory-apply suir/SidebarInset)))

(def ui-sidebar-input
  "No docstring available for SidebarInput"
   #?(:cljs (h/factory-apply suir/SidebarInput)))

(def ui-sidebar-header
  "No docstring available for SidebarHeader"
   #?(:cljs (h/factory-apply suir/SidebarHeader)))

(def ui-sidebar-group-label
  "No docstring available for SidebarGroupLabel"
   #?(:cljs (h/factory-apply suir/SidebarGroupLabel)))

(def ui-sidebar-group-content
  "No docstring available for SidebarGroupContent"
   #?(:cljs (h/factory-apply suir/SidebarGroupContent)))

(def ui-sidebar-group-action
  "No docstring available for SidebarGroupAction"
   #?(:cljs (h/factory-apply suir/SidebarGroupAction)))

(def ui-sidebar-group
  "No docstring available for SidebarGroup"
   #?(:cljs (h/factory-apply suir/SidebarGroup)))

(def ui-sidebar-footer
  "No docstring available for SidebarFooter"
   #?(:cljs (h/factory-apply suir/SidebarFooter)))

(def ui-sidebar-content
  "No docstring available for SidebarContent"
   #?(:cljs (h/factory-apply suir/SidebarContent)))

(def ui-sidebar
  "No docstring available for Sidebar"
   #?(:cljs (h/factory-apply suir/Sidebar)))

(def ui-skeleton
  "No docstring available for Skeleton"
   #?(:cljs (h/factory-apply suir/Skeleton)))

(def ui-slider
  "No docstring available for Slider"
   #?(:cljs (h/factory-apply suir/Slider)))

(def ui-switch
  "No docstring available for Switch"
   #?(:cljs (h/factory-apply suir/Switch)))

(def ui-table-row
  "No docstring available for TableRow"
   #?(:cljs (h/factory-apply suir/TableRow)))

(def ui-table-header
  "No docstring available for TableHeader"
   #?(:cljs (h/factory-apply suir/TableHeader)))

(def ui-table-head
  "No docstring available for TableHead"
   #?(:cljs (h/factory-apply suir/TableHead)))

(def ui-table-footer
  "No docstring available for TableFooter"
   #?(:cljs (h/factory-apply suir/TableFooter)))

(def ui-table-cell
  "No docstring available for TableCell"
   #?(:cljs (h/factory-apply suir/TableCell)))

(def ui-table-caption
  "No docstring available for TableCaption"
   #?(:cljs (h/factory-apply suir/TableCaption)))

(def ui-table-body
  "No docstring available for TableBody"
   #?(:cljs (h/factory-apply suir/TableBody)))

(def ui-table
  "No docstring available for Table"
   #?(:cljs (h/factory-apply suir/Table)))

(def ui-tabs-trigger
  "No docstring available for TabsTrigger"
   #?(:cljs (h/factory-apply suir/TabsTrigger)))

(def ui-tabs-list
  "No docstring available for TabsList"
   #?(:cljs (h/factory-apply suir/TabsList)))

(def ui-tabs-content
  "No docstring available for TabsContent"
   #?(:cljs (h/factory-apply suir/TabsContent)))

(def ui-tabs
  "No docstring available for Tabs"
   #?(:cljs (h/factory-apply suir/Tabs)))

(def ui-textarea
  "No docstring available for Textarea"
   #?(:cljs (h/factory-apply suir/Textarea)))

(def ui-toast-viewport
  "No docstring available for ToastViewport"
   #?(:cljs (h/factory-apply suir/ToastViewport)))

(def ui-toast-title
  "No docstring available for ToastTitle"
   #?(:cljs (h/factory-apply suir/ToastTitle)))

(def ui-toast-provider
  "No docstring available for ToastProvider"
   #?(:cljs (h/factory-apply suir/ToastProvider)))

(def ui-toast-description
  "No docstring available for ToastDescription"
   #?(:cljs (h/factory-apply suir/ToastDescription)))

(def ui-toast-close
  "No docstring available for ToastClose"
   #?(:cljs (h/factory-apply suir/ToastClose)))

(def ui-toast-action
  "No docstring available for ToastAction"
   #?(:cljs (h/factory-apply suir/ToastAction)))

(def ui-toast
  "No docstring available for Toast"
   #?(:cljs (h/factory-apply suir/Toast)))

(def ui-toaster
  "No docstring available for Toaster"
   #?(:cljs (h/factory-apply suir/Toaster)))

(def ui-toggle
  "No docstring available for Toggle"
   #?(:cljs (h/factory-apply suir/Toggle)))

(def ui-toggle-group-item
  "No docstring available for ToggleGroupItem"
   #?(:cljs (h/factory-apply suir/ToggleGroupItem)))

(def ui-toggle-group
  "No docstring available for ToggleGroup"
   #?(:cljs (h/factory-apply suir/ToggleGroup)))

(def ui-tooltip-trigger
  "No docstring available for TooltipTrigger"
   #?(:cljs (h/factory-apply suir/TooltipTrigger)))

(def ui-tooltip-provider
  "No docstring available for TooltipProvider"
   #?(:cljs (h/factory-apply suir/TooltipProvider)))

(def ui-tooltip-content
  "No docstring available for TooltipContent"
   #?(:cljs (h/factory-apply suir/TooltipContent)))

(def ui-tooltip
  "No docstring available for Tooltip"
   #?(:cljs (h/factory-apply suir/Tooltip)))
