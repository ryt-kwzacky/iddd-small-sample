package com.createuser.core.useCase.userAccount

import com.createuser.core.domain.userAccount.UserAccountRepository
import com.createuser.core.useCase.userAccount.command.ChangeUserNameCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ChangeUserNameUseCase(
        @Autowired private val userAccountRepository: UserAccountRepository
) {
    fun handle(command: ChangeUserNameCommand) {
        TODO()
    }
}