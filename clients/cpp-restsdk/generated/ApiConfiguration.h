/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ApiConfiguration.h
 *
 * This class represents a single item of a multipart-formdata request.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_API_ApiConfiguration_H_
#define ORG_OPENAPITOOLS_CLIENT_API_ApiConfiguration_H_



#include <map>

#include <cpprest/details/basic_types.h>
#include <cpprest/http_client.h>
namespace org {
namespace openapitools {
namespace client {
namespace api {

class  ApiConfiguration
{
public:
    ApiConfiguration();
    virtual ~ApiConfiguration();

    const web::http::client::http_client_config& getHttpConfig() const;
    void setHttpConfig( web::http::client::http_client_config& value );

    utility::string_t getBaseUrl() const;
    void setBaseUrl( const utility::string_t value );

    utility::string_t getUserAgent() const;
    void setUserAgent( const utility::string_t value );

    std::map<utility::string_t, utility::string_t>& getDefaultHeaders();
    const std::map<utility::string_t, utility::string_t>& getDefaultHeaders() const;

    utility::string_t getApiKey( const utility::string_t& prefix) const;
    void setApiKey( const utility::string_t& prefix, const utility::string_t& apiKey );

protected:
    utility::string_t m_BaseUrl;
    std::map<utility::string_t, utility::string_t> m_DefaultHeaders;
    std::map<utility::string_t, utility::string_t> m_ApiKeys;
    web::http::client::http_client_config m_HttpConfig;
    utility::string_t m_UserAgent;
};

}
}
}
}
#endif /* ORG_OPENAPITOOLS_CLIENT_API_ApiConfiguration_H_ */
