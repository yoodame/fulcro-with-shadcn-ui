"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.AccordionTrigger = exports.AccordionItem = exports.AccordionContent = exports.Accordion = void 0;
var React = _interopRequireWildcard(require("react"));
var AccordionPrimitive = _interopRequireWildcard(require("@radix-ui/react-accordion"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _excluded = ["className"],
  _excluded2 = ["className", "children"],
  _excluded3 = ["className", "children"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var Accordion = exports.Accordion = AccordionPrimitive.Root;
var AccordionItem = exports.AccordionItem = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(AccordionPrimitive.Item, _extends({
    ref: ref,
    className: (0, _utils.cn)("border-b", className)
  }, props));
});
AccordionItem.displayName = "AccordionItem";
var AccordionTrigger = exports.AccordionTrigger = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className,
      children
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(AccordionPrimitive.Header, {
    className: "flex"
  }, /*#__PURE__*/React.createElement(AccordionPrimitive.Trigger, _extends({
    ref: ref,
    className: (0, _utils.cn)("flex flex-1 items-center justify-between py-4 text-sm font-medium transition-all hover:underline text-left [&[data-state=open]>svg]:rotate-180", className)
  }, props), children, /*#__PURE__*/React.createElement(_lucideReact.ChevronDown, {
    className: "h-4 w-4 shrink-0 text-muted-foreground transition-transform duration-200"
  })));
});
AccordionTrigger.displayName = AccordionPrimitive.Trigger.displayName;
var AccordionContent = exports.AccordionContent = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className,
      children
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement(AccordionPrimitive.Content, _extends({
    ref: ref,
    className: "overflow-hidden text-sm data-[state=closed]:animate-accordion-up data-[state=open]:animate-accordion-down"
  }, props), /*#__PURE__*/React.createElement("div", {
    className: (0, _utils.cn)("pb-4 pt-0", className)
  }, children));
});
AccordionContent.displayName = AccordionPrimitive.Content.displayName;