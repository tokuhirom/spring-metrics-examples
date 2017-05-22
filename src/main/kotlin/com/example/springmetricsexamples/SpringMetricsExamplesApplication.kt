package com.example.springmetricsexamples

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.metrics.boot.EnableMetrics
import org.springframework.metrics.instrument.prometheus.EnablePrometheusScraping

@EnableAutoConfiguration
@ComponentScan
@EnableMetrics
@EnablePrometheusScraping
class SpringMetricsExamplesApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringMetricsExamplesApplication::class.java, *args)
}
