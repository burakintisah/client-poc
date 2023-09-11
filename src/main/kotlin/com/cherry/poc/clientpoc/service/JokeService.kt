package com.cherry.poc.clientpoc.service

import com.cherry.poc.clientpoc.client.feign.JokeFeignClient
import com.cherry.poc.clientpoc.client.rest.JokeRestClient
import org.springframework.stereotype.Service

@Service
class JokeService(
    val jokeFeignClient: JokeFeignClient,
    val jokeRestClient: JokeRestClient
) {
    fun getRandomJokeFromFeignClient(): String {
        return jokeFeignClient.getRandomJoke().joke ?: "No Random Joke Found From Feign Client"
    }

    fun getRandomJokeFromRestTemplate(): String {
        return jokeRestClient.getRandomJoke().joke ?: "No Random Joke Found From Rest Client"
    }


}