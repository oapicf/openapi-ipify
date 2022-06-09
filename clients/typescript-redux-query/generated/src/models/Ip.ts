// tslint:disable
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
 */

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface Ip
 */
export interface Ip  {
    /**
     * 
     * @type {string}
     * @memberof Ip
     */
    ip: string;
}

export function IpFromJSON(json: any): Ip {
    return {
        'ip': json['ip'],
    };
}

export function IpToJSON(value?: Ip): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'ip': value.ip,
    };
}


