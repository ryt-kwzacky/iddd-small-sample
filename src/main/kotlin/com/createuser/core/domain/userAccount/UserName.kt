package com.createuser.core.domain.userAccount

class UserName(val value: String) {

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: String)
}