package com.edurt.ski.view

import com.edurt.ski.service.UserService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UserView(private val userService: UserService) {

    @GetMapping(value = "user_view")
    fun helloView(model: Model): String {
        model["users"] = this.userService.getAll(PageRequest(0, 10))
        return "user"
    }

}