package org.horiga.study.webflux

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.context.annotation.Configuration
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableDiscoveryClient
@EnableR2dbcRepositories
@EnableCaching
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

@ConfigurationProperties(prefix = "application")
data class ApplicationProperties(
	var name: String = "spring-webflux"
)

@Configuration
@EnableConfigurationProperties(ApplicationProperties::class)
class Configuration