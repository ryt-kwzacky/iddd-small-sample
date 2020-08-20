package com.createuser.core.useCase.userAccount.command

data class DeleteUserAccountCommand private constructor(
        val todo: String
) {
    companion object {
        fun create() = DeleteUserAccountCommand(
                todo = "TODO"
        )
    }
}