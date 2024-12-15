(ns com.fulcrologic.shadcn-ui.hooks
  (:require
    #?(:cljs ["/hooks/use-toast" :refer [useToast]])))

(defn use-toast
  "The useToast hook returns a toast function that you can use to display a toast.
  example => (let {:keys [dismiss toast toasts]} = (use-toast)
              (toast (clj->js {:title \"\" :discription \"\" :action ()}))"
  []
  #?(:cljs (js->clj (useToast) :keywordize-keys true)))
