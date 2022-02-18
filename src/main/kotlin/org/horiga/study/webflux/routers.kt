package org.horiga.study.webflux

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.router

@Configuration
class RouterConfig {

    @Bean
    fun router(bookHandler: BookHandler) = router {
        "/books".nest {
            GET("", bookHandler::findAll)
        }
    }
}