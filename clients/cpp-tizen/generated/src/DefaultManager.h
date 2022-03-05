#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Ip.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Get your public IP address. *Synchronous*
 *
 * 
 * \param format Response format
 * \param callback JSONP callback function name
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getIpSync(char * accessToken,
	std::string format, std::string callback, 
	void(* handler)(Ip, Error, void* )
	, void* userData);

/*! \brief Get your public IP address. *Asynchronous*
 *
 * 
 * \param format Response format
 * \param callback JSONP callback function name
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getIpAsync(char * accessToken,
	std::string format, std::string callback, 
	void(* handler)(Ip, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.ipify.org";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
