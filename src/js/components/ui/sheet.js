"use strict";
"use client";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.SheetTrigger = exports.SheetTitle = exports.SheetPortal = exports.SheetOverlay = exports.SheetHeader = exports.SheetFooter = exports.SheetDescription = exports.SheetContent = exports.SheetClose = exports.Sheet = void 0;
var React = _interopRequireWildcard(require("react"));
var SheetPrimitive = _interopRequireWildcard(require("@radix-ui/react-dialog"));
var _classVarianceAuthority = require("class-variance-authority");
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className"],
  _excluded2 = ["side", "className", "children"],
  _excluded3 = ["className"],
  _excluded4 = ["className"],
  _excluded5 = ["className"],
  _excluded6 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var Sheet = exports.Sheet = SheetPrimitive.Root;
var SheetTrigger = exports.SheetTrigger = SheetPrimitive.Trigger;
var SheetClose = exports.SheetClose = SheetPrimitive.Close;
var SheetPortal = exports.SheetPortal = SheetPrimitive.Portal;
var SheetOverlay = exports.SheetOverlay = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(SheetPrimitive.Overlay, _extends({
    className: (0, _utils.cn)("fixed inset-0 z-50 bg-black/80  data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0", className)
  }, props, {
    ref: ref
  }));
});
SheetOverlay.displayName = SheetPrimitive.Overlay.displayName;
var sheetVariants = (0, _classVarianceAuthority.cva)("fixed z-50 gap-4 bg-background p-6 shadow-lg transition ease-in-out data-[state=closed]:duration-300 data-[state=open]:duration-500 data-[state=open]:animate-in data-[state=closed]:animate-out", {
  variants: {
    side: {
      top: "inset-x-0 top-0 border-b data-[state=closed]:slide-out-to-top data-[state=open]:slide-in-from-top",
      bottom: "inset-x-0 bottom-0 border-t data-[state=closed]:slide-out-to-bottom data-[state=open]:slide-in-from-bottom",
      left: "inset-y-0 left-0 h-full w-3/4 border-r data-[state=closed]:slide-out-to-left data-[state=open]:slide-in-from-left sm:max-w-sm",
      right: "inset-y-0 right-0 h-full w-3/4 border-l data-[state=closed]:slide-out-to-right data-[state=open]:slide-in-from-right sm:max-w-sm"
    }
  },
  defaultVariants: {
    side: "right"
  }
});
var SheetContent = exports.SheetContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      side = "right",
      className,
      children
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(SheetPortal, null, /*#__PURE__*/React.createElement(SheetOverlay, null), /*#__PURE__*/React.createElement(SheetPrimitive.Content, _extends({
    ref: ref,
    className: (0, _utils.cn)(sheetVariants({
      side
    }), className)
  }, props), /*#__PURE__*/React.createElement(SheetPrimitive.Close, {
    className: "absolute right-4 top-4 rounded-sm opacity-70 ring-offset-background transition-opacity hover:opacity-100 focus:outline-none focus:ring-2 focus:ring-ring focus:ring-offset-2 disabled:pointer-events-none data-[state=open]:bg-secondary"
  }, /*#__PURE__*/React.createElement(_lucideReact.X, {
    className: "h-4 w-4"
  }), /*#__PURE__*/React.createElement("span", {
    className: "sr-only"
  }, "Close")), children));
});
SheetContent.displayName = SheetPrimitive.Content.displayName;
var SheetHeader = _ref3 => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("flex flex-col space-y-2 text-center sm:text-left", className)
  }, props));
};
exports.SheetHeader = SheetHeader;
SheetHeader.displayName = "SheetHeader";
var SheetFooter = _ref4 => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("flex flex-col-reverse sm:flex-row sm:justify-end sm:space-x-2", className)
  }, props));
};
exports.SheetFooter = SheetFooter;
SheetFooter.displayName = "SheetFooter";
var SheetTitle = exports.SheetTitle = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(SheetPrimitive.Title, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-lg font-semibold text-foreground", className)
  }, props));
});
SheetTitle.displayName = SheetPrimitive.Title.displayName;
var SheetDescription = exports.SheetDescription = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(SheetPrimitive.Description, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-sm text-muted-foreground", className)
  }, props));
});
SheetDescription.displayName = SheetPrimitive.Description.displayName;