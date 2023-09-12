package com.cherry.poc.clientpoc.client.webclient

import com.cherry.poc.clientpoc.model.ResponseJoke
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriComponentsBuilder

@Service
class JokeWebClient(
    private val webClientBuilder: WebClient.Builder,
) {
    companion object {
        private const val baseUrl = "https://icanhazdadjoke.com/"
    }

    fun getRandomJoke(): ResponseJoke {
        val uri = UriComponentsBuilder.fromUriString(baseUrl)
            .build()
            .toUri()

        return webClientBuilder.build()
            .get()
            .uri(uri)
            .accept(MediaType.APPLICATION_JSON)
            .retrieve()
            .bodyToMono(ResponseJoke::class.java)
            .block() ?: throw RuntimeException("Failed to fetch a random joke")
    }
}
