/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 2.0.1-pre.0
 * Contact: blah@cliffano.com
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
 * @version 2.0.1-pre.0
 */
class Ip {
    /**
     * @member {String} ip
     * @type {String}
     */
    ip;

    

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
}



export default Ip;

