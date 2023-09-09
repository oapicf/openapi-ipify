import { ResponseContext, RequestContext, HttpFile, HttpInfo } from '../http/http';
import { Configuration} from '../configuration'
import { Observable, of, from } from '../rxjsStub';
import {mergeMap, map} from  '../rxjsStub';
import { Ip } from '../models/Ip';

import { DefaultApiRequestFactory, DefaultApiResponseProcessor} from "../apis/DefaultApi";
export class ObservableDefaultApi {
    private requestFactory: DefaultApiRequestFactory;
    private responseProcessor: DefaultApiResponseProcessor;
    private configuration: Configuration;

    public constructor(
        configuration: Configuration,
        requestFactory?: DefaultApiRequestFactory,
        responseProcessor?: DefaultApiResponseProcessor
    ) {
        this.configuration = configuration;
        this.requestFactory = requestFactory || new DefaultApiRequestFactory(configuration);
        this.responseProcessor = responseProcessor || new DefaultApiResponseProcessor();
    }

    /**
     * Get your public IP address
     * @param format Response format
     * @param callback JSONP callback function name
     */
    public getIpWithHttpInfo(format?: 'json' | 'jsonp', callback?: string, _options?: Configuration): Observable<HttpInfo<Ip>> {
        const requestContextPromise = this.requestFactory.getIp(format, callback, _options);

        // build promise chain
        let middlewarePreObservable = from<RequestContext>(requestContextPromise);
        for (let middleware of this.configuration.middleware) {
            middlewarePreObservable = middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => middleware.pre(ctx)));
        }

        return middlewarePreObservable.pipe(mergeMap((ctx: RequestContext) => this.configuration.httpApi.send(ctx))).
            pipe(mergeMap((response: ResponseContext) => {
                let middlewarePostObservable = of(response);
                for (let middleware of this.configuration.middleware) {
                    middlewarePostObservable = middlewarePostObservable.pipe(mergeMap((rsp: ResponseContext) => middleware.post(rsp)));
                }
                return middlewarePostObservable.pipe(map((rsp: ResponseContext) => this.responseProcessor.getIpWithHttpInfo(rsp)));
            }));
    }

    /**
     * Get your public IP address
     * @param format Response format
     * @param callback JSONP callback function name
     */
    public getIp(format?: 'json' | 'jsonp', callback?: string, _options?: Configuration): Observable<Ip> {
        return this.getIpWithHttpInfo(format, callback, _options).pipe(map((apiResponse: HttpInfo<Ip>) => apiResponse.data));
    }

}
