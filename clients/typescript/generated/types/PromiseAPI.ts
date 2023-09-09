import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'

import { Ip } from '../models/Ip';
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
     * @param format Response format
     * @param callback JSONP callback function name
     */
    public getIpWithHttpInfo(format?: 'json' | 'jsonp', callback?: string, _options?: Configuration): Promise<HttpInfo<Ip>> {
        const result = this.api.getIpWithHttpInfo(format, callback, _options);
        return result.toPromise();
    }

    /**
     * Get your public IP address
     * @param format Response format
     * @param callback JSONP callback function name
     */
    public getIp(format?: 'json' | 'jsonp', callback?: string, _options?: Configuration): Promise<Ip> {
        const result = this.api.getIp(format, callback, _options);
        return result.toPromise();
    }


}



