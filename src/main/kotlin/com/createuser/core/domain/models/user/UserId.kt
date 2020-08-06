package com.createuser.core.domain.models.user

import com.createuser.dddFoundation.domain.ValueObject

class UserId(private val value: String): ValueObject() {
    companion object {
        const val IDENTIFY_LENGTH = 28
    }

    init {
        validateFields()
    }

    private fun validateFields() {
        require(value.length == IDENTIFY_LENGTH)
    }
}