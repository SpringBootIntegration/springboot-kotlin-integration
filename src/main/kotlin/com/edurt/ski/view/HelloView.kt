package com.edurt.ski.view

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloView {

    @GetMapping(value = "hello_view")
    fun helloView(model: Model): String {
        return "hello"
    }

}