"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.CommandShortcut = exports.CommandSeparator = exports.CommandList = exports.CommandItem = exports.CommandInput = exports.CommandGroup = exports.CommandEmpty = exports.CommandDialog = exports.Command = void 0;
var React = _interopRequireWildcard(require("react"));
var _cmdk = require("cmdk");
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _dialog = require("./dialog");
var _excluded = ["className"],
  _excluded2 = ["children"],
  _excluded3 = ["className"],
  _excluded4 = ["className"],
  _excluded5 = ["className"],
  _excluded6 = ["className"],
  _excluded7 = ["className"],
  _excluded8 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var Command = exports.Command = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(_cmdk.Command, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex h-full w-full flex-col overflow-hidden rounded-md bg-popover text-popover-foreground", className)
  }, props));
});
Command.displayName = _cmdk.Command.displayName;
var CommandDialog = _ref2 => {
  var {
      children
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(_dialog.Dialog, props, /*#__PURE__*/React.createElement(_dialog.DialogContent, {
    className: "overflow-hidden p-0"
  }, /*#__PURE__*/React.createElement(Command, {
    className: "[&_[cmdk-group-heading]]:px-2 [&_[cmdk-group-heading]]:font-medium [&_[cmdk-group-heading]]:text-muted-foreground [&_[cmdk-group]:not([hidden])_~[cmdk-group]]:pt-0 [&_[cmdk-group]]:px-2 [&_[cmdk-input-wrapper]_svg]:h-5 [&_[cmdk-input-wrapper]_svg]:w-5 [&_[cmdk-input]]:h-12 [&_[cmdk-item]]:px-2 [&_[cmdk-item]]:py-3 [&_[cmdk-item]_svg]:h-5 [&_[cmdk-item]_svg]:w-5"
  }, children)));
};
exports.CommandDialog = CommandDialog;
var CommandInput = exports.CommandInput = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement("div", {
    className: "flex items-center border-b px-3",
    "cmdk-input-wrapper": ""
  }, /*#__PURE__*/React.createElement(_lucideReact.Search, {
    className: "mr-2 h-4 w-4 shrink-0 opacity-50"
  }), /*#__PURE__*/React.createElement(_cmdk.Command.Input, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex h-10 w-full rounded-md bg-transparent py-3 text-sm outline-none placeholder:text-muted-foreground disabled:cursor-not-allowed disabled:opacity-50", className)
  }, props)));
});
CommandInput.displayName = _cmdk.Command.Input.displayName;
var CommandList = exports.CommandList = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement(_cmdk.Command.List, _extends({
    ref: ref,
    className: (0, _utils.cn)("max-h-[300px] overflow-y-auto overflow-x-hidden", className)
  }, props));
});
CommandList.displayName = _cmdk.Command.List.displayName;
var CommandEmpty = exports.CommandEmpty = /*#__PURE__*/React.forwardRef((props, ref) => /*#__PURE__*/React.createElement(_cmdk.Command.Empty, _extends({
  ref: ref,
  className: "py-6 text-center text-sm"
}, props)));
CommandEmpty.displayName = _cmdk.Command.Empty.displayName;
var CommandGroup = exports.CommandGroup = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(_cmdk.Command.Group, _extends({
    ref: ref,
    className: (0, _utils.cn)("overflow-hidden p-1 text-foreground [&_[cmdk-group-heading]]:px-2 [&_[cmdk-group-heading]]:py-1.5 [&_[cmdk-group-heading]]:text-xs [&_[cmdk-group-heading]]:font-medium [&_[cmdk-group-heading]]:text-muted-foreground", className)
  }, props));
});
CommandGroup.displayName = _cmdk.Command.Group.displayName;
var CommandSeparator = exports.CommandSeparator = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(_cmdk.Command.Separator, _extends({
    ref: ref,
    className: (0, _utils.cn)("-mx-1 h-px bg-border", className)
  }, props));
});
CommandSeparator.displayName = _cmdk.Command.Separator.displayName;
var CommandItem = exports.CommandItem = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(_cmdk.Command.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex cursor-default gap-2 select-none items-center rounded-sm px-2 py-1.5 text-sm outline-none data-[disabled=true]:pointer-events-none data-[selected=true]:bg-accent data-[selected=true]:text-accent-foreground data-[disabled=true]:opacity-50 [&_svg]:pointer-events-none [&_svg]:size-4 [&_svg]:shrink-0", className)
  }, props));
});
CommandItem.displayName = _cmdk.Command.Item.displayName;
var CommandShortcut = _ref8 => {
  var {
      className
    } = _ref8,
    props = _objectWithoutProperties(_ref8, _excluded8);
  return /*#__PURE__*/React.createElement("span", _extends({
    className: (0, _utils.cn)("ml-auto text-xs tracking-widest text-muted-foreground", className)
  }, props));
};
exports.CommandShortcut = CommandShortcut;
CommandShortcut.displayName = "CommandShortcut";