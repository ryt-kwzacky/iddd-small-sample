package com.createuser.core.domain.userAccount

class UserAccount(val id: UserId,
                  private val name: UserName,
                  private val sex: UserSex,
                  private val age: UserAge) {}