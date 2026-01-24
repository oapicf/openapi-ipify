import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, ConfigurationOptions } from '../configuration'
import type { Middleware } from '../middleware';

import { GetIp200Response } from '../models/GetIp200Response';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetIpRequest {
    /**
     * Response format
     * Defaults to: undefined
     * @type &#39;json&#39; | &#39;jsonp&#39;
     * @memberof DefaultApigetIp
     */
    format?: 'json' | 'jsonp'
    /**
     * JSONP callback function name
     * Defaults to: undefined
     * @type string
     * @memberof DefaultApigetIp
     */
    callback?: string
}

export class ObjectDefaultApi {
    private api: ObservableDefaultApi

    public constructor(configuration: Configuration, requestFactory?: DefaultApiRequestFactory, responseProcessor?: DefaultApiResponseProcessor) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get your public IP address
     * @param param the request object
     */
    public getIpWithHttpInfo(param: DefaultApiGetIpRequest = {}, options?: ConfigurationOptions): Promise<HttpInfo<string>> {
        return this.api.getIpWithHttpInfo(param.format, param.callback,  options).toPromise();
    }

    /**
     * Get your public IP address
     * @param param the request object
     */
    public getIp(param: DefaultApiGetIpRequest = {}, options?: ConfigurationOptions): Promise<string> {
        return this.api.getIp(param.format, param.callback,  options).toPromise();
    }

}
