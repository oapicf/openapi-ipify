/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.6.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * IHttpBody.h
 *
 * This is the interface for contents that can be sent to a remote HTTP server.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_IHttpBody_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_IHttpBody_H_


#include <iostream>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class  IHttpBody
{
public:
    virtual ~IHttpBody() { }

    virtual void writeTo( std::ostream& stream ) = 0;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_IHttpBody_H_ */
