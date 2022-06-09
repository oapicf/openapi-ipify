/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * OpenAPI spec version: 2.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class Ip {
    'ip': string;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "ip",
            "baseName": "ip",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return Ip.attributeTypeMap;
    }

    public constructor() {
    }
}

