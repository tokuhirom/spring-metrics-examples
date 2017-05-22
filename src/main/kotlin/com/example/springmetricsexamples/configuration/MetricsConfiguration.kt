package com.example.springmetricsexamples.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.metrics.instrument.prometheus.PrometheusMeterRegistry
import org.springframework.metrics.instrument.MeterRegistry
import org.springframework.metrics.instrument.binder.*
import org.springframework.web.client.RestTemplate


@Configuration
open class MetricsConfiguration {
    @Bean
    fun prometheusRegistry(): MeterRegistry {
        return PrometheusMeterRegistry()
                .bind(JvmGcMetrics())
//                .bind(JvmMemoryMetrics())
                .bind(ProcessorMetrics())
                .bind(LogbackMetrics())
                .bind(ThreadMetrics())
                .bind(ClassLoaderMetrics())
    }

    @Bean
    fun restTemplate() : RestTemplate {
        return RestTemplate()
    }

}