/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 3.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */



import ApiClient from "../ApiClient";
import Ip from '../model/Ip';

/**
* Default service.
* @module api/DefaultApi
* @version 3.0.1-pre.0
*/
export default class DefaultApi extends ApiClient {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    */
    constructor() {
      super();
      this.baseURL = null;
    }


    /**
     * Get your public IP address
     * @param {Object} opts Optional parameters
     * @param {String} opts.format Response format
     * @param {String} opts.callback JSONP callback function name
     * @return {Promise<Ip>}
     */
    async getIp(opts) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'format': opts['format'],
        'callback': opts['callback']
      };
      let headerParams = {
        'User-Agent': 'OpenAPI-Generator/3.0.1-pre.0/Javascript',
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'application/javascript', 'text/plain'];
      let returnType = Ip;

      return this.callApi(
        '/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }


}
