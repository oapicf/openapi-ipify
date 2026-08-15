

#include "GetIp_200_response.h"

using namespace Tiny;

GetIp_200_response::GetIp_200_response()
{
	ip = std::string();
}

GetIp_200_response::GetIp_200_response(std::string jsonString)
{
	this->fromJson(jsonString);
}

GetIp_200_response::~GetIp_200_response()
{

}

void
GetIp_200_response::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *ipKey = "ip";

    if(object.has_key(ipKey))
    {
        bourne::json value = object[ipKey];



        jsonToValue(&ip, value, "std::string");


    }


}

bourne::json
GetIp_200_response::toJson()
{
    bourne::json object = bourne::json::object();





    object["ip"] = getIp();



    return object;

}

std::string
GetIp_200_response::getIp()
{
	return ip;
}

void
GetIp_200_response::setIp(std::string  ip)
{
	this->ip = ip;
}



