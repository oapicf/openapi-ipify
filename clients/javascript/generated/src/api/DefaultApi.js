/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.2.1-pre.0
 * Contact: blah+oapicf@cliffano.com
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
* @version 5.2.1-pre.0
*/
export default class DefaultApi {

    /**
    * Constructs a new DefaultApi. 
    * @alias module:api/DefaultApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getIp operation.
     * @callback module:api/DefaultApi~getIpCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Ip} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get your public IP address
     * @param {Object} opts Optional parameters
     * @param {module:model/String} [format] Response format
     * @param {String} [callback] JSONP callback function name
     * @param {module:api/DefaultApi~getIpCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Ip}
     */
    getIp(opts, callback) {
      opts = opts || {};
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
        'format': opts['format'],
        'callback': opts['callback']
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = [];
      let contentTypes = [];
      let accepts = ['application/json', 'application/javascript', 'text/plain'];
      let returnType = Ip;
      return this.apiClient.callApi(
        '/', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
