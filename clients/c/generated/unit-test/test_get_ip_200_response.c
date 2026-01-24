#ifndef get_ip_200_response_TEST
#define get_ip_200_response_TEST

// the following is to include only the main from the first c file
#ifndef TEST_MAIN
#define TEST_MAIN
#define get_ip_200_response_MAIN
#endif // TEST_MAIN

#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include <stdbool.h>
#include "../external/cJSON.h"

#include "../model/get_ip_200_response.h"
get_ip_200_response_t* instantiate_get_ip_200_response(int include_optional);



get_ip_200_response_t* instantiate_get_ip_200_response(int include_optional) {
  get_ip_200_response_t* get_ip_200_response = NULL;
  if (include_optional) {
    get_ip_200_response = get_ip_200_response_create(
      "0"
    );
  } else {
    get_ip_200_response = get_ip_200_response_create(
      "0"
    );
  }

  return get_ip_200_response;
}


#ifdef get_ip_200_response_MAIN

void test_get_ip_200_response(int include_optional) {
    get_ip_200_response_t* get_ip_200_response_1 = instantiate_get_ip_200_response(include_optional);

	cJSON* jsonget_ip_200_response_1 = get_ip_200_response_convertToJSON(get_ip_200_response_1);
	printf("get_ip_200_response :\n%s\n", cJSON_Print(jsonget_ip_200_response_1));
	get_ip_200_response_t* get_ip_200_response_2 = get_ip_200_response_parseFromJSON(jsonget_ip_200_response_1);
	cJSON* jsonget_ip_200_response_2 = get_ip_200_response_convertToJSON(get_ip_200_response_2);
	printf("repeating get_ip_200_response:\n%s\n", cJSON_Print(jsonget_ip_200_response_2));
}

int main() {
  test_get_ip_200_response(1);
  test_get_ip_200_response(0);

  printf("Hello world \n");
  return 0;
}

#endif // get_ip_200_response_MAIN
#endif // get_ip_200_response_TEST
