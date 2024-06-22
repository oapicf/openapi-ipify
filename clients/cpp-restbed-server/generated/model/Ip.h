/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.2.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * Ip.h
 *
 * 
 */

#ifndef Ip_H_
#define Ip_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Ip 
{
public:
    Ip() = default;
    explicit Ip(boost::property_tree::ptree const& pt);
    virtual ~Ip() = default;

    Ip(const Ip& other) = default; // copy constructor
    Ip(Ip&& other) noexcept = default; // move constructor

    Ip& operator=(const Ip& other) = default; // copy assignment
    Ip& operator=(Ip&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// Ip members

    /// <summary>
    /// 
    /// </summary>
    std::string getIp() const;
    void setIp(std::string value);

protected:
    std::string m_Ip = "";
};

std::vector<Ip> createIpVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<Ip>(const Ip& val) {
    return val.toPropertyTree();
}

template<>
inline Ip fromPt<Ip>(const boost::property_tree::ptree& pt) {
    Ip ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* Ip_H_ */
