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



#include "Ip.h"

#include <string>
#include <vector>
#include <sstream>
#include <stdexcept>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

Ip::Ip(boost::property_tree::ptree const& pt)
{
        fromPropertyTree(pt);
}

std::string Ip::toJsonString(bool prettyJson /* = false */)
{
    return toJsonString_internal(prettyJson);
}

void Ip::fromJsonString(std::string const& jsonString)
{
    fromJsonString_internal(jsonString);
}

boost::property_tree::ptree Ip::toPropertyTree()
{
    return toPropertyTree_internal();
}

void Ip::fromPropertyTree(boost::property_tree::ptree const& pt)
{
    fromPropertyTree_internal(pt);
}

std::string Ip::toJsonString_internal(bool prettyJson)
{
	std::stringstream ss;
	write_json(ss, this->toPropertyTree(), prettyJson);
	return ss.str();
}

void Ip::fromJsonString_internal(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	this->fromPropertyTree(pt);
}

ptree Ip::toPropertyTree_internal()
{
	ptree pt;
	ptree tmp_node;
	pt.put("ip", m_Ip);
	return pt;
}

void Ip::fromPropertyTree_internal(ptree const &pt)
{
	ptree tmp_node;
	m_Ip = pt.get("ip", "");
}

std::string Ip::getIp() const
{
    return m_Ip;
}

void Ip::setIp(std::string value)
{
	m_Ip = value;
}

std::vector<Ip> createIpVectorFromJsonString(const std::string& json)
{
    std::stringstream sstream(json);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream,pt);

    auto vec = std::vector<Ip>();
    for (const auto& child: pt) {
        vec.emplace_back(Ip(child.second));
    }

    return vec;
}

}
}
}
}

