/* tslint:disable */
/* eslint-disable */
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
 */


import * as runtime from '../runtime';
import type {
  Ip,
} from '../models';
import {
    IpFromJSON,
    IpToJSON,
} from '../models';

export interface GetIpRequest {
    format?: GetIpFormatEnum;
    callback?: string;
}

/**
 * 
 */
export class DefaultApi extends runtime.BaseAPI {

    /**
     * Get your public IP address
     */
    async getIpRaw(requestParameters: GetIpRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Ip>> {
        const queryParameters: any = {};

        if (requestParameters.format !== undefined) {
            queryParameters['format'] = requestParameters.format;
        }

        if (requestParameters.callback !== undefined) {
            queryParameters['callback'] = requestParameters.callback;
        }

        const headerParameters: runtime.HTTPHeaders = {};

        const response = await this.request({
            path: `/`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => IpFromJSON(jsonValue));
    }

    /**
     * Get your public IP address
     */
    async getIp(requestParameters: GetIpRequest = {}, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Ip> {
        const response = await this.getIpRaw(requestParameters, initOverrides);
        return await response.value();
    }

}

/**
 * @export
 */
export const GetIpFormatEnum = {
    Json: 'json',
    Jsonp: 'jsonp'
} as const;
export type GetIpFormatEnum = typeof GetIpFormatEnum[keyof typeof GetIpFormatEnum];
