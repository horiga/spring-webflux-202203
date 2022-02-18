package org.horiga.study.webflux

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse

@Component
class BookHandler(
    val bookService: BookService
) {
    fun findAll(req: ServerRequest) =
        ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)
            .body(bookService.findAll(), BookEntity::class.java)
}