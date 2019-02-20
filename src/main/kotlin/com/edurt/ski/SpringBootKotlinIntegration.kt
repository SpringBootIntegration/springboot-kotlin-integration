package com.edurt.ski

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@ComponentScan(value = [
    "com.edurt.ski",
    "com.edurt.ski.controller"
])
class SpringBootKotlinIntegration

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinIntegration>(*args)
}
