/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * OpenAPI spec version: 3.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIDefaultApi.h"

#include "OpenAPIIp.h"

namespace OpenAPI
{

/* Get your public IP address

*/
class OPENAPI_API OpenAPIDefaultApi::GetIpRequest : public Request
{
public:
    virtual ~GetIpRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	enum class FormatEnum
	{
		Json,
		Jsonp,
  	};

	static FString EnumToString(const FormatEnum& EnumValue);
	static bool EnumFromString(const FString& EnumAsString, FormatEnum& EnumValue);
	/* Response format */
	TOptional<FormatEnum> Format;
	/* JSONP callback function name */
	TOptional<FString> Callback;
};

class OPENAPI_API OpenAPIDefaultApi::GetIpResponse : public Response
{
public:
    virtual ~GetIpResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    OpenAPIIp Content;
};

}
