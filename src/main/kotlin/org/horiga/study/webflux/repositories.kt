package org.horiga.study.webflux

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import org.springframework.data.repository.reactive.ReactiveCrudRepository
import org.springframework.stereotype.Repository
import java.time.Instant

@Table("book")
data class BookEntity(
    var isbn: String? = null,
    var name: String? = null,
    var price: Long? = null,
    @Column("published_at")
    var publishedAt: Instant? = null,
    @Column("updated_at")
    var updatedAt: Instant? = null,
    @Id
    var id: Long? = null
)

@Repository
interface BookRepository: ReactiveCrudRepository<BookEntity, Long> {
}