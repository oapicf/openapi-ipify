//
// DefaultAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
#if canImport(AnyCodable)
import AnyCodable
#endif

open class DefaultAPI {

    /**
     * enum for parameter format
     */
    public enum Format_getIp: String, CaseIterable {
        case json = "json"
        case jsonp = "jsonp"
    }

    /**
     Get your public IP address
     
     - parameter format: (query) Response format (optional)
     - parameter callback: (query) JSONP callback function name (optional)
     - parameter apiResponseQueue: The queue on which api response is dispatched.
     - parameter completion: completion handler to receive the data and the error objects
     */
    @discardableResult
    open class func getIp(format: Format_getIp? = nil, callback: String? = nil, apiResponseQueue: DispatchQueue = OpenAPIClientAPI.apiResponseQueue, completion: @escaping ((_ data: GetIp200?, _ error: Error?) -> Void)) -> RequestTask {
        return getIpWithRequestBuilder(format: format, callback: callback).execute(apiResponseQueue) { result in
            switch result {
            case let .success(response):
                completion(response.body, nil)
            case let .failure(error):
                completion(nil, error)
            }
        }
    }

    /**
     Get your public IP address
     - GET /
     - parameter format: (query) Response format (optional)
     - parameter callback: (query) JSONP callback function name (optional)
     - returns: RequestBuilder<GetIp200> 
     */
    open class func getIpWithRequestBuilder(format: Format_getIp? = nil, callback: String? = nil) -> RequestBuilder<GetIp200> {
        let localVariablePath = "/"
        let localVariableURLString = OpenAPIClientAPI.basePath + localVariablePath
        let localVariableParameters: [String: Any]? = nil

        var localVariableUrlComponents = URLComponents(string: localVariableURLString)
        localVariableUrlComponents?.queryItems = APIHelper.mapValuesToQueryItems([
            "format": format?.encodeToJSON(),
            "callback": callback?.encodeToJSON(),
        ])

        let localVariableNillableHeaders: [String: Any?] = [
            :
        ]

        let localVariableHeaderParameters = APIHelper.rejectNilHeaders(localVariableNillableHeaders)

        let localVariableRequestBuilder: RequestBuilder<GetIp200>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return localVariableRequestBuilder.init(method: "GET", URLString: (localVariableUrlComponents?.string ?? localVariableURLString), parameters: localVariableParameters, headers: localVariableHeaderParameters)
    }
}
