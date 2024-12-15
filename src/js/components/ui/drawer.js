"use strict";
"use client";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.DrawerTrigger = exports.DrawerTitle = exports.DrawerPortal = exports.DrawerOverlay = exports.DrawerHeader = exports.DrawerFooter = exports.DrawerDescription = exports.DrawerContent = exports.DrawerClose = exports.Drawer = void 0;
var React = _interopRequireWildcard(require("react"));
var _vaul = require("vaul");
var _utils = require("../../lib/utils");
var _excluded = ["shouldScaleBackground"],
  _excluded2 = ["className"],
  _excluded3 = ["className", "children"],
  _excluded4 = ["className"],
  _excluded5 = ["className"],
  _excluded6 = ["className"],
  _excluded7 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var Drawer = _ref => {
  var {
      shouldScaleBackground = true
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(_vaul.Drawer.Root, _extends({
    shouldScaleBackground: shouldScaleBackground
  }, props));
};
exports.Drawer = Drawer;
Drawer.displayName = "Drawer";
var DrawerTrigger = exports.DrawerTrigger = _vaul.Drawer.Trigger;
var DrawerPortal = exports.DrawerPortal = _vaul.Drawer.Portal;
var DrawerClose = exports.DrawerClose = _vaul.Drawer.Close;
var DrawerOverlay = exports.DrawerOverlay = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(_vaul.Drawer.Overlay, _extends({
    ref: ref,
    className: (0, _utils.cn)("fixed inset-0 z-50 bg-black/80", className)
  }, props));
});
DrawerOverlay.displayName = _vaul.Drawer.Overlay.displayName;
var DrawerContent = exports.DrawerContent = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className,
      children
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(DrawerPortal, null, /*#__PURE__*/React.createElement(DrawerOverlay, null), /*#__PURE__*/React.createElement(_vaul.Drawer.Content, _extends({
    ref: ref,
    className: (0, _utils.cn)("fixed inset-x-0 bottom-0 z-50 mt-24 flex h-auto flex-col rounded-t-[10px] border bg-background", className)
  }, props), /*#__PURE__*/React.createElement("div", {
    className: "mx-auto mt-4 h-2 w-[100px] rounded-full bg-muted"
  }), children));
});
DrawerContent.displayName = "DrawerContent";
var DrawerHeader = _ref4 => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("grid gap-1.5 p-4 text-center sm:text-left", className)
  }, props));
};
exports.DrawerHeader = DrawerHeader;
DrawerHeader.displayName = "DrawerHeader";
var DrawerFooter = _ref5 => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("mt-auto flex flex-col gap-2 p-4", className)
  }, props));
};
exports.DrawerFooter = DrawerFooter;
DrawerFooter.displayName = "DrawerFooter";
var DrawerTitle = exports.DrawerTitle = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(_vaul.Drawer.Title, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-lg font-semibold leading-none tracking-tight", className)
  }, props));
});
DrawerTitle.displayName = _vaul.Drawer.Title.displayName;
var DrawerDescription = exports.DrawerDescription = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(_vaul.Drawer.Description, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-sm text-muted-foreground", className)
  }, props));
});
DrawerDescription.displayName = _vaul.Drawer.Description.displayName;