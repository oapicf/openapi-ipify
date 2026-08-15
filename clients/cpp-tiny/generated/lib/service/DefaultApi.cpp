#include "DefaultApi.h"

using namespace Tiny;



        Response<
            std::string
        >
        DefaultApi::
        getIp(
            
            std::string format
            , 
            
            std::string callback
            
        )
        {
            std::string url = basepath + "/"; //


            // Headers  | 

            // Query    | format callback 
            addQueryParam("format",format);
            addQueryParam("callback",callback);

            // Form     | 





            std::string payload = "";
            // Send Request
            // METHOD | GET
            // Body     | 
            int httpCode = sendRequest(url, "GET", reinterpret_cast<uint8_t*>(&payload[0]), payload.length());

            // Handle Request
            String output = getResponseBody();
            std::string output_string = output.c_str();



            bourne::json jsonPayload(output_string);
            std::string obj;
            jsonToValue(&obj, jsonPayload, "std::string");



            Response<std::string> response(obj, httpCode);
            return response;
        }



