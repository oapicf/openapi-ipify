
#include "GetIp_200_response.h"

using namespace Tiny;

#include <string>
#include <list>
#include <unity.h>
#include "bourne/json.hpp"



void test_GetIp_200_response_ip_is_assigned_from_json()
{


    bourne::json input =
    {
        "ip", "hello"
    };

    GetIp_200_response obj(input.dump());

    TEST_ASSERT_EQUAL_STRING("hello", obj.getIp().c_str());






}



void test_GetIp_200_response_ip_is_converted_to_json()
{

    bourne::json input =
    {
        "ip", "hello"
    };

    GetIp_200_response obj(input.dump());

    bourne::json output = bourne::json::object();

    output = obj.toJson();

    TEST_ASSERT(input["ip"] == output["ip"]);



}


