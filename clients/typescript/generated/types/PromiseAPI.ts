import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration, PromiseConfigurationOptions, wrapOptions } from '../configuration'
import { PromiseMiddleware, Middleware, PromiseMiddlewareWrapper } from '../middleware';

import { GetIp200Response } from '../models/GetIp200Response';
import { ObservableDefaultApi } from './ObservableAPI';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class PromiseDefaultApi {
    private api: ObservableDefaultApi

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.api = new ObservableDefaultApi(configuration, requestFactory, responseProcessor);
    }

    /**
     * Get your public IP address
     * @param [format] Response format
     * @param [callback] JSONP callback function name
     */
    public getIpWithHttpInfo(format?: 'json' | 'jsonp', callback?: string, _options?: PromiseConfigurationOptions): Promise<HttpInfo<string>> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getIpWithHttpInfo(format, callback, observableOptions);
        return result.toPromise();
    }

    /**
     * Get your public IP address
     * @param [format] Response format
     * @param [callback] JSONP callback function name
     */
    public getIp(format?: 'json' | 'jsonp', callback?: string, _options?: PromiseConfigurationOptions): Promise<string> {
        const observableOptions = wrapOptions(_options);
        const result = this.api.getIp(format, callback, observableOptions);
        return result.toPromise();
    }


}



