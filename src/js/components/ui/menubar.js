"use strict";
"use client";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.MenubarTrigger = exports.MenubarSubTrigger = exports.MenubarSubContent = exports.MenubarSub = exports.MenubarShortcut = exports.MenubarSeparator = exports.MenubarRadioItem = exports.MenubarRadioGroup = exports.MenubarPortal = exports.MenubarMenu = exports.MenubarLabel = exports.MenubarItem = exports.MenubarGroup = exports.MenubarContent = exports.MenubarCheckboxItem = exports.Menubar = void 0;
var React = _interopRequireWildcard(require("react"));
var MenubarPrimitive = _interopRequireWildcard(require("@radix-ui/react-menubar"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className"],
  _excluded2 = ["className"],
  _excluded3 = ["className", "inset", "children"],
  _excluded4 = ["className"],
  _excluded5 = ["className", "align", "alignOffset", "sideOffset"],
  _excluded6 = ["className", "inset"],
  _excluded7 = ["className", "children", "checked"],
  _excluded8 = ["className", "children"],
  _excluded9 = ["className", "inset"],
  _excluded10 = ["className"],
  _excluded11 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var MenubarMenu = exports.MenubarMenu = MenubarPrimitive.Menu;
var MenubarGroup = exports.MenubarGroup = MenubarPrimitive.Group;
var MenubarPortal = exports.MenubarPortal = MenubarPrimitive.Portal;
var MenubarSub = exports.MenubarSub = MenubarPrimitive.Sub;
var MenubarRadioGroup = exports.MenubarRadioGroup = MenubarPrimitive.RadioGroup;
var Menubar = exports.Menubar = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Root, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex h-9 items-center space-x-1 rounded-md border bg-background p-1 shadow-sm", className)
  }, props));
});
Menubar.displayName = MenubarPrimitive.Root.displayName;
var MenubarTrigger = exports.MenubarTrigger = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Trigger, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex cursor-default select-none items-center rounded-sm px-3 py-1 text-sm font-medium outline-none focus:bg-accent focus:text-accent-foreground data-[state=open]:bg-accent data-[state=open]:text-accent-foreground", className)
  }, props));
});
MenubarTrigger.displayName = MenubarPrimitive.Trigger.displayName;
var MenubarSubTrigger = exports.MenubarSubTrigger = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className,
      inset,
      children
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.SubTrigger, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex cursor-default select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[state=open]:bg-accent data-[state=open]:text-accent-foreground", inset && "pl-8", className)
  }, props), children, /*#__PURE__*/React.createElement(_lucideReact.ChevronRight, {
    className: "ml-auto h-4 w-4"
  }));
});
MenubarSubTrigger.displayName = MenubarPrimitive.SubTrigger.displayName;
var MenubarSubContent = exports.MenubarSubContent = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.SubContent, _extends({
    ref: ref,
    className: (0, _utils.cn)("z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-lg data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props));
});
MenubarSubContent.displayName = MenubarPrimitive.SubContent.displayName;
var MenubarContent = exports.MenubarContent = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className,
      align = "start",
      alignOffset = -4,
      sideOffset = 8
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Portal, null, /*#__PURE__*/React.createElement(MenubarPrimitive.Content, _extends({
    ref: ref,
    align: align,
    alignOffset: alignOffset,
    sideOffset: sideOffset,
    className: (0, _utils.cn)("z-50 min-w-[12rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-md data-[state=open]:animate-in data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props)));
});
MenubarContent.displayName = MenubarPrimitive.Content.displayName;
var MenubarItem = exports.MenubarItem = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className,
      inset
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", inset && "pl-8", className)
  }, props));
});
MenubarItem.displayName = MenubarPrimitive.Item.displayName;
var MenubarCheckboxItem = exports.MenubarCheckboxItem = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className,
      children,
      checked
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.CheckboxItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className),
    checked: checked
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(MenubarPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Check, {
    className: "h-4 w-4"
  }))), children);
});
MenubarCheckboxItem.displayName = MenubarPrimitive.CheckboxItem.displayName;
var MenubarRadioItem = exports.MenubarRadioItem = /*#__PURE__*/React.forwardRef((_ref8, ref) => {
  var {
      className,
      children
    } = _ref8,
    props = _objectWithoutProperties(_ref8, _excluded8);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.RadioItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className)
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(MenubarPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Circle, {
    className: "h-4 w-4 fill-current"
  }))), children);
});
MenubarRadioItem.displayName = MenubarPrimitive.RadioItem.displayName;
var MenubarLabel = exports.MenubarLabel = /*#__PURE__*/React.forwardRef((_ref9, ref) => {
  var {
      className,
      inset
    } = _ref9,
    props = _objectWithoutProperties(_ref9, _excluded9);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Label, _extends({
    ref: ref,
    className: (0, _utils.cn)("px-2 py-1.5 text-sm font-semibold", inset && "pl-8", className)
  }, props));
});
MenubarLabel.displayName = MenubarPrimitive.Label.displayName;
var MenubarSeparator = exports.MenubarSeparator = /*#__PURE__*/React.forwardRef((_ref10, ref) => {
  var {
      className
    } = _ref10,
    props = _objectWithoutProperties(_ref10, _excluded10);
  return /*#__PURE__*/React.createElement(MenubarPrimitive.Separator, _extends({
    ref: ref,
    className: (0, _utils.cn)("-mx-1 my-1 h-px bg-muted", className)
  }, props));
});
MenubarSeparator.displayName = MenubarPrimitive.Separator.displayName;
var MenubarShortcut = _ref11 => {
  var {
      className
    } = _ref11,
    props = _objectWithoutProperties(_ref11, _excluded11);
  return /*#__PURE__*/React.createElement("span", _extends({
    className: (0, _utils.cn)("ml-auto text-xs tracking-widest text-muted-foreground", className)
  }, props));
};
exports.MenubarShortcut = MenubarShortcut;
MenubarShortcut.displayname = "MenubarShortcut";