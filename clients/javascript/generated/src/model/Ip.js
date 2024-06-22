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

import ApiClient from '../ApiClient';

/**
 * The Ip model module.
 * @module model/Ip
 * @version 5.2.1-pre.0
 */
class Ip {
    /**
     * Constructs a new <code>Ip</code>.
     * @alias module:model/Ip
     * @param ip {String} 
     */
    constructor(ip) { 
        
        Ip.initialize(this, ip);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, ip) { 
        obj['ip'] = ip;
    }

    /**
     * Constructs a <code>Ip</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Ip} obj Optional instance to populate.
     * @return {module:model/Ip} The populated <code>Ip</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Ip();

            if (data.hasOwnProperty('ip')) {
                obj['ip'] = ApiClient.convertToType(data['ip'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Ip</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Ip</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of Ip.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['ip'] && !(typeof data['ip'] === 'string' || data['ip'] instanceof String)) {
            throw new Error("Expected the field `ip` to be a primitive type in the JSON string but got " + data['ip']);
        }

        return true;
    }


}

Ip.RequiredProperties = ["ip"];

/**
 * @member {String} ip
 */
Ip.prototype['ip'] = undefined;






export default Ip;

