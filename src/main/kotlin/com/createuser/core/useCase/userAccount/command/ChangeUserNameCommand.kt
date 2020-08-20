package com.createuser.core.useCase.userAccount.command

data class ChangeUserNameCommand private constructor(
        val todo: String
) {
    companion object {
        fun create() = ChangeUserNameCommand(
                todo = "TODO"
        )
    }
}