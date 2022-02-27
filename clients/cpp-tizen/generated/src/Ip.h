/*
 * Ip.h
 *
 * 
 */

#ifndef _Ip_H_
#define _Ip_H_


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

class Ip : public Object {
public:
	/*! \brief Constructor.
	 */
	Ip();
	Ip(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Ip();

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

#endif /* _Ip_H_ */
