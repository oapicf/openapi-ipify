import { ResponseContext, RequestContext, HttpFile } from '../http/http';
import * as models from '../models/all';
import { Configuration} from '../configuration'

import { Ip } from '../models/Ip';

import { ObservableDefaultApi } from "./ObservableAPI";
import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";

export interface DefaultApiGetIpRequest {
    /**
     * Response format
     * @type &#39;json&#39; | &#39;jsonp&#39;
     * @memberof DefaultApigetIp
     */
    format?: 'json' | 'jsonp'
    /**
     * JSONP callback function name
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
    public getIp(param: DefaultApiGetIpRequest = {}, options?: Configuration): Promise<Ip | string> {
        return this.api.getIp(param.format, param.callback,  options).toPromise();
    }

}
