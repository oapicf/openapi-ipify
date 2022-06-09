#import <Foundation/Foundation.h>
#import "OAIIp.h"
#import "OAIApi.h"

/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 2.0.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// Get your public IP address
/// 
///
/// @param format Response format (optional)
/// @param callback JSONP callback function name (optional)
/// 
///  code:200 message:"Your public IP address"
///
/// @return OAIIp*
-(NSURLSessionTask*) getIpWithFormat: (NSString*) format
    callback: (NSString*) callback
    completionHandler: (void (^)(OAIIp* output, NSError* error)) handler;



@end
