package com.createuser.core.domain.userAccount

class SelfIntroduction(val value: String) {

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: String)
}