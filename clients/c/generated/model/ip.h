/*
 * ip.h
 *
 * 
 */

#ifndef _ip_H_
#define _ip_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ip_t ip_t;




typedef struct ip_t {
    char *ip; // string

} ip_t;

ip_t *ip_create(
    char *ip
);

void ip_free(ip_t *ip);

ip_t *ip_parseFromJSON(cJSON *ipJSON);

cJSON *ip_convertToJSON(ip_t *ip);

#endif /* _ip_H_ */

