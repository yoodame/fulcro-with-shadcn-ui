"use strict";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.CarouselPrevious = exports.CarouselNext = exports.CarouselItem = exports.CarouselContent = exports.Carousel = void 0;
var React = _interopRequireWildcard(require("react"));
var _emblaCarouselReact = _interopRequireDefault(require("embla-carousel-react"));
var _lucideReact = require("lucide-react");
var _utils = require("../../lib/utils");
var _button = require("./button");
var _excluded = ["orientation", "opts", "setApi", "plugins", "className", "children"],
  _excluded2 = ["className"],
  _excluded3 = ["className"],
  _excluded4 = ["className", "variant", "size"],
  _excluded5 = ["className", "variant", "size"];
function _interopRequireDefault(e) { return e && e.__esModule ? e : { default: e }; }
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function ownKeys(e, r) { var t = Object.keys(e); if (Object.getOwnPropertySymbols) { var o = Object.getOwnPropertySymbols(e); r && (o = o.filter(function (r) { return Object.getOwnPropertyDescriptor(e, r).enumerable; })), t.push.apply(t, o); } return t; }
function _objectSpread(e) { for (var r = 1; r < arguments.length; r++) { var t = null != arguments[r] ? arguments[r] : {}; r % 2 ? ownKeys(Object(t), !0).forEach(function (r) { _defineProperty(e, r, t[r]); }) : Object.getOwnPropertyDescriptors ? Object.defineProperties(e, Object.getOwnPropertyDescriptors(t)) : ownKeys(Object(t)).forEach(function (r) { Object.defineProperty(e, r, Object.getOwnPropertyDescriptor(t, r)); }); } return e; }
function _defineProperty(e, r, t) { return (r = _toPropertyKey(r)) in e ? Object.defineProperty(e, r, { value: t, enumerable: !0, configurable: !0, writable: !0 }) : e[r] = t, e; }
function _toPropertyKey(t) { var i = _toPrimitive(t, "string"); return "symbol" == typeof i ? i : i + ""; }
function _toPrimitive(t, r) { if ("object" != typeof t || !t) return t; var e = t[Symbol.toPrimitive]; if (void 0 !== e) { var i = e.call(t, r || "default"); if ("object" != typeof i) return i; throw new TypeError("@@toPrimitive must return a primitive value."); } return ("string" === r ? String : Number)(t); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
var CarouselContext = /*#__PURE__*/React.createContext(null);
function useCarousel() {
  var context = React.useContext(CarouselContext);
  if (!context) {
    throw new Error("useCarousel must be used within a <Carousel />");
  }
  return context;
}
var Carousel = exports.Carousel = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      orientation = "horizontal",
      opts,
      setApi,
      plugins,
      className,
      children
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  var [carouselRef, api] = (0, _emblaCarouselReact.default)(_objectSpread(_objectSpread({}, opts), {}, {
    axis: orientation === "horizontal" ? "x" : "y"
  }), plugins);
  var [canScrollPrev, setCanScrollPrev] = React.useState(false);
  var [canScrollNext, setCanScrollNext] = React.useState(false);
  var onSelect = React.useCallback(api => {
    if (!api) {
      return;
    }
    setCanScrollPrev(api.canScrollPrev());
    setCanScrollNext(api.canScrollNext());
  }, []);
  var scrollPrev = React.useCallback(() => {
    api === null || api === void 0 || api.scrollPrev();
  }, [api]);
  var scrollNext = React.useCallback(() => {
    api === null || api === void 0 || api.scrollNext();
  }, [api]);
  var handleKeyDown = React.useCallback(event => {
    if (event.key === "ArrowLeft") {
      event.preventDefault();
      scrollPrev();
    } else if (event.key === "ArrowRight") {
      event.preventDefault();
      scrollNext();
    }
  }, [scrollPrev, scrollNext]);
  React.useEffect(() => {
    if (!api || !setApi) {
      return;
    }
    setApi(api);
  }, [api, setApi]);
  React.useEffect(() => {
    if (!api) {
      return;
    }
    onSelect(api);
    api.on("reInit", onSelect);
    api.on("select", onSelect);
    return () => {
      api === null || api === void 0 || api.off("select", onSelect);
    };
  }, [api, onSelect]);
  return /*#__PURE__*/React.createElement(CarouselContext.Provider, {
    value: {
      carouselRef,
      api: api,
      opts,
      orientation: orientation || ((opts === null || opts === void 0 ? void 0 : opts.axis) === "y" ? "vertical" : "horizontal"),
      scrollPrev,
      scrollNext,
      canScrollPrev,
      canScrollNext
    }
  }, /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    onKeyDownCapture: handleKeyDown,
    className: (0, _utils.cn)("relative", className),
    role: "region",
    "aria-roledescription": "carousel"
  }, props), children));
});
Carousel.displayName = "Carousel";
var CarouselContent = exports.CarouselContent = /*#__PURE__*/React.forwardRef((_ref2, ref) => {
  var {
      className
    } = _ref2,
    props = _objectWithoutProperties(_ref2, _excluded2);
  var {
    carouselRef,
    orientation
  } = useCarousel();
  return /*#__PURE__*/React.createElement("div", {
    ref: carouselRef,
    className: "overflow-hidden"
  }, /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    className: (0, _utils.cn)("flex", orientation === "horizontal" ? "-ml-4" : "-mt-4 flex-col", className)
  }, props)));
});
CarouselContent.displayName = "CarouselContent";
var CarouselItem = exports.CarouselItem = /*#__PURE__*/React.forwardRef((_ref3, ref) => {
  var {
      className
    } = _ref3,
    props = _objectWithoutProperties(_ref3, _excluded3);
  var {
    orientation
  } = useCarousel();
  return /*#__PURE__*/React.createElement("div", _extends({
    ref: ref,
    role: "group",
    "aria-roledescription": "slide",
    className: (0, _utils.cn)("min-w-0 shrink-0 grow-0 basis-full", orientation === "horizontal" ? "pl-4" : "pt-4", className)
  }, props));
});
CarouselItem.displayName = "CarouselItem";
var CarouselPrevious = exports.CarouselPrevious = /*#__PURE__*/React.forwardRef((_ref4, ref) => {
  var {
      className,
      variant = "outline",
      size = "icon"
    } = _ref4,
    props = _objectWithoutProperties(_ref4, _excluded4);
  var {
    orientation,
    scrollPrev,
    canScrollPrev
  } = useCarousel();
  return /*#__PURE__*/React.createElement(_button.Button, _extends({
    ref: ref,
    variant: variant,
    size: size,
    className: (0, _utils.cn)("absolute  h-8 w-8 rounded-full", orientation === "horizontal" ? "-left-12 top-1/2 -translate-y-1/2" : "-top-12 left-1/2 -translate-x-1/2 rotate-90", className),
    disabled: !canScrollPrev,
    onClick: scrollPrev
  }, props), /*#__PURE__*/React.createElement(_lucideReact.ArrowLeft, {
    className: "h-4 w-4"
  }), /*#__PURE__*/React.createElement("span", {
    className: "sr-only"
  }, "Previous slide"));
});
CarouselPrevious.displayName = "CarouselPrevious";
var CarouselNext = exports.CarouselNext = /*#__PURE__*/React.forwardRef((_ref5, ref) => {
  var {
      className,
      variant = "outline",
      size = "icon"
    } = _ref5,
    props = _objectWithoutProperties(_ref5, _excluded5);
  var {
    orientation,
    scrollNext,
    canScrollNext
  } = useCarousel();
  return /*#__PURE__*/React.createElement(_button.Button, _extends({
    ref: ref,
    variant: variant,
    size: size,
    className: (0, _utils.cn)("absolute h-8 w-8 rounded-full", orientation === "horizontal" ? "-right-12 top-1/2 -translate-y-1/2" : "-bottom-12 left-1/2 -translate-x-1/2 rotate-90", className),
    disabled: !canScrollNext,
    onClick: scrollNext
  }, props), /*#__PURE__*/React.createElement(_lucideReact.ArrowRight, {
    className: "h-4 w-4"
  }), /*#__PURE__*/React.createElement("span", {
    className: "sr-only"
  }, "Next slide"));
});
CarouselNext.displayName = "CarouselNext";