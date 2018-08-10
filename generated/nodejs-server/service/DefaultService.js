'use strict';


/**
 * Get your public IP address
 *
 * format String Response format (optional)
 * callback String JSONP callback function name (optional)
 * returns Object
 **/
exports.getIp = function(format,callback) {
  return new Promise(function(resolve, reject) {
    var examples = {};
    if (Object.keys(examples).length > 0) {
      resolve(examples[Object.keys(examples)[0]]);
    } else {
      resolve();
    }
  });
}

