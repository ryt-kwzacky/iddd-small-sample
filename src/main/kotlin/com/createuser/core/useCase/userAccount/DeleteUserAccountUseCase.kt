package com.createuser.core.useCase.userAccount

import com.createuser.core.domain.userAccount.UserAccountRepository
import com.createuser.core.useCase.userAccount.command.DeleteUserAccountCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeleteUserAccountUseCase(
        @Autowired private val userAccountRepository: UserAccountRepository
) {
    fun handle(command: DeleteUserAccountCommand) {
        TODO()
    }
}