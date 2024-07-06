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
 * ModelBase.h
 *
 * This is the base class for all model classes
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_



#include "CppRestOpenAPIClient/HttpContent.h"
#include "CppRestOpenAPIClient/MultipartFormData.h"

#include <cpprest/details/basic_types.h>
#include <cpprest/json.h>

#include <map>
#include <set>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class  ModelBase
{
public:
    ModelBase();
    virtual ~ModelBase();

    virtual void validate() = 0;

    virtual web::json::value toJson() const = 0;
    virtual bool fromJson( const web::json::value& json ) = 0;

    virtual void toMultipart( std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix ) const = 0;
    virtual bool fromMultiPart( std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix ) = 0;

    virtual bool isSet() const;

    static utility::string_t toString( const bool val );
    static utility::string_t toString( const float val );
    static utility::string_t toString( const double val );
    static utility::string_t toString( const int32_t val );
    static utility::string_t toString( const int64_t val );
    static utility::string_t toString( const utility::string_t &val );
    static utility::string_t toString( const utility::datetime &val );
    static utility::string_t toString( const web::json::value &val );
    static utility::string_t toString( const std::shared_ptr<HttpContent>& val );
    template <typename T>
    static utility::string_t toString( const std::shared_ptr<T>& val );
    template <typename T>
    static utility::string_t toString( const std::vector<T> & val );
    template <typename T>
    static utility::string_t toString( const std::set<T> & val );

    static web::json::value toJson( bool val );
    static web::json::value toJson( float val );
    static web::json::value toJson( double val );
    static web::json::value toJson( int32_t val );
    static web::json::value toJson( int64_t val );
    static web::json::value toJson( const utility::string_t& val );
    static web::json::value toJson( const utility::datetime& val );
    static web::json::value toJson( const web::json::value& val );
    static web::json::value toJson( const std::shared_ptr<HttpContent>& val );
    template<typename T>
    static web::json::value toJson( const std::shared_ptr<T>& val );
    static web::json::value toJson( const std::shared_ptr<utility::datetime>& val );
    template<typename T>
    static web::json::value toJson( const std::vector<T>& val );
    template<typename T>
    static web::json::value toJson( const std::set<T>& val );
    template<typename T>
    static web::json::value toJson( const std::map<utility::string_t, T>& val );

    static bool fromString( const utility::string_t& val, bool & );
    static bool fromString( const utility::string_t& val, float & );
    static bool fromString( const utility::string_t& val, double & );
    static bool fromString( const utility::string_t& val, int32_t & );
    static bool fromString( const utility::string_t& val, int64_t & );
    static bool fromString( const utility::string_t& val, utility::string_t & );
    static bool fromString( const utility::string_t& val, utility::datetime & );
    static bool fromString( const utility::string_t& val, web::json::value & );
    static bool fromString( const utility::string_t& val, std::shared_ptr<HttpContent> & );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::shared_ptr<T>& );
    static bool fromString( const utility::string_t& val, std::shared_ptr<utility::datetime>& outVal );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::vector<T> & );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::set<T> & );
    template<typename T>
    static bool fromString( const utility::string_t& val, std::map<utility::string_t, T> & );

    static bool fromJson( const web::json::value& val, bool & );
    static bool fromJson( const web::json::value& val, float & );
    static bool fromJson( const web::json::value& val, double & );
    static bool fromJson( const web::json::value& val, int32_t & );
    static bool fromJson( const web::json::value& val, int64_t & );
    static bool fromJson( const web::json::value& val, utility::string_t & );
    static bool fromJson( const web::json::value& val, utility::datetime & );
    static bool fromJson( const web::json::value& val, web::json::value & );
    static bool fromJson( const web::json::value& val, std::shared_ptr<HttpContent> & );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::shared_ptr<T>& );
    static bool fromJson( const web::json::value& val, std::shared_ptr<utility::datetime> &outVal );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::vector<T> & );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::set<T> & );
    template<typename T>
    static bool fromJson( const web::json::value& val, std::map<utility::string_t, T> & );


    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, bool value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, float value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, double value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int32_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, int64_t value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::string_t& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const utility::datetime& value, const utility::string_t& contentType = utility::conversions::to_string_t(""));
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const web::json::value& value, const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::shared_ptr<HttpContent>& );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::shared_ptr<T>& , const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    static std::shared_ptr<HttpContent> toHttpContent(const utility::string_t& name, const std::shared_ptr<utility::datetime>& value , const utility::string_t& contentType = utility::conversions::to_string_t("application/json") );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::set<T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );
    template <typename T>
    static std::shared_ptr<HttpContent> toHttpContent( const utility::string_t& name, const std::map<utility::string_t, T>& value, const utility::string_t& contentType = utility::conversions::to_string_t("") );

    static bool fromHttpContent( std::shared_ptr<HttpContent> val, bool & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, float & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, double & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, int64_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, int32_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, utility::string_t & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, utility::datetime & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, web::json::value & );
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::shared_ptr<HttpContent>& );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::shared_ptr<T>& );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::vector<T> & );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::set<T> & );
    template <typename T>
    static bool fromHttpContent( std::shared_ptr<HttpContent> val, std::map<utility::string_t, T> & );

    static utility::string_t toBase64( utility::string_t value );
    static utility::string_t toBase64( std::shared_ptr<std::istream> value );
    static std::shared_ptr<std::istream> fromBase64( const utility::string_t& encoded );
