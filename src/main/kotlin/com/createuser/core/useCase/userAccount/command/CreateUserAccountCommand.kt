package com.createuser.core.useCase.userAccount.command

data class CreateUserAccountCommand private constructor(
        val todo: String
) {
    companion object {
        fun create() = CreateUserAccountCommand(
                todo = "TODO"
        )
    }
}