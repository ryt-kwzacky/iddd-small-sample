package com.createuser.core.port.userAccount.db

import com.createuser.core.domain.userAccount.UserAccount
import com.createuser.core.domain.userAccount.UserAccountRepository
import com.createuser.core.domain.userAccount.UserId
import com.createuser.sharedKernel.InMemoryBaseRepository
import org.springframework.stereotype.Repository

@Repository
class InMemoryUserAccountRepository: UserAccountRepository {
    val repository = InMemoryBaseRepository<UserAccount>()

    fun reset() {
        repository.reset()
    }

    fun count() = repository.count()

    override fun findById(id: UserId) {
        TODO()
    }
    override fun store(userAccount: UserAccount) {
        TODO()
    }
    override fun remove(userAccount: UserAccount) {
        TODO()
    }
}