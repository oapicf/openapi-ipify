/**
* openapi-ipify
* OpenAPI client for ipify, a simple public IP address API
*
* The version of the OpenAPI document: 4.0.1-pre.0
* Contact: blah@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#include "Ip.h"
#include "Helpers.h"

#include <sstream>

namespace org::openapitools::server::model
{

Ip::Ip()
{
    m_Ip = "";
    
}

void Ip::validate() const
{
    std::stringstream msg;
    if (!validate(msg))
    {
        throw org::openapitools::server::helpers::ValidationException(msg.str());
    }
}

bool Ip::validate(std::stringstream& msg) const
{
    return validate(msg, "");
}

bool Ip::validate(std::stringstream& msg, const std::string& pathPrefix) const
{
    bool success = true;
    const std::string _pathPrefix = pathPrefix.empty() ? "Ip" : pathPrefix;

        
    return success;
}

bool Ip::operator==(const Ip& rhs) const
{
    return
    
    
    (getIp() == rhs.getIp())
    
    
    ;
}

bool Ip::operator!=(const Ip& rhs) const
{
    return !(*this == rhs);
}

void to_json(nlohmann::json& j, const Ip& o)
{
    j = nlohmann::json::object();
    j["ip"] = o.m_Ip;
    
}

void from_json(const nlohmann::json& j, Ip& o)
{
    j.at("ip").get_to(o.m_Ip);
    
}

std::string Ip::getIp() const
{
    return m_Ip;
}
void Ip::setIp(std::string const& value)
{
    m_Ip = value;
}


} // namespace org::openapitools::server::model