protected:
    bool m_IsSet;
};

template <typename T>
utility::string_t ModelBase::toString( const std::shared_ptr<T>& val )
{
    utility::stringstream_t ss;
    if( val != nullptr )
    {
        val->toJson().serialize(ss);
    }
    return  utility::string_t(ss.str());
}

// std::vector to string
template<typename T>
utility::string_t ModelBase::toString( const std::vector<T> & val )
{
    utility::string_t strArray;
    for ( const auto &item : val )
    {
        strArray.append( toString(item) + "," );
    }
    if (val.count() > 0)
    {
        strArray.pop_back();
    }
    return strArray;
}

// std::set to string
template<typename T>
utility::string_t ModelBase::toString( const std::set<T> & val )
{
    utility::string_t strArray;
    for ( const auto &item : val )
    {
        strArray.append( toString(item) + "," );
    }
    if (val.count() > 0)
    {
        strArray.pop_back();
    }
    return strArray;
}


template<typename T>
web::json::value ModelBase::toJson( const std::shared_ptr<T>& val )
{
    web::json::value retVal;
    if(val != nullptr)
    {
        retVal = val->toJson();
    }
    return retVal;
}

// std::vector to json
template<typename T>
web::json::value ModelBase::toJson( const std::vector<T>& value )
{
    std::vector<web::json::value> ret;
    for ( const auto& x : value )
    {
        ret.push_back( toJson(x) );
    }
    return web::json::value::array(ret);
}

// std::set to json
template<typename T>
web::json::value ModelBase::toJson( const std::set<T>& value )
{
    // There's no protoype web::json::value::array(...) taking a std::set parameter. Converting to std::vector to get an array.
    std::vector<web::json::value> ret;
    for ( const auto& x : value )
    {
        ret.push_back( toJson(x) );
    }
    return web::json::value::array(ret);
}


template<typename T>
web::json::value ModelBase::toJson( const std::map<utility::string_t, T>& val )
{
    web::json::value obj;
    for ( const auto &itemkey : val )
    {
        obj[itemkey.first] = toJson( itemkey.second );
    }
    return obj;
}
template<typename T>
bool ModelBase::fromString( const utility::string_t& val, std::shared_ptr<T>& outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<T>(new T());
    }
    if( outVal != nullptr )
    {
        ok = outVal->fromJson(web::json::value::parse(val));
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& val, std::shared_ptr<T> &outVal )
{
    bool ok = false;
    if(outVal == nullptr)
    {
        outVal = std::shared_ptr<T>(new T());
    }
    if( outVal != nullptr )
    {
        ok = outVal->fromJson(val);
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& val, std::vector<T> &outVal )
{
    bool ok = true;
    if (val.is_array())
    {
        for (const web::json::value & jitem : val.as_array())
        {
            T item;
            ok &= fromJson(jitem, item);
            outVal.push_back(item);
        }
    }
    else
    {
        ok = false;
    }
    return ok;
}
template<typename T>
bool ModelBase::fromJson( const web::json::value& jval, std::map<utility::string_t, T> &outVal )
{
    bool ok = true;
    if ( jval.is_object() )
    {
        auto obj = jval.as_object();
        for( auto objItr = obj.begin() ; objItr != obj.end() ; objItr++ )
        {
            T itemVal;
            ok &= fromJson(objItr->second, itemVal);
            outVal.insert(std::pair<utility::string_t, T>(objItr->first, itemVal));
        }
    }
    else
    {
        ok = false;
    }
    return ok;
}
template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent(const utility::string_t& name, const std::shared_ptr<T>& value , const utility::string_t& contentType )
{
    std::shared_ptr<HttpContent> content( new HttpContent );
    if (value != nullptr )
    {
        content->setName( name );
        content->setContentDisposition( utility::conversions::to_string_t("form-data") );
        content->setContentType( contentType );
        content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string( value->toJson().serialize() ) ) ) );
    }
    return content;
}

template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::vector<T>& value, const utility::string_t& contentType )
{
    web::json::value json_array = ModelBase::toJson(value);
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(json_array.serialize()) ) ) );
    return content;
}

template <typename T>
std::shared_ptr<HttpContent> ModelBase::toHttpContent( const utility::string_t& name, const std::map<utility::string_t, T>& value, const utility::string_t& contentType )
{
    web::json::value jobj = ModelBase::toJson(value);
    std::shared_ptr<HttpContent> content( new HttpContent );
    content->setName( name );
    content->setContentDisposition( utility::conversions::to_string_t("form-data") );
    content->setContentType( contentType );
    content->setData( std::shared_ptr<std::istream>( new std::stringstream( utility::conversions::to_utf8string(jobj.serialize()) ) ) );
    return content;
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val,  std::shared_ptr<T>& outVal )
{
    utility::string_t str;
    if(val == nullptr) return false;
    if( outVal == nullptr )
    {
        outVal = std::shared_ptr<T>(new T());
    }
    ModelBase::fromHttpContent(val, str);
    return fromString(str, outVal);
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val, std::vector<T> & )
{
    return true;
}
template <typename T>
bool ModelBase::fromHttpContent( std::shared_ptr<HttpContent> val, std::map<utility::string_t, T> & )
{
    return true;
}
}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ModelBase_H_ */
