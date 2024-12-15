"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.navigationMenuTriggerStyle = exports.NavigationMenuViewport = exports.NavigationMenuTrigger = exports.NavigationMenuList = exports.NavigationMenuLink = exports.NavigationMenuItem = exports.NavigationMenuIndicator = exports.NavigationMenuContent = exports.NavigationMenu = void 0;
var React = _interopRequireWildcard(require("react"));
var NavigationMenuPrimitive = _interopRequireWildcard(require("@radix-ui/react-navigation-menu"));
var _classVarianceAuthority = require("class-variance-authority");
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className", "children"],
  _excluded2 = ["className"],
  _excluded3 = ["className", "children"],
  _excluded4 = ["className"],
  _excluded5 = ["className"],
  _excluded6 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var NavigationMenu = exports.NavigationMenu = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      children
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(NavigationMenuPrimitive.Root, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative z-10 flex max-w-max flex-1 items-center justify-center", className)
  }, props), children, /*#__PURE__*/React.createElement(NavigationMenuViewport, null));
});
NavigationMenu.displayName = NavigationMenuPrimitive.Root.displayName;
var NavigationMenuList = exports.NavigationMenuList = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(NavigationMenuPrimitive.List, _extends({
    ref: ref,
    className: (0, _utils.cn)("group flex flex-1 list-none items-center justify-center space-x-1", className)
  }, props));
});
NavigationMenuList.displayName = NavigationMenuPrimitive.List.displayName;
var NavigationMenuItem = exports.NavigationMenuItem = NavigationMenuPrimitive.Item;
var navigationMenuTriggerStyle = exports.navigationMenuTriggerStyle = (0, _classVarianceAuthority.cva)("group inline-flex h-9 w-max items-center justify-center rounded-md bg-background px-4 py-2 text-sm font-medium transition-colors hover:bg-accent hover:text-accent-foreground focus:bg-accent focus:text-accent-foreground focus:outline-none disabled:pointer-events-none disabled:opacity-50 data-[active]:bg-accent/50 data-[state=open]:bg-accent/50");
var NavigationMenuTrigger = exports.NavigationMenuTrigger = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className,
      children
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(NavigationMenuPrimitive.Trigger, _extends({
    ref: ref,
    className: (0, _utils.cn)(navigationMenuTriggerStyle(), "group", className)
  }, props), children, " ", /*#__PURE__*/React.createElement(_lucideReact.ChevronDown, {
    className: "relative top-[1px] ml-1 h-3 w-3 transition duration-300 group-data-[state=open]:rotate-180",
    "aria-hidden": "true"
  }));
});
NavigationMenuTrigger.displayName = NavigationMenuPrimitive.Trigger.displayName;
var NavigationMenuContent = exports.NavigationMenuContent = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement(NavigationMenuPrimitive.Content, _extends({
    ref: ref,
    className: (0, _utils.cn)("left-0 top-0 w-full data-[motion^=from-]:animate-in data-[motion^=to-]:animate-out data-[motion^=from-]:fade-in data-[motion^=to-]:fade-out data-[motion=from-end]:slide-in-from-right-52 data-[motion=from-start]:slide-in-from-left-52 data-[motion=to-end]:slide-out-to-right-52 data-[motion=to-start]:slide-out-to-left-52 md:absolute md:w-auto ", className)
  }, props));
});
NavigationMenuContent.displayName = NavigationMenuPrimitive.Content.displayName;
var NavigationMenuLink = exports.NavigationMenuLink = NavigationMenuPrimitive.Link;
var NavigationMenuViewport = exports.NavigationMenuViewport = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement("div", {
    className: (0, _utils.cn)("absolute left-0 top-full flex justify-center")
  }, /*#__PURE__*/React.createElement(NavigationMenuPrimitive.Viewport, _extends({
    className: (0, _utils.cn)("origin-top-center relative mt-1.5 h-[var(--radix-navigation-menu-viewport-height)] w-full overflow-hidden rounded-md border bg-popover text-popover-foreground shadow data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-90 md:w-[var(--radix-navigation-menu-viewport-width)]", className),
    ref: ref
  }, props)));
});
NavigationMenuViewport.displayName = NavigationMenuPrimitive.Viewport.displayName;
var NavigationMenuIndicator = exports.NavigationMenuIndicator = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(NavigationMenuPrimitive.Indicator, _extends({
    ref: ref,
    className: (0, _utils.cn)("top-full z-[1] flex h-1.5 items-end justify-center overflow-hidden data-[state=visible]:animate-in data-[state=hidden]:animate-out data-[state=hidden]:fade-out data-[state=visible]:fade-in", className)
  }, props), /*#__PURE__*/React.createElement("div", {
    className: "relative top-[60%] h-2 w-2 rotate-45 rounded-tl-sm bg-border shadow-md"
  }));
});
NavigationMenuIndicator.displayName = NavigationMenuPrimitive.Indicator.displayName;