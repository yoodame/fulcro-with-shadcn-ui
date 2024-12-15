"use strict";
"use client";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.ResizablePanelGroup = exports.ResizablePanel = exports.ResizableHandle = void 0;
var _lucideReact = require("lucide-react");
var ResizablePrimitive = _interopRequireWildcard(require("react-resizable-panels"));
var _utils = require("../../lib/utils");
var _excluded = ["className"],
  _excluded2 = ["withHandle", "className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var ResizablePanelGroup = _ref => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement(ResizablePrimitive.PanelGroup, _extends({
    className: (0, _utils.cn)("flex h-full w-full data-[panel-group-direction=vertical]:flex-col", className)
  }, props));
};
exports.ResizablePanelGroup = ResizablePanelGroup;
var ResizablePanel = exports.ResizablePanel = ResizablePrimitive.Panel;
var ResizableHandle = _ref2 => {
  var {
      withHandle,
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement(ResizablePrimitive.PanelResizeHandle, _extends({
    className: (0, _utils.cn)("relative flex w-px items-center justify-center bg-border after:absolute after:inset-y-0 after:left-1/2 after:w-1 after:-translate-x-1/2 focus-visible:outline-none focus-visible:ring-1 focus-visible:ring-ring focus-visible:ring-offset-1 data-[panel-group-direction=vertical]:h-px data-[panel-group-direction=vertical]:w-full data-[panel-group-direction=vertical]:after:left-0 data-[panel-group-direction=vertical]:after:h-1 data-[panel-group-direction=vertical]:after:w-full data-[panel-group-direction=vertical]:after:-translate-y-1/2 data-[panel-group-direction=vertical]:after:translate-x-0 [&[data-panel-group-direction=vertical]>div]:rotate-90", className)
  }, props), withHandle && /*#__PURE__*/React.createElement("div", {
    className: "z-10 flex h-4 w-3 items-center justify-center rounded-sm border bg-border"
  }, /*#__PURE__*/React.createElement(_lucideReact.GripVertical, {
    className: "h-2.5 w-2.5"
  })));
};
exports.ResizableHandle = ResizableHandle;