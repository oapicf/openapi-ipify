var Ipify = require('openapi_ipify');

var api = new Ipify.DefaultApi();
var opts = {
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
    process.exitCode = 1;
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getIp(opts, callback);
