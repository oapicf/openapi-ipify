/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 5.3.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef OAI_OAIDefaultApiHandler_H
#define OAI_OAIDefaultApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIDefaultApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIDefaultApiHandler();
    virtual ~OAIDefaultApiHandler();


public Q_SLOTS:
    virtual void getIp(QString format, QString callback);
    

};

}

#endif // OAI_OAIDefaultApiHandler_H
