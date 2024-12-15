"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.ScrollBar = exports.ScrollArea = void 0;
var React = _interopRequireWildcard(require("react"));
var ScrollAreaPrimitive = _interopRequireWildcard(require("@radix-ui/react-scroll-area"));
var _utils = require("../../lib/utils");
var _excluded = ["className", "children"],
  _excluded2 = ["className", "orientation"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var ScrollArea = exports.ScrollArea = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      className,
      children
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(ScrollAreaPrimitive.Root, _extends({
    ref: ref,
    className: (0, _utils.cn)("relative overflow-hidden", className)
  }, props), /*#__PURE__*/React.createElement(ScrollAreaPrimitive.Viewport, {
    className: "h-full w-full rounded-[inherit]"
  }, children), /*#__PURE__*/React.createElement(ScrollBar, null), /*#__PURE__*/React.createElement(ScrollAreaPrimitive.Corner, null));
});
ScrollArea.displayName = ScrollAreaPrimitive.Root.displayName;
var ScrollBar = exports.ScrollBar = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className,
      orientation = "vertical"
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(ScrollAreaPrimitive.ScrollAreaScrollbar, _extends({
    ref: ref,
    orientation: orientation,
    className: (0, _utils.cn)("flex touch-none select-none transition-colors", orientation === "vertical" && "h-full w-2.5 border-l border-l-transparent p-[1px]", orientation === "horizontal" && "h-2.5 flex-col border-t border-t-transparent p-[1px]", className)
  }, props), /*#__PURE__*/React.createElement(ScrollAreaPrimitive.ScrollAreaThumb, {
    className: "relative flex-1 rounded-full bg-border"
  }));
});
ScrollBar.displayName = ScrollAreaPrimitive.ScrollAreaScrollbar.displayName;