
/*
 * GetIp_200_response.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_GetIp_200_response_H_
#define TINY_CPP_CLIENT_GetIp_200_response_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetIp_200_response{
public:

    /*! \brief Constructor.
	 */
    GetIp_200_response();
    GetIp_200_response(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetIp_200_response();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getIp();

	/*! \brief Set 
	 */
	void setIp(std::string  ip);


    private:
    std::string ip{};
};
}

#endif /* TINY_CPP_CLIENT_GetIp_200_response_H_ */
