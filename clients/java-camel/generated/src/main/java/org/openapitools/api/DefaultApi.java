/**
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.4.0).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.api;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestParamType;
import org.springframework.stereotype.Component;
import org.openapitools.model.*;
import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.LoggingLevel;

@Component
public class DefaultApi extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        

        /**
        GET / : Get your public IP address
        **/
        rest()
            .get("/")
                .description("Get your public IP address")
                .id("getIpApi")
                .clientRequestValidation(false)
                .bindingMode(RestBindingMode.off)
                .produces("application/json, application/javascript, text/plain")
                .outType(Ip.class)
                .param()
                    .name("format")
                    .type(RestParamType.query)
                    .required(false)
                    .description("Response format")
                .endParam()
                .param()
                    .name("paramCallback")
                    .type(RestParamType.query)
                    .required(false)
                    .description("JSONP callback function name")
                .endParam()
                .to("direct:getIp");
        
    }
}