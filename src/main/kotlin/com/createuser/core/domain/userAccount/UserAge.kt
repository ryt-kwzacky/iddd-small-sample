package com.createuser.core.domain.userAccount

class UserAge(val value: Number) {

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: Number)
}