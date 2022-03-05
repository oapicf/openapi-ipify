/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get your public IP address
*
* format String Response format (optional)
* callback String JSONP callback function name (optional)
* returns Ip
* */
const getIp = ({ format, callback }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        format,
        callback,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  getIp,
};
