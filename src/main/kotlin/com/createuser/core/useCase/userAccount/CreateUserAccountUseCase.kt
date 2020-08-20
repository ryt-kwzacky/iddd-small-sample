package com.createuser.core.useCase.userAccount

import com.createuser.core.domain.userAccount.UserAccountRepository
import com.createuser.core.useCase.userAccount.command.CreateUserAccountCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateUserAccountUseCase(
        @Autowired private val userAccountRepository: UserAccountRepository
) {
    fun handle(command: CreateUserAccountCommand) {
        TODO()
    }
}