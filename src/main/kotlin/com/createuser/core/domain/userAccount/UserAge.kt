package com.createuser.core.domain.userAccount

class UserAge(val value: Number) {
    companion object {
        const val MINIMUM_NUMBER = 0
        const val MAXIMUM_NUMBER = 100
    }

    init {
        validateFields()
    }

    private fun validateFields() {
        require(value in UserAge.MINIMUM_NUMBER..UserAge.MAXIMUM_NUMBER) {
            "$value is invalid number for UserAge in ${this::class}"
        }
    }

    fun toDTO(): DTO = DTO(value = value)

    data class DTO(val value: Number)
}