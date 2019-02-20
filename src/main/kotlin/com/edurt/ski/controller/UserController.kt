package com.edurt.ski.controller

import com.edurt.ski.model.UserModel
import com.edurt.ski.service.UserService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.web.bind.annotation.*

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

    @GetMapping(value = "list")
    fun get(): Page<UserModel> = this.userService.getAll(PageRequest(0, 10))

}