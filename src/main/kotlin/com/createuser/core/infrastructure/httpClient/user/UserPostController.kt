package com.createuser.core.infrastructure.httpClient.user

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user")
public class UserPostController {
    @PostMapping("/create")
    fun create() {
        println("crete")
    }
}