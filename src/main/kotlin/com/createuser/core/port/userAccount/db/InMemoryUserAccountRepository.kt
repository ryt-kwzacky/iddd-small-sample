package com.createuser.core.port.userAccount.db

import com.createuser.core.domain.userAccount.*
import com.createuser.dddFoundation.domain.repository.FindResult
import com.createuser.sharedKernel.InMemoryBaseRepository
import org.springframework.stereotype.Repository

@Repository
class InMemoryUserAccountRepository: UserAccountRepository {
    val repository = InMemoryBaseRepository<UserAccount>()

    fun reset() {
        repository.reset()
    }

    fun count() = repository.count()

    override fun findById(id: UserId): FindResult<UserAccount> = FindResult(repository.findBy { it.toDTO().id == id })

    override fun store(userAccount: UserAccount) {
        val dto = userAccount.toDTO()
        repository.store(
            UserAccount(
                id = dto.id,
                name = UserName(dto.name.value),
                sex = dto.sex,
                age = UserAge(dto.age.value),
                selfIntroduction = dto.selfIntroduction?.let { SelfIntroduction(it.value) }
            )
        )
    }
    override fun remove(userAccount: UserAccount) {
        TODO()
    }
}