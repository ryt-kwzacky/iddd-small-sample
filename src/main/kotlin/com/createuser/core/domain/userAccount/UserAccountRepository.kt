package com.createuser.core.domain.userAccount

interface UserAccountRepository {
    fun findById(id: UserId)
    fun store(userAccount: UserAccount)
    fun remove(userAccount: UserAccount)
}