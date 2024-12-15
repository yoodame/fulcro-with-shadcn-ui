"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.AlertDialogTrigger = exports.AlertDialogTitle = exports.AlertDialogPortal = exports.AlertDialogOverlay = exports.AlertDialogHeader = exports.AlertDialogFooter = exports.AlertDialogDescription = exports.AlertDialogContent = exports.AlertDialogCancel = exports.AlertDialogAction = exports.AlertDialog = void 0;
var React = _interopRequireWildcard(require("react"));
var AlertDialogPrimitive = _interopRequireWildcard(require("@radix-ui/react-alert-dialog"));
var _utils = require("../../lib/utils");
var _button = require("./button");
var _excluded = ["className"],
  _excluded2 = ["className"],
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
var AlertDialog = exports.AlertDialog = AlertDialogPrimitive.Root;
var AlertDialogTrigger = exports.AlertDialogTrigger = AlertDialogPrimitive.Trigger;
var AlertDialogPortal = exports.AlertDialogPortal = AlertDialogPrimitive.Portal;
var AlertDialogOverlay = exports.AlertDialogOverlay = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(AlertDialogPrimitive.Overlay, _extends({
    className: (0, _utils.cn)("fixed inset-0 z-50 bg-black/80 data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0", className)
  }, props, {
    ref: ref
  }));
});
AlertDialogOverlay.displayName = AlertDialogPrimitive.Overlay.displayName;
var AlertDialogContent = exports.AlertDialogContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(AlertDialogPortal, null, /*#__PURE__*/React.createElement(AlertDialogOverlay, null), /*#__PURE__*/React.createElement(AlertDialogPrimitive.Content, _extends({
    ref: ref,
    className: (0, _utils.cn)("fixed left-[50%] top-[50%] z-50 grid w-full max-w-lg translate-x-[-50%] translate-y-[-50%] gap-4 border bg-background p-6 shadow-lg duration-200 data-[state=open]:animate-in data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=open]:fade-in-0 data-[state=closed]:zoom-out-95 data-[state=open]:zoom-in-95 data-[state=closed]:slide-out-to-left-1/2 data-[state=closed]:slide-out-to-top-[48%] data-[state=open]:slide-in-from-left-1/2 data-[state=open]:slide-in-from-top-[48%] sm:rounded-lg", className)
  }, props)));
});
AlertDialogContent.displayName = AlertDialogPrimitive.Content.displayName;
var AlertDialogHeader = _ref3 => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("flex flex-col space-y-2 text-center sm:text-left", className)
  }, props));
};
exports.AlertDialogHeader = AlertDialogHeader;
AlertDialogHeader.displayName = "AlertDialogHeader";
var AlertDialogFooter = _ref4 => {
  var {
      className
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement("div", _extends({
    className: (0, _utils.cn)("flex flex-col-reverse sm:flex-row sm:justify-end sm:space-x-2", className)
  }, props));
};
exports.AlertDialogFooter = AlertDialogFooter;
AlertDialogFooter.displayName = "AlertDialogFooter";
var AlertDialogTitle = exports.AlertDialogTitle = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(AlertDialogPrimitive.Title, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-lg font-semibold", className)
  }, props));
});
AlertDialogTitle.displayName = AlertDialogPrimitive.Title.displayName;
var AlertDialogDescription = exports.AlertDialogDescription = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(AlertDialogPrimitive.Description, _extends({
    ref: ref,
    className: (0, _utils.cn)("text-sm text-muted-foreground", className)
  }, props));
});
AlertDialogDescription.displayName = AlertDialogPrimitive.Description.displayName;
var AlertDialogAction = exports.AlertDialogAction = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
      className
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement(AlertDialogPrimitive.Action, _extends({
    ref: ref,
    className: (0, _utils.cn)((0, _button.buttonVariants)(), className)
  }, props));
});
AlertDialogAction.displayName = AlertDialogPrimitive.Action.displayName;
var AlertDialogCancel = exports.AlertDialogCancel = /*#__PURE__*/React.forwardRef((_ref8, ref) => {
  var {
      className
    } = _ref8,
    props = _objectWithoutProperties(_ref8, _excluded8);
  return /*#__PURE__*/React.createElement(AlertDialogPrimitive.Cancel, _extends({
    ref: ref,
    className: (0, _utils.cn)((0, _button.buttonVariants)({
      variant: "outline"
    }), "mt-2 sm:mt-0", className)
  }, props));
});
AlertDialogCancel.displayName = AlertDialogPrimitive.Cancel.displayName;