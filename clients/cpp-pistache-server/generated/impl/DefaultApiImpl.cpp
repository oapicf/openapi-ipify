/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 5.3.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "DefaultApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



DefaultApiImpl::DefaultApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : DefaultApi(rtr)
{
}

void DefaultApiImpl::get_ip(const std::optional<std::string> &format, const std::optional<std::string> &callback, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

