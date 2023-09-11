package com.cherry.poc.clientpoc

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@OpenAPIDefinition
@SpringBootApplication
class ClientPocApplication

fun main(args: Array<String>) {
    runApplication<ClientPocApplication>(*args)
}
