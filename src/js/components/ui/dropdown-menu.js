"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.DropdownMenuTrigger = exports.DropdownMenuSubTrigger = exports.DropdownMenuSubContent = exports.DropdownMenuSub = exports.DropdownMenuShortcut = exports.DropdownMenuSeparator = exports.DropdownMenuRadioItem = exports.DropdownMenuRadioGroup = exports.DropdownMenuPortal = exports.DropdownMenuLabel = exports.DropdownMenuItem = exports.DropdownMenuGroup = exports.DropdownMenuContent = exports.DropdownMenuCheckboxItem = exports.DropdownMenu = void 0;
var React = _interopRequireWildcard(require("react"));
var DropdownMenuPrimitive = _interopRequireWildcard(require("@radix-ui/react-dropdown-menu"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className", "inset", "children"],
  _excluded2 = ["className"],
  _excluded3 = ["className", "sideOffset"],
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
var DropdownMenu = exports.DropdownMenu = DropdownMenuPrimitive.Root;
var DropdownMenuTrigger = exports.DropdownMenuTrigger = DropdownMenuPrimitive.Trigger;
var DropdownMenuGroup = exports.DropdownMenuGroup = DropdownMenuPrimitive.Group;
var DropdownMenuPortal = exports.DropdownMenuPortal = DropdownMenuPrimitive.Portal;
var DropdownMenuSub = exports.DropdownMenuSub = DropdownMenuPrimitive.Sub;
var DropdownMenuRadioGroup = exports.DropdownMenuRadioGroup = DropdownMenuPrimitive.RadioGroup;
var DropdownMenuSubTrigger = exports.DropdownMenuSubTrigger = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      inset,
      children
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.SubTrigger, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex cursor-default gap-2 select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none focus:bg-accent data-[state=open]:bg-accent [&_svg]:pointer-events-none [&_svg]:size-4 [&_svg]:shrink-0", inset && "pl-8", className)
  }, props), children, /*#__PURE__*/React.createElement(_lucideReact.ChevronRight, {
    className: "ml-auto"
  }));
});
DropdownMenuSubTrigger.displayName = DropdownMenuPrimitive.SubTrigger.displayName;
var DropdownMenuSubContent = exports.DropdownMenuSubContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.SubContent, _extends({
    ref: ref,
    className: (0, _utils.cn)("z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-lg data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props));
});
DropdownMenuSubContent.displayName = DropdownMenuPrimitive.SubContent.displayName;
var DropdownMenuContent = exports.DropdownMenuContent = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className,
      sideOffset = 4
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.Portal, null, /*#__PURE__*/React.createElement(DropdownMenuPrimitive.Content, _extends({
    ref: ref,
    sideOffset: sideOffset,
    className: (0, _utils.cn)("z-50 min-w-[8rem] overflow-hidden rounded-md border bg-popover p-1 text-popover-foreground shadow-md", "data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props)));
});
DropdownMenuContent.displayName = DropdownMenuPrimitive.Content.displayName;
var DropdownMenuItem = exports.DropdownMenuItem = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className,
      inset
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center gap-2 rounded-sm px-2 py-1.5 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50 [&>svg]:size-4 [&>svg]:shrink-0", inset && "pl-8", className)
  }, props));
});
DropdownMenuItem.displayName = DropdownMenuPrimitive.Item.displayName;
var DropdownMenuCheckboxItem = exports.DropdownMenuCheckboxItem = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className,
      children,
      checked
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.CheckboxItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className),
    checked: checked
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(DropdownMenuPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Check, {
    className: "h-4 w-4"
  }))), children);
});
DropdownMenuCheckboxItem.displayName = DropdownMenuPrimitive.CheckboxItem.displayName;
var DropdownMenuRadioItem = exports.DropdownMenuRadioItem = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className,
      children
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.RadioItem, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default select-none items-center rounded-sm py-1.5 pl-8 pr-2 text-sm outline-none transition-colors focus:bg-accent focus:text-accent-foreground data-[disabled]:pointer-events-none data-[disabled]:opacity-50", className)
  }, props), /*#__PURE__*/React.createElement("span", {
    className: "absolute left-2 flex h-3.5 w-3.5 items-center justify-center"
  }, /*#__PURE__*/React.createElement(DropdownMenuPrimitive.ItemIndicator, null, /*#__PURE__*/React.createElement(_lucideReact.Circle, {
    className: "h-2 w-2 fill-current"
  }))), children);
});
DropdownMenuRadioItem.displayName = DropdownMenuPrimitive.RadioItem.displayName;
var DropdownMenuLabel = exports.DropdownMenuLabel = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className,
      inset
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.Label, _extends({
    ref: ref,
    className: (0, _utils.cn)("px-2 py-1.5 text-sm font-semibold", inset && "pl-8", className)
  }, props));
});
DropdownMenuLabel.displayName = DropdownMenuPrimitive.Label.displayName;
var DropdownMenuSeparator = exports.DropdownMenuSeparator = /*#__PURE__*/React.forwardRef((_ref8, ref) => {
  var {
      className
    } = _ref8,
    props = _objectWithoutProperties(_ref8, _excluded8);
  return /*#__PURE__*/React.createElement(DropdownMenuPrimitive.Separator, _extends({
    ref: ref,
    className: (0, _utils.cn)("-mx-1 my-1 h-px bg-muted", className)
  }, props));
});
DropdownMenuSeparator.displayName = DropdownMenuPrimitive.Separator.displayName;
var DropdownMenuShortcut = _ref9 => {
  var {
      className
    } = _ref9,
    props = _objectWithoutProperties(_ref9, _excluded9);
  return /*#__PURE__*/React.createElement("span", _extends({
    className: (0, _utils.cn)("ml-auto text-xs tracking-widest opacity-60", className)
  }, props));
};
exports.DropdownMenuShortcut = DropdownMenuShortcut;
DropdownMenuShortcut.displayName = "DropdownMenuShortcut";