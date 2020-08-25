package com.createuser.core.useCase.userAccount.command

import com.createuser.core.domain.userAccount.*

data class CreateUserAccountCommand private constructor(
        val id: UserId,
        val name: UserName,
        val sex: UserSexType,
        val age: UserAge,
        val selfIntroduction: SelfIntroduction?
) {
    companion object {
        fun create(id: String,
                   name: String,
                   sex: UserSexType,
                   age: Number,
                   selfIntroduction: String?
        ) = CreateUserAccountCommand(
                id = UserId(id),
                name = UserName(name),
                sex = sex,
                age = UserAge(age),
                selfIntroduction = selfIntroduction?.let { SelfIntroduction(selfIntroduction) }
        )
    }
}