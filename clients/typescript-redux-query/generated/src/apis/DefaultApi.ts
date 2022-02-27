// tslint:disable
/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { HttpMethods, QueryConfig, ResponseBody, ResponseText } from 'redux-query';
import * as runtime from '../runtime';
import {
    Ip,
    IpFromJSON,
    IpToJSON,
} from '../models';

export interface GetIpRequest {
    format?: GetIpFormatEnum;
    callback?: string;
}


/**
 * Get your public IP address
 */
function getIpRaw<T>(requestParameters: GetIpRequest, requestConfig: runtime.TypedQueryConfig<T, Ip | string> = {}): QueryConfig<T> {
    let queryParameters = null;

    queryParameters = {};


    if (requestParameters.format !== undefined) {
        queryParameters['format'] = requestParameters.format;
    }


    if (requestParameters.callback !== undefined) {
        queryParameters['callback'] = requestParameters.callback;
    }

    const headerParameters : runtime.HttpHeaders = {};


    const { meta = {} } = requestConfig;

    const config: QueryConfig<T> = {
        url: `${runtime.Configuration.basePath}/`,
        meta,
        update: requestConfig.update,
        queryKey: requestConfig.queryKey,
        optimisticUpdate: requestConfig.optimisticUpdate,
        force: requestConfig.force,
        rollback: requestConfig.rollback,
        options: {
            method: 'GET',
            headers: headerParameters,
        },
        body: queryParameters,
    };

    const { transform: requestTransform } = requestConfig;
    if (requestTransform) {
        config.transform = (body: ResponseBody, text: ResponseBody) => requestTransform(Ip | stringFromJSON(body), text);
    }

    return config;
}

/**
* Get your public IP address
*/
export function getIp<T>(requestParameters: GetIpRequest, requestConfig?: runtime.TypedQueryConfig<T, Ip | string>): QueryConfig<T> {
    return getIpRaw(requestParameters, requestConfig);
}


/**
    * @export
    * @enum {string}
    */
export enum GetIpFormatEnum {
    Json = 'json',
    Jsonp = 'jsonp'
}
