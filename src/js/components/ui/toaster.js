"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.Toaster = Toaster;
var _useToast = require("../../hooks/use-toast");
var _toast = require("./toast");
var _excluded = ["id", "title", "description", "action"];
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
function Toaster() {
  var {
    toasts
  } = (0, _useToast.useToast)();
  return /*#__PURE__*/React.createElement(_toast.ToastProvider, null, toasts.map(function (_ref) {
    var {
        id,
        title,
        description,
        action
      } = _ref,
      props = _objectWithoutProperties(_ref, _excluded);
    return /*#__PURE__*/React.createElement(_toast.Toast, _extends({
      key: id
    }, props), /*#__PURE__*/React.createElement("div", {
      className: "grid gap-1"
    }, title && /*#__PURE__*/React.createElement(_toast.ToastTitle, null, title), description && /*#__PURE__*/React.createElement(_toast.ToastDescription, null, description)), action, /*#__PURE__*/React.createElement(_toast.ToastClose, null));
  }), /*#__PURE__*/React.createElement(_toast.ToastViewport, null));
}