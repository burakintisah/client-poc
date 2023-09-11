package com.cherry.poc.clientpoc.client.rest

import com.cherry.poc.clientpoc.model.ResponseJoke
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class JokeRestClient(
    val restTemplate: RestTemplate,
) {

    fun getRandomJoke(): ResponseJoke {
        val url = "https://icanhazdadjoke.com/"
        val headers = HttpHeaders().apply {
            accept = listOf(MediaType.APPLICATION_JSON)
        }
        val entity = HttpEntity("body", headers)

        return restTemplate.getForEntity(
            url,
            ResponseJoke::class.java,
            entity,
        ).body!!
    }
}
