/* tslint:disable */
/* eslint-disable */
/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 3.2.2-pre.0
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
export interface Ip {
    /**
     * 
     * @type {string}
     * @memberof Ip
     */
    ip: string;
}

/**
 * Check if a given object implements the Ip interface.
 */
export function instanceOfIp(value: object): boolean {
    let isInstance = true;
    isInstance = isInstance && "ip" in value;

    return isInstance;
}

export function IpFromJSON(json: any): Ip {
    return IpFromJSONTyped(json, false);
}

export function IpFromJSONTyped(json: any, ignoreDiscriminator: boolean): Ip {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'ip': json['ip'],
    };
}

export function IpToJSON(value?: Ip | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'ip': value.ip,
    };
}

