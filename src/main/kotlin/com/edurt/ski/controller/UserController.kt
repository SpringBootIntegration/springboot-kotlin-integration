package com.edurt.ski.controller

import com.edurt.ski.model.UserModel
import com.edurt.ski.service.UserService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = "user")
class UserController(private val userService: UserService) {

    @PostMapping(value = "save/{name}")
    fun save(@PathVariable name: String): UserModel {
        val userModel = UserModel()
//        userModel.id = 1
        userModel.name = name
        return this.userService.save(userModel)
    }

}