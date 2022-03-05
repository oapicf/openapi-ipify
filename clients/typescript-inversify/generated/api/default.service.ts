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
/* tslint:disable:no-unused-variable member-ordering */

import { Observable } from 'rxjs/Observable';

import { map } from 'rxjs/operators';
import IHttpClient from '../IHttpClient';
import { inject, injectable } from 'inversify';
import { IAPIConfiguration } from '../IAPIConfiguration';
import { Headers } from '../Headers';
import HttpResponse from '../HttpResponse';

import { Ip } from '../model/ip';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class DefaultService {
    private basePath: string = 'https://api.ipify.org';

    constructor(@inject('IApiHttpClient') private httpClient: IHttpClient,
        @inject('IAPIConfiguration') private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * Get your public IP address
     * 
     * @param format Response format
     * @param callback JSONP callback function name
     
     */
    public getIp(format?: 'json' | 'jsonp', callback?: string, observe?: 'body', headers?: Headers): Observable<Ip>;
    public getIp(format?: 'json' | 'jsonp', callback?: string, observe?: 'response', headers?: Headers): Observable<HttpResponse<Ip>>;
    public getIp(format?: 'json' | 'jsonp', callback?: string, observe: any = 'body', headers: Headers = {}): Observable<any> {
        let queryParameters: string[] = [];
        if (format !== undefined) {
            queryParameters.push('format='+encodeURIComponent(String(format)));
        }
        if (callback !== undefined) {
            queryParameters.push('callback='+encodeURIComponent(String(callback)));
        }

        headers['Accept'] = 'application/json, application/javascript, text/plain';

        const response: Observable<HttpResponse<Ip>> = this.httpClient.get(`${this.basePath}/?${queryParameters.join('&')}`, headers);
        if (observe === 'body') {
               return response.pipe(
                   map((httpResponse: HttpResponse) => <Ip>(httpResponse.response))
               );
        }
        return response;
    }

}