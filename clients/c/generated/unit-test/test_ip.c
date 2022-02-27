#ifndef ip_TEST
#define ip_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define ip_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/ip.h"
ip_t* instantiate_ip(int include_optional);



ip_t* instantiate_ip(int include_optional) {
  ip_t* ip = NULL;
  if (include_optional) {
    ip = ip_create(
      "0"
    );
  } else {
    ip = ip_create(
      "0"
    );
  }

  return ip;
}


#ifdef ip_MAIN

void test_ip(int include_optional) {
    ip_t* ip_1 = instantiate_ip(include_optional);

	cJSON* jsonip_1 = ip_convertToJSON(ip_1);
	printf("ip :\n%s\n", cJSON_Print(jsonip_1));
	ip_t* ip_2 = ip_parseFromJSON(jsonip_1);
	cJSON* jsonip_2 = ip_convertToJSON(ip_2);
	printf("repeating ip:\n%s\n", cJSON_Print(jsonip_2));
}

int main() {
  test_ip(1);
  test_ip(0);

  printf("Hello world \n");
  return 0;
}

#endif // ip_MAIN
#endif // ip_TEST
