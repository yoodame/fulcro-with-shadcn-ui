"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.PaginationPrevious = exports.PaginationNext = exports.PaginationLink = exports.PaginationItem = exports.PaginationEllipsis = exports.PaginationContent = exports.Pagination = void 0;
var React = _interopRequireWildcard(require("react"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _button = require("./button");
var _excluded = ["className"],
  _excluded2 = ["className"],
  _excluded3 = ["className"],
  _excluded4 = ["className", "isActive", "size"],
  _excluded5 = ["className"],
  _excluded6 = ["className"],
  _excluded7 = ["className"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var Pagination = _ref => {
  var {
      className
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  return /*#__PURE__*/React.createElement("nav", _extends({
    role: "navigation",
    "aria-label": "pagination",
    className: (0, _utils.cn)("mx-auto flex w-full justify-center", className)
  }, props));
};
exports.Pagination = Pagination;
Pagination.displayName = "Pagination";
var PaginationContent = exports.PaginationContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  return /*#__PURE__*/React.createElement("ul", _extends({
    ref: ref,
    className: (0, _utils.cn)("flex flex-row items-center gap-1", className)
  }, props));
});
PaginationContent.displayName = "PaginationContent";
var PaginationItem = exports.PaginationItem = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  return /*#__PURE__*/React.createElement("li", _extends({
    ref: ref,
    className: (0, _utils.cn)("", className)
  }, props));
});
PaginationItem.displayName = "PaginationItem";
var PaginationLink = _ref4 => {
  var {
      className,
      isActive,
      size = "icon"
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  return /*#__PURE__*/React.createElement("a", _extends({
    "aria-current": isActive ? "page" : undefined,
    className: (0, _utils.cn)((0, _button.buttonVariants)({
      variant: isActive ? "outline" : "ghost",
      size
    }), className)
  }, props));
};
exports.PaginationLink = PaginationLink;
PaginationLink.displayName = "PaginationLink";
var PaginationPrevious = _ref5 => {
  var {
      className
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  return /*#__PURE__*/React.createElement(PaginationLink, _extends({
    "aria-label": "Go to previous page",
    size: "default",
    className: (0, _utils.cn)("gap-1 pl-2.5", className)
  }, props), /*#__PURE__*/React.createElement(_lucideReact.ChevronLeft, {
    className: "h-4 w-4"
  }), /*#__PURE__*/React.createElement("span", null, "Previous"));
};
exports.PaginationPrevious = PaginationPrevious;
PaginationPrevious.displayName = "PaginationPrevious";
var PaginationNext = _ref6 => {
  var {
      className
    } = _ref6,
    props = _objectWithoutProperties(_ref6, _excluded6);
  return /*#__PURE__*/React.createElement(PaginationLink, _extends({
    "aria-label": "Go to next page",
    size: "default",
    className: (0, _utils.cn)("gap-1 pr-2.5", className)
  }, props), /*#__PURE__*/React.createElement("span", null, "Next"), /*#__PURE__*/React.createElement(_lucideReact.ChevronRight, {
    className: "h-4 w-4"
  }));
};
exports.PaginationNext = PaginationNext;
PaginationNext.displayName = "PaginationNext";
var PaginationEllipsis = _ref7 => {
  var {
      className
    } = _ref7,
    props = _objectWithoutProperties(_ref7, _excluded7);
  return /*#__PURE__*/React.createElement("span", _extends({
    "aria-hidden": true,
    className: (0, _utils.cn)("flex h-9 w-9 items-center justify-center", className)
  }, props), /*#__PURE__*/React.createElement(_lucideReact.MoreHorizontal, {
    className: "h-4 w-4"
  }), /*#__PURE__*/React.createElement("span", {
    className: "sr-only"
  }, "More pages"));
};
exports.PaginationEllipsis = PaginationEllipsis;
PaginationEllipsis.displayName = "PaginationEllipsis";