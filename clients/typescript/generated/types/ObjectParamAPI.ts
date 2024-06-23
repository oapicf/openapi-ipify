import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'


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
    public getIpWithHttpInfo(param: DefaultApiGetIpRequest = {}, options?: Configuration): Promise<HttpInfo<string>> {
        return this.api.getIpWithHttpInfo(param.format, param.callback,  options).toPromise();
    }

    /**
     * Get your public IP address
     * @param param the request object
     */
    public getIp(param: DefaultApiGetIpRequest = {}, options?: Configuration): Promise<string> {
        return this.api.getIp(param.format, param.callback,  options).toPromise();
    }

}
