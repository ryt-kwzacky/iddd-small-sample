package com.createuser.core.domain.userAccount

class SelfIntroduction(val value: String) {
    companion object {
        const val MAXIMUM_LENGTH = 200
    }

    init {
        validateFields()
    }

    private fun validateFields() {
        require(value.length <= MAXIMUM_LENGTH) {
            "$value is invalid length for SelfIntroduction in ${this::class}"
        }
    }

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: String)
}