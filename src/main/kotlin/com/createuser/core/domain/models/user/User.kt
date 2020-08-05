package com.createuser.core.domain.models.user

import com.createuser.dddFoundation.domain.Entity

class User(private val id: UserId, private val name: UserName): Entity() {
}