package com.createuser.core.domain.userAccount

import com.createuser.dddFoundation.domain.AbstractId

class UserId(value: String): AbstractId(value) {

    override fun equals(other: Any?): Boolean {
        if (other !== null && other::class.java == this::class.java)
            return (other as AbstractId).value == this.value
        return false
    }

    override fun hashCode(): Int {
        /**
         * Prime number to calculate hasCode.
         * 31 is general number to do in Java.
         */
        val prime = 31

        /**
         * Reasonable number to make hasCode different from other classes.
         */
        val result = 432

        return prime * result + this.value.hashCode()
    }
}