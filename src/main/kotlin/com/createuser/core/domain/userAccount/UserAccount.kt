package com.createuser.core.domain.userAccount

class UserAccount(val id: UserId,
                  private val name: UserName,
                  private val sex: UserSexType,
                  private val age: UserAge,
                  private val selfIntroduction: SelfIntroduction?
) {
    companion object {
        fun createNewly(id: UserId,
                        name: UserName,
                        sex: UserSexType,
                        age: UserAge,
                        selfIntroduction: SelfIntroduction?
        ) = UserAccount(
                id = id,
                name = name,
                sex = sex,
                age = age,
                selfIntroduction = selfIntroduction
        )
    }

    fun toDTO(): DTO = DTO(
            id = id,
            name = name.toDTO(),
            sex = sex,
            age = age.toDTO(),
            selfIntroduction = selfIntroduction?.toDTO()
    )

    data class DTO(
            val id: UserId,
            val name: UserName.DTO,
            val sex: UserSexType,
            val age: UserAge.DTO,
            val selfIntroduction: SelfIntroduction.DTO?
    )
}