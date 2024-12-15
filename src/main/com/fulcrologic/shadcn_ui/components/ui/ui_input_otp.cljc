(ns com.fulcrologic.shadcn-ui.components.ui.ui-input-otp
  (:require
    [com.fulcrologic.shadcn-ui.factory-helpers :as h]
    #?(:cljs ["/components/ui/input-otp" :refer [InputOTPSlot InputOTPSeparator InputOTPGroup InputOTP]])))

(def ui-input-o-t-p-slot
  "No docstring available for InputOTPSlot"
   #?(:cljs (h/factory-apply InputOTPSlot)))

(def ui-input-o-t-p-separator
  "No docstring available for InputOTPSeparator"
   #?(:cljs (h/factory-apply InputOTPSeparator)))

(def ui-input-o-t-p-group
  "No docstring available for InputOTPGroup"
   #?(:cljs (h/factory-apply InputOTPGroup)))

(def ui-input-o-t-p
  "No docstring available for InputOTP"
   #?(:cljs (h/factory-apply InputOTP)))
