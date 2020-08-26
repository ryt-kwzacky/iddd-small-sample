package com.createuser.core.domain.userAccount

class UserName(val value: String) {
    companion object {
        const val MINIMUM_LENGTH = 2
        const val MAXIMUM_LENGTH = 16
    }

    init {
        validateFields()
    }

    private fun validateFields() {
        require(value.length in MINIMUM_LENGTH..MAXIMUM_LENGTH) {
            "$value is invalid length for UserName in ${this::class}"
        }
    }

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: String)
}