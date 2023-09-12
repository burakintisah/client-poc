package com.cherry.poc.clientpoc.controller

import com.cherry.poc.clientpoc.service.JokeService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/joke")
class JokeController(
    val jokeService: JokeService,
) {

    @GetMapping("/feign")
    @ResponseStatus(HttpStatus.OK)
    fun getRandomJokesFromFeignClient(): String {
        return jokeService.getRandomJokeFromFeignClient()
    }

    @GetMapping("/rest")
    @ResponseStatus(HttpStatus.OK)
    fun getRandomJokesFromRestTemplate(): String {
        return jokeService.getRandomJokeFromRestTemplate()
    }

    @GetMapping("/webclient")
    @ResponseStatus(HttpStatus.OK)
    fun getRandomJokesFromWebClient(): String {
        return jokeService.getRandomJokeFromWebclient()
    }
}
