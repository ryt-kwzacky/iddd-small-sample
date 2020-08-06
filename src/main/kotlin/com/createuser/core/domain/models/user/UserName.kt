package com.createuser.core.domain.models.user

import com.createuser.dddFoundation.domain.ValueObject

data class UserName(private val value: String) : ValueObject() {
    companion object {
        const val MINIMUM_USER_NAME_LENGTH = 3
        const val MAXIMUM_USER_NAME_LENGTH = 16
    }

    init {
        validateFields()
    }

    private fun validateFields() {
        require(value.length in MINIMUM_USER_NAME_LENGTH..MAXIMUM_USER_NAME_LENGTH)
    }
}
