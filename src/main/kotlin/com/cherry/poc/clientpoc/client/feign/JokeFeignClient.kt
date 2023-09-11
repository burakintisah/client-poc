package com.cherry.poc.clientpoc.client.feign

import com.cherry.poc.clientpoc.model.ResponseJoke
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping

// @FeignClient(name = "joke-client", url = "https://icanhazdadjoke.com/")
@FeignClient(name = "joke-client")
fun interface JokeFeignClient {
    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getRandomJoke(): ResponseJoke
}
