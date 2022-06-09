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

/*
* DefaultApiImpl.h
*
* 
*/

#ifndef DEFAULT_API_IMPL_H_
#define DEFAULT_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <DefaultApi.h>


#include "Ip.h"
#include <string>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class DefaultApiImpl : public org::openapitools::server::api::DefaultApi {
public:
    explicit DefaultApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~DefaultApiImpl() override = default;

    void get_ip(const std::optional<std::string> &format, const std::optional<std::string> &callback, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
