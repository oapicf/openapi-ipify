#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "ip.h"



ip_t *ip_create(
    char *ip
    ) {
    ip_t *ip_local_var = malloc(sizeof(ip_t));
    if (!ip_local_var) {
        return NULL;
    }
    ip_local_var->ip = ip;

    return ip_local_var;
}


void ip_free(ip_t *ip) {
    if(NULL == ip){
        return ;
    }
    listEntry_t *listEntry;
    if (ip->ip) {
        free(ip->ip);
        ip->ip = NULL;
    }
    free(ip);
}

cJSON *ip_convertToJSON(ip_t *ip) {
    cJSON *item = cJSON_CreateObject();

    // ip->ip
    if (!ip->ip) {
        goto fail;
    }
    if(cJSON_AddStringToObject(item, "ip", ip->ip) == NULL) {
    goto fail; //String
    }

    return item;
fail:
    if (item) {
        cJSON_Delete(item);
    }
    return NULL;
}

ip_t *ip_parseFromJSON(cJSON *ipJSON){

    ip_t *ip_local_var = NULL;

    // ip->ip
    cJSON *ip = cJSON_GetObjectItemCaseSensitive(ipJSON, "ip");
    if (!ip) {
        goto end;
    }

    
    if(!cJSON_IsString(ip))
    {
    goto end; //String
    }


    ip_local_var = ip_create (
        strdup(ip->valuestring)
        );

    return ip_local_var;
end:
    return NULL;

}
