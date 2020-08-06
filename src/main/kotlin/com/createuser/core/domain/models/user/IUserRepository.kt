package com.createuser.core.domain.models.user

interface IUserRepository {
    abstract fun findById(id: UserId): User
    abstract fun findByName(name: UserName): User
    abstract fun save(user: User): Void
    abstract fun delete(user: User): Void
}