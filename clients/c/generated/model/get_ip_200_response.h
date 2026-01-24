/*
 * get_ip_200_response.h
 *
 * 
 */

#ifndef _get_ip_200_response_H_
#define _get_ip_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_ip_200_response_t get_ip_200_response_t;




typedef struct get_ip_200_response_t {
    char *ip; // string

    int _library_owned; // Is the library responsible for freeing this object?
} get_ip_200_response_t;

__attribute__((deprecated)) get_ip_200_response_t *get_ip_200_response_create(
    char *ip
);

void get_ip_200_response_free(get_ip_200_response_t *get_ip_200_response);

get_ip_200_response_t *get_ip_200_response_parseFromJSON(cJSON *get_ip_200_responseJSON);

cJSON *get_ip_200_response_convertToJSON(get_ip_200_response_t *get_ip_200_response);

#endif /* _get_ip_200_response_H_ */

