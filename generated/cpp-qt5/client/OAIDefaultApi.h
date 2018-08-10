/**
 * ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * OpenAPI spec version: 0.9.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#ifndef _OAI_OAIDefaultApi_H_
#define _OAI_OAIDefaultApi_H_

#include "OAIHttpRequest.h"

#include "OAIObject.h"
#include <QString>

#include <QObject>

namespace OpenAPI {

class OAIDefaultApi: public QObject {
    Q_OBJECT

public:
    OAIDefaultApi();
    OAIDefaultApi(QString host, QString basePath);
    ~OAIDefaultApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void getIp(QString* format, QString* callback);
    
private:
    void getIpCallback (OAIHttpRequestWorker * worker);
    
signals:
    void getIpSignal(OAIObject* summary);
    
    void getIpSignalE(OAIObject* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void getIpSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif