package com.createuser.core.infrastructure.httpClient.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
public class UserGetController {
    @GetMapping("/get")
    fun index(): String? {
        return "user get"
    }

}