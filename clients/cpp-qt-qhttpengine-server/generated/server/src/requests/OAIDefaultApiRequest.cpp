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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIDefaultApiRequest.h"

namespace OpenAPI {

OAIDefaultApiRequest::OAIDefaultApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIDefaultApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIDefaultApiRequest::~OAIDefaultApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIDefaultApiRequest::~OAIDefaultApiRequest()";
}

QMap<QString, QString>
OAIDefaultApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIDefaultApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIDefaultApiRequest::getRawSocket(){
    return socket;
}


void OAIDefaultApiRequest::getIpRequest(){
    qDebug() << "/";
    connect(this, &OAIDefaultApiRequest::getIp, handler.data(), &OAIDefaultApiHandler::getIp);

    
    QString format;
    if(socket->queryString().keys().contains("format")){
        fromStringValue(socket->queryString().value("format"), format);
    }
    
    QString callback;
    if(socket->queryString().keys().contains("callback")){
        fromStringValue(socket->queryString().value("callback"), callback);
    }
    


    Q_EMIT getIp(format, callback);
}



void OAIDefaultApiRequest::getIpResponse(const QString& res){
    setSocketResponseHeaders();
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIDefaultApiRequest::getIpError(const QString& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    socket->write(::OpenAPI::toStringValue(res).toUtf8());
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIDefaultApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIDefaultApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
