#import <Foundation/Foundation.h>

/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 5.1.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


/**
 * A key for deserialization ErrorDomain
 */
extern NSString *const OAIDeserializationErrorDomainKey;

/**
 * Code for deserialization type mismatch error
 */
extern NSInteger const OAITypeMismatchErrorCode;

/**
 * Code for deserialization empty value error
 */
extern NSInteger const OAIEmptyValueOccurredErrorCode;

/**
 * Error code for unknown response
 */
extern NSInteger const OAIUnknownResponseObjectErrorCode;

@protocol OAIResponseDeserializer <NSObject>

/**
 * Deserializes the given data to Objective-C object.
 *
 * @param data The data will be deserialized.
 * @param className The type of objective-c object.
 * @param error The error
 */
- (id) deserialize:(id) data class:(NSString *) className error:(NSError**)error;

@end

@interface OAIResponseDeserializer : NSObject <OAIResponseDeserializer>

/**
 *  If a null value occurs in dictionary or array if set to YES whole response will be invalid else will be ignored
 *  @default NO
 */
@property (nonatomic, assign) BOOL treatNullAsError;

@end
