var webpackConfig = require('./webpack.config.js');
var path = require("path");
var UglifyJsPlugin = require("webpack/lib/optimize/UglifyJsPlugin");
var DefinePlugin = require("webpack/lib/DefinePlugin");
var NormalModuleReplacementPlugin = require("webpack/lib/NormalModuleReplacementPlugin");

webpackConfig.plugins = [
    new DefinePlugin({
        "__DEVTOOLS__": false
    }),
    new DefinePlugin({
      'process.env': {
        'NODE_ENV': '"production"'
      }
    }),
    new NormalModuleReplacementPlugin(/leaflet$/, path.join(__dirname, "MapStore2", "web", "client", "libs", "leaflet")),
    new NormalModuleReplacementPlugin(/openlayers$/, path.join(__dirname, "MapStore2", "web", "client", "libs", "openlayers")),
    new NormalModuleReplacementPlugin(/proj4$/, path.join(__dirname, "MapStore2", "web", "client", "libs", "proj4")),
    new NormalModuleReplacementPlugin(/map\/openlayers\/Feature/, path.join(__dirname, "js", "Ms2Override", "Feature.jsx")),
    new NormalModuleReplacementPlugin(/map\/openlayers\/plugins\/VectorLayer/, path.join(__dirname, "js", "Ms2Override", "VectorLayer.jsx")),
    new NormalModuleReplacementPlugin(/ConfigUtils/, path.join(__dirname, "js", "utils", "ConfigUtils.js")),
    new NormalModuleReplacementPlugin(/WMSLayer/, path.join(__dirname, "js", "Ms2Override", "WMSLayer.js")),
    new NormalModuleReplacementPlugin(/map\/openlayers\/plugins\/WMSLayer/, path.join(__dirname, "js", "Ms2Override", "WMSLayer.jsx")),
    new NormalModuleReplacementPlugin(/WMSLegend/, path.join(__dirname, "js", "Ms2Override", "WMSLegend.jsx")),
    new NormalModuleReplacementPlugin(/RecordItem/, path.join(__dirname, "js", "Ms2Override", "RecordItem.jsx")),
    new UglifyJsPlugin({
        compress: {warnings: false},
        mangle: true
    })
];
webpackConfig.devtool = undefined;
webpackConfig.debug = false;

// this is a workaround for this issue https://github.com/webpack/file-loader/issues/3
// use `__webpack_public_path__` in the index.html when fixed
webpackConfig.output.publicPath = "dist/";

module.exports = webpackConfig;
