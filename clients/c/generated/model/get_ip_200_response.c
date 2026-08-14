#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "get_ip_200_response.h"



static get_ip_200_response_t *get_ip_200_response_create_internal(
    char *ip
    ) {
    get_ip_200_response_t *get_ip_200_response_local_var = malloc(sizeof(get_ip_200_response_t));
    if (!get_ip_200_response_local_var) {
        return NULL;
    }
    memset(get_ip_200_response_local_var, 0, sizeof(get_ip_200_response_t));
    get_ip_200_response_local_var->_library_owned = 1;
    get_ip_200_response_local_var->ip = ip;
    return get_ip_200_response_local_var;
}

__attribute__((deprecated)) get_ip_200_response_t *get_ip_200_response_create(
    char *ip
    ) {
    get_ip_200_response_t *result = get_ip_200_response_create_internal (
        ip
        );
    if (!result) {
    }
    return result;
}

void get_ip_200_response_free(get_ip_200_response_t *get_ip_200_response) {
    if(NULL == get_ip_200_response){
        return ;
    }
    if(get_ip_200_response->_library_owned != 1){
        fprintf(stderr, "WARNING: %s() does NOT free objects allocated by the user\n", "get_ip_200_response_free");
        return ;
    }
    listEntry_t *listEntry;
    if (get_ip_200_response->ip) {
        free(get_ip_200_response->ip);
        get_ip_200_response->ip = NULL;
    }
    free(get_ip_200_response);
}

cJSON *get_ip_200_response_convertToJSON(get_ip_200_response_t *get_ip_200_response) {
    cJSON *item = cJSON_CreateObject();

    // get_ip_200_response->ip
    if(get_ip_200_response->ip) {
    if(cJSON_AddStringToObject(item, "ip", get_ip_200_response->ip) == NULL) {
    goto fail; //String
    }
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

get_ip_200_response_t *get_ip_200_response_parseFromJSON(cJSON *get_ip_200_responseJSON){

    get_ip_200_response_t *get_ip_200_response_local_var = NULL;

    char *ip_local_str = NULL;

    // get_ip_200_response->ip
    cJSON *ip = cJSON_GetObjectItemCaseSensitive(get_ip_200_responseJSON, "ip");
    if (cJSON_IsNull(ip)) {
        ip = NULL;
    }
    if (ip) { 
    if(!cJSON_IsString(ip) && !cJSON_IsNull(ip))
    {
    goto end; //String
    }
    }


    if (ip && !cJSON_IsNull(ip)) ip_local_str = strdup(ip->valuestring);

    get_ip_200_response_local_var = get_ip_200_response_create_internal (
        ip_local_str
        );

    if (!get_ip_200_response_local_var) {
        goto end;
    }

    return get_ip_200_response_local_var;
end:
    if (ip_local_str) {
        free(ip_local_str);
        ip_local_str = NULL;
    }
    return NULL;

}
