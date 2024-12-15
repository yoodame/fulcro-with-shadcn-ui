"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.TooltipTrigger = exports.TooltipProvider = exports.TooltipContent = exports.Tooltip = void 0;
var React = _interopRequireWildcard(require("react"));
var TooltipPrimitive = _interopRequireWildcard(require("@radix-ui/react-tooltip"));
var _utils = require("../../lib/utils");
var _excluded = ["className", "sideOffset"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var TooltipProvider = exports.TooltipProvider = TooltipPrimitive.Provider;
var Tooltip = exports.Tooltip = TooltipPrimitive.Root;
var TooltipTrigger = exports.TooltipTrigger = TooltipPrimitive.Trigger;
var TooltipContent = exports.TooltipContent = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      sideOffset = 4
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(TooltipPrimitive.Portal, null, /*#__PURE__*/React.createElement(TooltipPrimitive.Content, _extends({
    ref: ref,
    sideOffset: sideOffset,
    className: (0, _utils.cn)("z-50 overflow-hidden rounded-md bg-primary px-3 py-1.5 text-xs text-primary-foreground animate-in fade-in-0 zoom-in-95 data-[state=closed]:animate-out data-[state=closed]:fade-out-0 data-[state=closed]:zoom-out-95 data-[side=bottom]:slide-in-from-top-2 data-[side=left]:slide-in-from-right-2 data-[side=right]:slide-in-from-left-2 data-[side=top]:slide-in-from-bottom-2", className)
  }, props)));
});
TooltipContent.displayName = TooltipPrimitive.Content.displayName;