/*
 * GetIp_200_response.h
 *
 * 
 */

#ifndef _GetIp_200_response_H_
#define _GetIp_200_response_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GetIp_200_response : public Object {
public:
	/*! \brief Constructor.
	 */
	GetIp_200_response();
	GetIp_200_response(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetIp_200_response();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getIp();

	/*! \brief Set 
	 */
	void setIp(std::string  ip);

private:
	std::string ip;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetIp_200_response_H_ */
