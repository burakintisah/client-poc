package com.cherry.poc.clientpoc.service

import com.cherry.poc.clientpoc.client.feign.JokeFeignClient
import com.cherry.poc.clientpoc.client.rest.JokeRestClient
import com.cherry.poc.clientpoc.client.webclient.JokeWebClient
import org.springframework.stereotype.Service

@Service
class JokeService(
    private val jokeFeignClient: JokeFeignClient,
    private val jokeRestClient: JokeRestClient,
    private val jokeWebClient: JokeWebClient,
) {
    fun getRandomJokeFromFeignClient(): String {
        return jokeFeignClient.getRandomJoke().joke ?: "No Random Joke Found From Feign Client"
    }

    fun getRandomJokeFromRestTemplate(): String {
        return jokeRestClient.getRandomJoke().joke ?: "No Random Joke Found From Rest Client"
    }

    fun getRandomJokeFromWebclient(): String {
        return jokeWebClient.getRandomJoke().joke ?: "No Random Joke Found From Rest Client"
    }
}
