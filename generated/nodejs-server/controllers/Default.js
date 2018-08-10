'use strict';

var utils = require('../utils/writer.js');
var Default = require('../service/DefaultService');

module.exports.getIp = function getIp (req, res, next) {
  var format = req.swagger.params['format'].value;
  var callback = req.swagger.params['callback'].value;
  Default.getIp(format,callback)
    .then(function (response) {
      utils.writeJson(res, response);
    })
    .catch(function (response) {
      utils.writeJson(res, response);
    });
};
