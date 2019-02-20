package com.edurt.ski

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootKotlinIntegration

fun main(args: Array<String>) {
    runApplication<SpringBootKotlinIntegration>(*args)
}
