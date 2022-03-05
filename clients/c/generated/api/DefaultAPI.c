#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "DefaultAPI.h"

#define MAX_NUMBER_LENGTH 16
#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Functions for enum FORMAT for DefaultAPI_getIp

static char* getIp_FORMAT_ToString(openapi_ipify_getIp_format_e FORMAT){
    char *FORMATArray[] =  { "NULL", "json", "jsonp" };
    return FORMATArray[FORMAT];
}

static openapi_ipify_getIp_format_e getIp_FORMAT_FromString(char* FORMAT){
    int stringToReturn = 0;
    char *FORMATArray[] =  { "NULL", "json", "jsonp" };
    size_t sizeofArray = sizeof(FORMATArray) / sizeof(FORMATArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(FORMAT, FORMATArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
    return 0;
}

/*
// Function getIp_FORMAT_convertToJSON is not currently used,
// since conversion to JSON passes through the conversion of the model, and ToString. The function is kept for future reference.
//
static cJSON *getIp_FORMAT_convertToJSON(openapi_ipify_getIp_format_e FORMAT) {
    cJSON *item = cJSON_CreateObject();
    if(cJSON_AddStringToObject(item, "format", getIp_FORMAT_ToString(FORMAT)) == NULL) {
        goto fail;
    }
    return item;
    fail:
    cJSON_Delete(item);
    return NULL;
}

// Function getIp_FORMAT_parseFromJSON is not currently used,
// since conversion from JSON passes through the conversion of the model, and FromString. The function is kept for future reference.
//
static openapi_ipify_getIp_format_e getIp_FORMAT_parseFromJSON(cJSON* FORMATJSON) {
    openapi_ipify_getIp_format_e FORMATVariable = 0;
    cJSON *FORMATVar = cJSON_GetObjectItemCaseSensitive(FORMATJSON, "format");
    if(!cJSON_IsString(FORMATVar) || (FORMATVar->valuestring == NULL))
    {
        goto end;
    }
    FORMATVariable = getIp_FORMAT_FromString(FORMATVar->valuestring);
    return FORMATVariable;
end:
    return 0;
}
*/


// Get your public IP address
//
ip_t*
DefaultAPI_getIp(apiClient_t *apiClient, openapi_ipify_getIp_format_e format , char * callback )
{
    list_t    *localVarQueryParameters = list_createList();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_createList();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/");




    // query parameters
    char *keyQuery_format = NULL;
    openapi_ipify_getIp_format_e valueQuery_format ;
    keyValuePair_t *keyPairQuery_format = 0;
    if (format)
    {
        keyQuery_format = strdup("format");
        valueQuery_format = (format);
        keyPairQuery_format = keyValuePair_create(keyQuery_format, (void *)strdup(getIp_FORMAT_ToString(
		valueQuery_format)));
        list_addElement(localVarQueryParameters,keyPairQuery_format);
    }

    // query parameters
    char *keyQuery_callback = NULL;
    char * valueQuery_callback = NULL;
    keyValuePair_t *keyPairQuery_callback = 0;
    if (callback)
    {
        keyQuery_callback = strdup("callback");
        valueQuery_callback = strdup((callback));
        keyPairQuery_callback = keyValuePair_create(keyQuery_callback, valueQuery_callback);
        list_addElement(localVarQueryParameters,keyPairQuery_callback);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarHeaderType,"application/javascript"); //produces
    list_addElement(localVarHeaderType,"text/plain"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","Your public IP address");
    }
    //nonprimitive not container
    cJSON *DefaultAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    ip_t *elementToReturn = ip_parseFromJSON(DefaultAPIlocalVarJSON);
    cJSON_Delete(DefaultAPIlocalVarJSON);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    if (apiClient->dataReceived) {
        free(apiClient->dataReceived);
        apiClient->dataReceived = NULL;
        apiClient->dataReceivedLen = 0;
    }
    list_freeList(localVarQueryParameters);
    
    
    list_freeList(localVarHeaderType);
    
    free(localVarPath);
    if(keyQuery_format){
        free(keyQuery_format);
        keyQuery_format = NULL;
    }
    if(keyPairQuery_format){
        keyValuePair_free(keyPairQuery_format);
        keyPairQuery_format = NULL;
    }
    if(keyQuery_callback){
        free(keyQuery_callback);
        keyQuery_callback = NULL;
    }
    if(valueQuery_callback){
        free(valueQuery_callback);
        valueQuery_callback = NULL;
    }
    if(keyPairQuery_callback){
        keyValuePair_free(keyPairQuery_callback);
        keyPairQuery_callback = NULL;
    }
    return elementToReturn;
end:
    free(localVarPath);
    return NULL;

}

