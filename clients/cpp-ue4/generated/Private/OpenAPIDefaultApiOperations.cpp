/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * OpenAPI spec version: 5.2.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIDefaultApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIDefaultApi::GetIpRequest::FormatEnum& Value)
{
	switch (Value)
	{
	case OpenAPIDefaultApi::GetIpRequest::FormatEnum::Json:
		return TEXT("json");
	case OpenAPIDefaultApi::GetIpRequest::FormatEnum::Jsonp:
		return TEXT("jsonp");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIDefaultApi::GetIpRequest::FormatEnum Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIDefaultApi::GetIpRequest::EnumToString(const OpenAPIDefaultApi::GetIpRequest::FormatEnum& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIDefaultApi::GetIpRequest::FormatEnum& Value)
{
	static TMap<FString, OpenAPIDefaultApi::GetIpRequest::FormatEnum> StringToEnum = { 
		{ TEXT("json"), OpenAPIDefaultApi::GetIpRequest::FormatEnum::Json },
		{ TEXT("jsonp"), OpenAPIDefaultApi::GetIpRequest::FormatEnum::Jsonp }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIDefaultApi::GetIpRequest::EnumFromString(const FString& EnumAsString, OpenAPIDefaultApi::GetIpRequest::FormatEnum& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIDefaultApi::GetIpRequest::FormatEnum& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIDefaultApi::GetIpRequest::FormatEnum& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

FString OpenAPIDefaultApi::GetIpRequest::ComputePath() const
{
	FString Path(TEXT("/"));
	TArray<FString> QueryParams;
	if(Format.IsSet())
	{
		QueryParams.Add(FString(TEXT("format=")) + ToUrlString(Format.GetValue()));
	}
	if(Callback.IsSet())
	{
		QueryParams.Add(FString(TEXT("callback=")) + ToUrlString(Callback.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIDefaultApi::GetIpRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("text/plain"), TEXT("application/javascript"), TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIDefaultApi::GetIpResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Your public IP address"));
		break;
	}
}

bool OpenAPIDefaultApi::GetIpResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
