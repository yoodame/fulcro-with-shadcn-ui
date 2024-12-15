"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.InputOTPSlot = exports.InputOTPSeparator = exports.InputOTPGroup = exports.InputOTP = void 0;
var React = _interopRequireWildcard(require("react"));
var _inputOtp = require("input-otp");
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className", "containerClassName"],
  _excluded2 = ["className"],
  _excluded3 = ["index", "className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _objectDestructuringEmpty(t) { if (null == t) throw new TypeError("Cannot destructure " + t); }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var InputOTP = exports.InputOTP = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      containerClassName
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(_inputOtp.OTPInput, _extends({
    ref: ref,
    containerClassName: (0, _utils.cn)("flex items-center gap-2 has-[:disabled]:opacity-50", containerClassName),
    className: (0, _utils.cn)("disabled:cursor-not-allowed", className)
  }, props));
});
InputOTP.displayName = "InputOTP";
var InputOTPGroup = exports.InputOTPGroup = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    className: (0, _utils.cn)("flex items-center", className)
  }, props));
});
InputOTPGroup.displayName = "InputOTPGroup";
var InputOTPSlot = exports.InputOTPSlot = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      index,
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  var inputOTPContext = React.useContext(_inputOtp.OTPInputContext);
  var {
    char,
    hasFakeCaret,
    isActive
  } = inputOTPContext.slots[index];
  return /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    className: (0, _utils.cn)("relative flex h-9 w-9 items-center justify-center border-y border-r border-input text-sm shadow-sm transition-all first:rounded-l-md first:border-l last:rounded-r-md", isActive && "z-10 ring-1 ring-ring", className)
  }, props), char, hasFakeCaret && /*#__PURE__*/React.createElement("div", {
    className: "pointer-events-none absolute inset-0 flex items-center justify-center"
  }, /*#__PURE__*/React.createElement("div", {
    className: "h-4 w-px animate-caret-blink bg-foreground duration-1000"
  })));
});
InputOTPSlot.displayName = "InputOTPSlot";
var InputOTPSeparator = exports.InputOTPSeparator = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var props = _extends({}, (_objectDestructuringEmpty(_ref4), _ref4));
  return /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    role: "separator"
  }, props), /*#__PURE__*/React.createElement(_lucideReact.Minus, null));
});
InputOTPSeparator.displayName = "InputOTPSeparator";