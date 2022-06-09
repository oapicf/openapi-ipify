/**
 * openapi-ipify
 * OpenAPI client for ipify, a simple public IP address API
 *
 * The version of the OpenAPI document: 2.0.1-pre.0
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

#include "OAIIp.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIIp::OAIIp(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIIp::OAIIp() {
    this->initializeModel();
}

OAIIp::~OAIIp() {}

void OAIIp::initializeModel() {

    m_ip_isSet = false;
    m_ip_isValid = false;
}

void OAIIp::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIIp::fromJsonObject(QJsonObject json) {

    m_ip_isValid = ::OpenAPI::fromJsonValue(ip, json[QString("ip")]);
    m_ip_isSet = !json[QString("ip")].isNull() && m_ip_isValid;
}

QString OAIIp::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIIp::asJsonObject() const {
    QJsonObject obj;
    if (m_ip_isSet) {
        obj.insert(QString("ip"), ::OpenAPI::toJsonValue(ip));
    }
    return obj;
}

QString OAIIp::getIp() const {
    return ip;
}
void OAIIp::setIp(const QString &ip) {
    this->ip = ip;
    this->m_ip_isSet = true;
}

bool OAIIp::is_ip_Set() const{
    return m_ip_isSet;
}

bool OAIIp::is_ip_Valid() const{
    return m_ip_isValid;
}

bool OAIIp::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_ip_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIIp::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_ip_isValid && true;
}

} // namespace OpenAPI
