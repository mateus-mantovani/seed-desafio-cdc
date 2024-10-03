package br.com.jornada.seeddesafiocdc

import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class AuthorRequest(
    @NotBlank
    val name: String,
    @Email
    @NotBlank
    val email: String,
    @NotBlank
    @Size(max = 400)
    val description: String,
)
