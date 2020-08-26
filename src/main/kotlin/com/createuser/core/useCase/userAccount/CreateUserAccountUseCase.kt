package com.createuser.core.useCase.userAccount

import com.createuser.core.domain.userAccount.UserAccount
import com.createuser.core.domain.userAccount.UserAccountRepository
import com.createuser.core.useCase.userAccount.command.CreateUserAccountCommand
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CreateUserAccountUseCase(
        @Autowired private val userAccountRepository: UserAccountRepository
) {
    fun handle(command: CreateUserAccountCommand) {
        if (userAccountRepository.findById(command.id).exists())
            return

        val newUserAccount = UserAccount.createNewly(
                id = command.id,
                name = command.name,
                sex = command.sex,
                age = command.age,
                selfIntroduction = command.selfIntroduction
        )
        userAccountRepository.store(newUserAccount)
    }
}