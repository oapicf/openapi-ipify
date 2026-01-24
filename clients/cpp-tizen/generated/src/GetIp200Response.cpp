#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GetIp_200_response.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GetIp_200_response::GetIp_200_response()
{
	//__init();
}

GetIp_200_response::~GetIp_200_response()
{
	//__cleanup();
}

void
GetIp_200_response::__init()
{
	//ip = std::string();
}

void
GetIp_200_response::__cleanup()
{
	//if(ip != NULL) {
	//
	//delete ip;
	//ip = NULL;
	//}
	//
}

void
GetIp_200_response::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *ipKey = "ip";
	node = json_object_get_member(pJsonObject, ipKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&ip, node, "std::string", "");
		} else {
			
		}
	}
}

GetIp_200_response::GetIp_200_response(char* json)
{
	this->fromJson(json);
}

char*
GetIp_200_response::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getIp();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *ipKey = "ip";
	json_object_set_member(pJsonObject, ipKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
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


