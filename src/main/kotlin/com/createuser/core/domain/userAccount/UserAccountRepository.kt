package com.createuser.core.domain.userAccount

import com.createuser.dddFoundation.domain.repository.FindResult

interface UserAccountRepository {
    fun findById(id: UserId): FindResult<UserAccount>
    fun store(userAccount: UserAccount)
    fun remove(userAccount: UserAccount)
}