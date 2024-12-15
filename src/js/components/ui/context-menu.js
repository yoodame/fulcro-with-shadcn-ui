"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.ContextMenuTrigger = exports.ContextMenuSubTrigger = exports.ContextMenuSubContent = exports.ContextMenuSub = exports.ContextMenuShortcut = exports.ContextMenuSeparator = exports.ContextMenuRadioItem = exports.ContextMenuRadioGroup = exports.ContextMenuPortal = exports.ContextMenuLabel = exports.ContextMenuItem = exports.ContextMenuGroup = exports.ContextMenuContent = exports.ContextMenuCheckboxItem = exports.ContextMenu = void 0;
var React = _interopRequireWildcard(require("react"));
var ContextMenuPrimitive = _interopRequireWildcard(require("@radix-ui/react-context-menu"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className", "inset", "children"],
  _excluded2 = ["className"],
  _excluded3 = ["className"],
  _excluded4 = ["className", "inset"],
  _excluded5 = ["className", "children", "checked"],
  _excluded6 = ["className", "children"],
  _excluded7 = ["className", "inset"],
  _excluded8 = ["className"],
  _excluded9 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var ContextMenu = exports.ContextMenu = ContextMenuPrimitive.Root;
var ContextMenuTrigger = exports.ContextMenuTrigger = ContextMenuPrimitive.Trigger;
var ContextMenuGroup = exports.ContextMenuGroup = ContextMenuPrimitive.Group;
var ContextMenuPortal = exports.ContextMenuPortal = ContextMenuPrimitive.Portal;
var ContextMenuSub = exports.ContextMenuSub = ContextMenuPrimitive.Sub;
var ContextMenuRadioGroup = exports.ContextMenuRadioGroup = ContextMenuPrimitive.RadioGroup;
var ContextMenuSubTrigger = exports.ContextMenuSubTrigger = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      inset,
      children
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.SubTrigger, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex cursor-default select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[state=open]:bg-accent data-[state=open]:text-accent-foreground", inset && "pl-8", className)
  }, props), children, /*#__PURE__*/React.createElement(_lucideReact.ChevronRight, {
    className: "ml-auto h-4 w-4"
  }));
});
ContextMenuSubTrigger.displayName = ContextMenuPrimitive.SubTrigger.displayName;
var ContextMenuSubContent = exports.ContextMenuSubContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.SubContent, _extends({
    ref: ref,
    className: (0, _utils.cn)("z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-lg data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props));
});
ContextMenuSubContent.displayName = ContextMenuPrimitive.SubContent.displayName;
var ContextMenuContent = exports.ContextMenuContent = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.Portal, null, /*#__PURE__*/React.createElement(ContextMenuPrimitive.Content, _extends({
    ref: ref,
    className: (0, _utils.cn)("z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-md data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props)));
});
ContextMenuContent.displayName = ContextMenuPrimitive.Content.displayName;
var ContextMenuItem = exports.ContextMenuItem = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className,
      inset
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", inset && "pl-8", className)
  }, props));
});
ContextMenuItem.displayName = ContextMenuPrimitive.Item.displayName;
var ContextMenuCheckboxItem = exports.ContextMenuCheckboxItem = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className,
      children,
      checked
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.CheckboxItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className),
    checked: checked
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(ContextMenuPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Check, {
    className: "h-4 w-4"
  }))), children);
});
ContextMenuCheckboxItem.displayName = ContextMenuPrimitive.CheckboxItem.displayName;
var ContextMenuRadioItem = exports.ContextMenuRadioItem = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className,
      children
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.RadioItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className)
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(ContextMenuPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Circle, {
    className: "h-4 w-4 fill-current"
  }))), children);
});
ContextMenuRadioItem.displayName = ContextMenuPrimitive.RadioItem.displayName;
var ContextMenuLabel = exports.ContextMenuLabel = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className,
      inset
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.Label, _extends({
    ref: ref,
    className: (0, _utils.cn)("px-2 py-1.5 text-sm font-semibold text-foreground", inset && "pl-8", className)
  }, props));
});
ContextMenuLabel.displayName = ContextMenuPrimitive.Label.displayName;
var ContextMenuSeparator = exports.ContextMenuSeparator = /*#__PURE__*/React.forwardRef((_ref8, ref) => {
  var {
      className
    } = _ref8,
    props = _objectWithoutProperties(_ref8, _excluded8);
  return /*#__PURE__*/React.createElement(ContextMenuPrimitive.Separator, _extends({
    ref: ref,
    className: (0, _utils.cn)("-mx-1 my-1 h-px bg-border", className)
  }, props));
});
ContextMenuSeparator.displayName = ContextMenuPrimitive.Separator.displayName;
var ContextMenuShortcut = _ref9 => {
  var {
      className
    } = _ref9,
    props = _objectWithoutProperties(_ref9, _excluded9);
  return /*#__PURE__*/React.createElement("span", _extends({
    className: (0, _utils.cn)("ml-auto text-xs tracking-widest text-muted-foreground", className)
  }, props));
};
exports.ContextMenuShortcut = ContextMenuShortcut;
ContextMenuShortcut.displayName = "ContextMenuShortcut";