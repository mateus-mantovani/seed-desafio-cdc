package br.com.jornada.seeddesafiocdc

import jakarta.persistence.EntityManager
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController()
@RequestMapping("/author")
class AuthorController(
    private val entityManager: EntityManager,
) {
    @PostMapping
    @Transactional
    fun createAuthor(
        @RequestBody authorRequest: AuthorRequest,
    ) {
        val author =
            Author(
                name = authorRequest.name,
                email = authorRequest.email,
                description = authorRequest.description,
            )

        entityManager.persist(author)
    }
}
