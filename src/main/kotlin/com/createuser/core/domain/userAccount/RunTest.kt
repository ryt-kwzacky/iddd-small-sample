package com.createuser.core.domain.userAccount

import com.createuser.core.port.userAccount.db.InMemoryUserAccountRepository
import com.createuser.core.useCase.userAccount.CreateUserAccountUseCase
import com.createuser.core.useCase.userAccount.command.CreateUserAccountCommand
import com.createuser.dddFoundation.domain.repository.FindResult
import com.createuser.sharedKernel.InMemoryBaseRepository

val userAccountRepository = InMemoryUserAccountRepository()

val useCase = CreateUserAccountUseCase(
        userAccountRepository = userAccountRepository
)

val defaultId = UserId("test-id")
val defaultName = UserName("test-name")
val defaultSex = UserSexType.MAN
val defaultAge = UserAge(20)
val defaultSelfIntroduction = SelfIntroduction("test-self-introduction")

val command = CreateUserAccountCommand.create(
        id = defaultId.value,
        name = defaultName.value,
        sex = defaultSex,
        age = defaultAge.value,
        selfIntroduction = defaultSelfIntroduction.value
)

fun main() {
    val userAccount = UserAccount.createNewly(
            id = defaultId,
            name = defaultName,
            sex = defaultSex,
            age = defaultAge,
            selfIntroduction = defaultSelfIntroduction
    )

    val dto = userAccount.toDTO()
    println(dto.id)

}