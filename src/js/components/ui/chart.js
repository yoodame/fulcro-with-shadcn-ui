"use strict";
"use client";

Object.defineProperty(exports, "__esModule", {
  value: true
});
exports.ChartTooltipContent = exports.ChartTooltip = exports.ChartStyle = exports.ChartLegendContent = exports.ChartLegend = exports.ChartContainer = void 0;
var React = _interopRequireWildcard(require("react"));
var RechartsPrimitive = _interopRequireWildcard(require("recharts"));
var _utils = require("../../lib/utils");
var _excluded = ["id", "className", "children", "config"];
function _getRequireWildcardCache(e) { if ("function" != typeof WeakMap) return null; var r = new WeakMap(), t = new WeakMap(); return (_getRequireWildcardCache = function _getRequireWildcardCache(e) { return e ? t : r; })(e); }
function _interopRequireWildcard(e, r) { if (!r && e && e.__esModule) return e; if (null === e || "object" != typeof e && "function" != typeof e) return { default: e }; var t = _getRequireWildcardCache(r); if (t && t.has(e)) return t.get(e); var n = { __proto__: null }, a = Object.defineProperty && Object.getOwnPropertyDescriptor; for (var u in e) if ("default" !== u && {}.hasOwnProperty.call(e, u)) { var i = a ? Object.getOwnPropertyDescriptor(e, u) : null; i && (i.get || i.set) ? Object.defineProperty(n, u, i) : n[u] = e[u]; } return n.default = e, t && t.set(e, n), n; }
function _extends() { return _extends = Object.assign ? Object.assign.bind() : function (n) { for (var e = 1; e < arguments.length; e++) { var t = arguments[e]; for (var r in t) ({}).hasOwnProperty.call(t, r) && (n[r] = t[r]); } return n; }, _extends.apply(null, arguments); }
function _objectWithoutProperties(e, t) { if (null == e) return {}; var o, r, i = _objectWithoutPropertiesLoose(e, t); if (Object.getOwnPropertySymbols) { var s = Object.getOwnPropertySymbols(e); for (r = 0; r < s.length; r++) o = s[r], t.includes(o) || {}.propertyIsEnumerable.call(e, o) && (i[o] = e[o]); } return i; }
function _objectWithoutPropertiesLoose(r, e) { if (null == r) return {}; var t = {}; for (var n in r) if ({}.hasOwnProperty.call(r, n)) { if (e.includes(n)) continue; t[n] = r[n]; } return t; }
// Format: { THEME_NAME: CSS_SELECTOR }
var THEMES = {
  light: "",
  dark: ".dark"
};
var ChartContext = /*#__PURE__*/React.createContext(null);
function useChart() {
  var context = React.useContext(ChartContext);
  if (!context) {
    throw new Error("useChart must be used within a <ChartContainer />");
  }
  return context;
}
var ChartContainer = exports.ChartContainer = /*#__PURE__*/React.forwardRef((_ref, ref) => {
  var {
      id,
      className,
      children,
      config
    } = _ref,
    props = _objectWithoutProperties(_ref, _excluded);
  var uniqueId = React.useId();
  var chartId = "chart-".concat(id || uniqueId.replace(/:/g, ""));
  return /*#__PURE__*/React.createElement(ChartContext.Provider, {
    value: {
      config
    }
  }, /*#__PURE__*/React.createElement("div", _extends({
    "data-chart": chartId,
    ref: ref,
    className: (0, _utils.cn)("flex aspect-video justify-center text-xs [&_.recharts-cartesian-axis-tick_text]:fill-muted-foreground [&_.recharts-cartesian-grid_line[stroke='#ccc']]:stroke-border/50 [&_.recharts-curve.recharts-tooltip-cursor]:stroke-border [&_.recharts-dot[stroke='#fff']]:stroke-transparent [&_.recharts-layer]:outline-none [&_.recharts-polar-grid_[stroke='#ccc']]:stroke-border [&_.recharts-radial-bar-background-sector]:fill-muted [&_.recharts-rectangle.recharts-tooltip-cursor]:fill-muted [&_.recharts-reference-line_[stroke='#ccc']]:stroke-border [&_.recharts-sector[stroke='#fff']]:stroke-transparent [&_.recharts-sector]:outline-none [&_.recharts-surface]:outline-none", className)
  }, props), /*#__PURE__*/React.createElement(ChartStyle, {
    id: chartId,
    config: config
  }), /*#__PURE__*/React.createElement(RechartsPrimitive.ResponsiveContainer, null, children)));
});
ChartContainer.displayName = "Chart";
var ChartStyle = _ref2 => {
  var {
    id,
    config
  } = _ref2;
  var colorConfig = Object.entries(config).filter(_ref3 => {
    var [_, config] = _ref3;
    return config.theme || config.color;
  });
  if (!colorConfig.length) {
    return null;
  }
  return /*#__PURE__*/React.createElement("style", {
    dangerouslySetInnerHTML: {
      __html: Object.entries(THEMES).map(_ref4 => {
        var [theme, prefix] = _ref4;
        return "\n".concat(prefix, " [data-chart=").concat(id, "] {\n").concat(colorConfig.map(_ref5 => {
          var _itemConfig$theme;
          var [key, itemConfig] = _ref5;
          var color = ((_itemConfig$theme = itemConfig.theme) === null || _itemConfig$theme === void 0 ? void 0 : _itemConfig$theme[theme]) || itemConfig.color;
          return color ? "  --color-".concat(key, ": ").concat(color, ";") : null;
        }).join("\n"), "\n}\n");
      }).join("\n")
    }
  });
};
exports.ChartStyle = ChartStyle;
var ChartTooltip = exports.ChartTooltip = RechartsPrimitive.Tooltip;
var ChartTooltipContent = exports.ChartTooltipContent = /*#__PURE__*/React.forwardRef((_ref6, ref) => {
  var {
    active,
    payload,
    className,
    indicator = "dot",
    hideLabel = false,
    hideIndicator = false,
    label,
    labelFormatter,
    labelClassName,
    formatter,
    color,
    nameKey,
    labelKey
  } = _ref6;
  var {
    config
  } = useChart();
  var tooltipLabel = React.useMemo(() => {
    var _config$label;
    if (hideLabel || !(payload !== null && payload !== void 0 && payload.length)) {
      return null;
    }
    var [item] = payload;
    var key = "".concat(labelKey || item.dataKey || item.name || "value");
    var itemConfig = getPayloadConfigFromPayload(config, item, key);
    var value = !labelKey && typeof label === "string" ? ((_config$label = config[label]) === null || _config$label === void 0 ? void 0 : _config$label.label) || label : itemConfig === null || itemConfig === void 0 ? void 0 : itemConfig.label;
    if (labelFormatter) {
      return /*#__PURE__*/React.createElement("div", {
        className: (0, _utils.cn)("font-medium", labelClassName)
      }, labelFormatter(value, payload));
    }
    if (!value) {
      return null;
    }
    return /*#__PURE__*/React.createElement("div", {
      className: (0, _utils.cn)("font-medium", labelClassName)
    }, value);
  }, [label, labelFormatter, payload, hideLabel, labelClassName, config, labelKey]);
  if (!active || !(payload !== null && payload !== void 0 && payload.length)) {
    return null;
  }
  var nestLabel = payload.length === 1 && indicator !== "dot";
  return /*#__PURE__*/React.createElement("div", {
    ref: ref,
    className: (0, _utils.cn)("grid min-w-[8rem] items-start gap-1.5 rounded-lg border border-border/50 bg-background px-2.5 py-1.5 text-xs shadow-xl", className)
  }, !nestLabel ? tooltipLabel : null, /*#__PURE__*/React.createElement("div", {
    className: "grid gap-1.5"
  }, payload.map((item, index) => {
    var key = "".concat(nameKey || item.name || item.dataKey || "value");
    var itemConfig = getPayloadConfigFromPayload(config, item, key);
    var indicatorColor = color || item.payload.fill || item.color;
    return /*#__PURE__*/React.createElement("div", {
      key: item.dataKey,
      className: (0, _utils.cn)("flex w-full flex-wrap items-stretch gap-2 [&>svg]:h-2.5 [&>svg]:w-2.5 [&>svg]:text-muted-foreground", indicator === "dot" && "items-center")
    }, formatter && (item === null || item === void 0 ? void 0 : item.value) !== undefined && item.name ? formatter(item.value, item.name, item, index, item.payload) : /*#__PURE__*/React.createElement(React.Fragment, null, itemConfig !== null && itemConfig !== void 0 && itemConfig.icon ? /*#__PURE__*/React.createElement(itemConfig.icon, null) : !hideIndicator && /*#__PURE__*/React.createElement("div", {
      className: (0, _utils.cn)("shrink-0 rounded-[2px] border-[--color-border] bg-[--color-bg]", {
        "h-2.5 w-2.5": indicator === "dot",
        "w-1": indicator === "line",
        "w-0 border-[1.5px] border-dashed bg-transparent": indicator === "dashed",
        "my-0.5": nestLabel && indicator === "dashed"
      }),
      style: {
        "--color-bg": indicatorColor,
        "--color-border": indicatorColor
      }
    }), /*#__PURE__*/React.createElement("div", {
      className: (0, _utils.cn)("flex flex-1 justify-between leading-none", nestLabel ? "items-end" : "items-center")
    }, /*#__PURE__*/React.createElement("div", {
      className: "grid gap-1.5"
    }, nestLabel ? tooltipLabel : null, /*#__PURE__*/React.createElement("span", {
      className: "text-muted-foreground"
    }, (itemConfig === null || itemConfig === void 0 ? void 0 : itemConfig.label) || item.name)), item.value && /*#__PURE__*/React.createElement("span", {
      className: "font-mono font-medium tabular-nums text-foreground"
    }, item.value.toLocaleString()))));
  })));
});
ChartTooltipContent.displayName = "ChartTooltip";
var ChartLegend = exports.ChartLegend = RechartsPrimitive.Legend;
var ChartLegendContent = exports.ChartLegendContent = /*#__PURE__*/React.forwardRef((_ref7, ref) => {
  var {
    className,
    hideIcon = false,
    payload,
    verticalAlign = "bottom",
    nameKey
  } = _ref7;
  var {
    config
  } = useChart();
  if (!(payload !== null && payload !== void 0 && payload.length)) {
    return null;
  }
  return /*#__PURE__*/React.createElement("div", {
    ref: ref,
    className: (0, _utils.cn)("flex items-center justify-center gap-4", verticalAlign === "top" ? "pb-3" : "pt-3", className)
  }, payload.map(item => {
    var key = "".concat(nameKey || item.dataKey || "value");
    var itemConfig = getPayloadConfigFromPayload(config, item, key);
    return /*#__PURE__*/React.createElement("div", {
      key: item.value,
      className: (0, _utils.cn)("flex items-center gap-1.5 [&>svg]:h-3 [&>svg]:w-3 [&>svg]:text-muted-foreground")
    }, itemConfig !== null && itemConfig !== void 0 && itemConfig.icon && !hideIcon ? /*#__PURE__*/React.createElement(itemConfig.icon, null) : /*#__PURE__*/React.createElement("div", {
      className: "h-2 w-2 shrink-0 rounded-[2px]",
      style: {
        backgroundColor: item.color
      }
    }), itemConfig === null || itemConfig === void 0 ? void 0 : itemConfig.label);
  }));
});
ChartLegendContent.displayName = "ChartLegend";

// Helper to extract item config from a payload.
function getPayloadConfigFromPayload(config, payload, key) {
  if (typeof payload !== "object" || payload === null) {
    return undefined;
  }
  var payloadPayload = "payload" in payload && typeof payload.payload === "object" && payload.payload !== null ? payload.payload : undefined;
  var configLabelKey = key;
  if (key in payload && typeof payload[key] === "string") {
    configLabelKey = payload[key];
  } else if (payloadPayload && key in payloadPayload && typeof payloadPayload[key] === "string") {
    configLabelKey = payloadPayload[key];
  }
  return configLabelKey in config ? config[configLabelKey] : config[key];
}