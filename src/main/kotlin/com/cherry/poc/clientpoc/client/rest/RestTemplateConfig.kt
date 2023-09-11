package com.cherry.poc.clientpoc.client.rest

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.client.ClientHttpRequestFactory
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory
import org.springframework.http.client.SimpleClientHttpRequestFactory
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {

    @Bean
    fun restTemplate(clientHttpRequestFactory: ClientHttpRequestFactory): RestTemplate {
        return RestTemplate(clientHttpRequestFactory)
    }

    @Bean
    fun clientHttpRequestFactory(): ClientHttpRequestFactory {
        return SimpleClientHttpRequestFactory().apply {
            setConnectTimeout(5000)
            setReadTimeout(5000)
        }
    }
}
