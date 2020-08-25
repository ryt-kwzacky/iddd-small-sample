package com.createuser.dddFoundation.domain.repository

class FindResult<T>(private val entity: T?) {
    fun getOrNull(): T? = entity
    fun getOrFail(): T = entity ?: throw IllegalArgumentException("failed to find result")
    fun exists(): Boolean = entity != null
}