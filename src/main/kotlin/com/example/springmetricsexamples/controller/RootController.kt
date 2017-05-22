package com.example.springmetricsexamples.controller

import org.springframework.metrics.instrument.annotation.Timed
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject
import java.net.URI

@RestController
@Timed
class RootController(val restTemplate: RestTemplate) {
    @GetMapping("/")
    fun index(): String {
        return "OK"
    }

    @GetMapping("/hello")
    fun hello(): String {
        return "Hello"
    }

    @GetMapping("/example")
    fun example(): Int {
        return restTemplate.getForObject<String>(URI("http://example.com")).length
    }
}