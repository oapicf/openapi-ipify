package org.openapitools

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.License
import io.swagger.v3.oas.models.Components
import io.swagger.v3.oas.models.security.SecurityScheme

@jakarta.annotation.Generated(value = ["org.openapitools.codegen.languages.KotlinSpringServerCodegen"])
@Configuration
class SpringDocConfiguration {

    @Bean
    fun apiInfo(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("openapi-ipify")
                    .description("OpenAPI client for ipify, a simple public IP address API")
                    .contact(
                        Contact()
                            .name("Cliffano Subagio")
                            .url("http://blog.cliffano.com")
                            .email("blah@cliffano.com")
                    )
                    .license(
                        License()
                            .name("MIT")
                                                )
                    .version("2.0.1-pre.0")
            )
    }
}