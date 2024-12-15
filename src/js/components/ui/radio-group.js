"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.RadioGroupItem = exports.RadioGroup = void 0;
var React = _interopRequireWildcard(require("react"));
var RadioGroupPrimitive = _interopRequireWildcard(require("@radix-ui/react-radio-group"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className"],
  _excluded2 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var RadioGroup = exports.RadioGroup = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(RadioGroupPrimitive.Root, _extends({
    className: (0, _utils.cn)("grid gap-2", className)
  }, props, {
    ref: ref
  }));
});
RadioGroup.displayName = RadioGroupPrimitive.Root.displayName;
var RadioGroupItem = exports.RadioGroupItem = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(RadioGroupPrimitive.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("aspect-square h-4 w-4 rounded-full border border-primary text-primary shadow focus:outline-none focus-visible:ring-1 focus-visible:ring-ring disabled:cursor-not-allowed disabled:opacity-50", className)
  }, props), /*#__PURE__*/React.createElement(RadioGroupPrimitive.Indicator, {
    className: "flex items-center justify-center"
  }, /*#__PURE__*/React.createElement(_lucideReact.Circle, {
    className: "h-3.5 w-3.5 fill-primary"
  })));
});
RadioGroupItem.displayName = RadioGroupPrimitive.Item.displayName;