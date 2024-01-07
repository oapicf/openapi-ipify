#include <stdlib.h>
#include <stdio.h>
#include "../include/apiClient.h"
#include "../include/list.h"
#include "../external/cJSON.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"
#include "../model/ip.h"

// Enum FORMAT for DefaultAPI_getIp
typedef enum  { openapi_ipify_getIp_FORMAT_NULL = 0, openapi_ipify_getIp_FORMAT_json, openapi_ipify_getIp_FORMAT_jsonp } openapi_ipify_getIp_format_e;


// Get your public IP address
//
ip_t*
DefaultAPI_getIp(apiClient_t *apiClient, openapi_ipify_getIp_format_e format, char *callback);


