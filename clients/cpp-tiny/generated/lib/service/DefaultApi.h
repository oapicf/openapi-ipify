#ifndef TINY_CPP_CLIENT_DefaultApi_H_
#define TINY_CPP_CLIENT_DefaultApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "GetIp_200_response.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class DefaultApi : public Service {
public:
    DefaultApi() = default;

    virtual ~DefaultApi() = default;

    /**
    * Get your public IP address.
    *
    * 
    * \param format Response format
    * \param callback JSONP callback function name
    */
    Response<
                std::string
        >
    getIp(
            
            std::string format
            , 
            
            std::string callback
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_DefaultApi_H_ */