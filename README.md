# fulcro-with-shadcn-ui

This repository serves as a guide for developers who want to use shadcn-ui in their Fulcro projects. It demonstrates a working setup, including how to:

- Manually set up shadcn-ui components.
- Transpile JavaScript components to ClojureScript.
- Establish seamless JavaScript to ClojureScript (JS->CLJS) interop.
- Generate reusable CLJS component code via the /src/dev/user.clj script.

> The goal is to simplify the integration of shadcn-ui into Fulcro projects while maintaining a clean and idiomatic workflow for both libraries.

## Setup Instructions

1. Clone the repository:
```bash
git clone <repository-url>
cd shadcn-ui-wrapper
```

2. Install dependencies:
```bash
npm install
```

3. Build or watch the components and styles:
```bash
npm run build:js
npm run build:css
; or
npm run watch:js
npm run watch:css
; or 
npm run watch:all
```

4. Start the Workspace app (development mode):
```bash
shadow-cljs server 
; or 
shadow-cljs watch workspaces
```

## Usage

### Using Components

This repository generates reusable Fulcro components from shadcn-ui. You can access these components in two ways:

1. Using Factories (`factories.cljc`)

For quick access, all components are available as factories in the `factories.cljc` file.

**Example: Button Usage**
```clojure
(ns fulcrologic.shadcn-ui.workspaces.example-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.shadcn-ui.factories :refer [ui-button]]))

(defsc ExampleCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (ui-button {:variant "outline"} "Click Me")))
```

2. Requiring Components Directly

If needed, you can access components directly for improve readability.

**Example: Using the Button Component Directly**

```clojure
(ns fulcrologic.shadcn-ui.workspaces.example-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.shadcn-ui.components.ui.ui-button :refer [ui-button]]))

(defsc ExampleCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (ui-button {:variant "outline"} "Click Me")))
```

### Using Icons

Icons from lucide-icons are also integrated and can be used via the factories provided.

**Example: Using an Icon**

```clojure
(ns fulcrologic.shadcn-ui.workspaces.icon-card
  (:require [com.fulcrologic.fulcro.components :refer [defsc]]
            [com.fulcrologic.fulcro.dom :as dom]
            [com.fulcrologic.shadcn-ui.lucide-icons :refer [check-icon]]))

(defsc IconCard
  [this props]
  {:query         [:ui/none]
   :ident         (fn [] [::id "singleton"])
   :initial-state {:ui/none nil}}
  (dom/div {}
    (check-icon {:className "size-4"})))
```

### Manage Shadcn-UI components

> You should always  reference the shadcn [documenation](https://ui.shadcn.com/docs) for updated information on components and their usage.

Adding shadcn components and generating factories is simple:

```bash
npm run shadcn:add
npm run shadcn:add-all | npm run shadcn:add
```

Then transpile the components:

```bash
npm run build:babel
```

Then run the following command to generate factories:
```bash
clj -M:dev -m user/gen-components ["components/ui"]
```

### Directory Structure
- `src/dev`: Development utilities and scripts.
- `src/shadcn`: shadcn-ui components and styles.
- `src/js`: CommonJS JavaScript components (source).
- `src/main`: ClojureScript components and generated factories.
- `workspaces`: Fulcro workspace examples and demo cards.

### Future Enhancements
•	Add more pre-defined layouts and component integrations.
•	Improve tooling for automated transpilation and component testing.
•	Continue to add more shadcn components examples and integrations.

### Acknowledgments

This project is built on:
•	[shadcn/ui](https://ui.shadcn.com)
•	[Fulcro](https://fulcro.fulcrologic.com)

Contributions are welcome!
