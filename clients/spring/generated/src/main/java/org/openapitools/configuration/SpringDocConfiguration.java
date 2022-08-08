package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("openapi-ipify")
                                .description("OpenAPI client for ipify, a simple public IP address API")
                                .contact(
                                        new Contact()
                                                .name("Cliffano Subagio")
                                                .url("http://blog.cliffano.com")
                                                .email("blah@cliffano.com")
                                )
                                .license(
                                        new License()
                                                .name("MIT")
                                                .url("http://unlicense.org")
                                )
                                .version("3.0.1-pre.0")
                )
        ;
    }
}