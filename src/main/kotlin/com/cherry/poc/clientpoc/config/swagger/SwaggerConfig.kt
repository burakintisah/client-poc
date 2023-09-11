package com.cherry.poc.clientpoc.config.swagger

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig {
    @Bean
    fun defaultOpenApiConfig(): OpenAPI {
        return OpenAPI()
            .info(
                Info().title("Client POC Project")
                    .description("Feign Client vs Rest Template")
                    .version("1.0"),
            )
    }
}
