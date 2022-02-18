package org.horiga.study.webflux

import org.springframework.cache.annotation.Cacheable
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository
) {
    @Cacheable("books#findAll")
    fun findAll() = bookRepository.findAll()
}