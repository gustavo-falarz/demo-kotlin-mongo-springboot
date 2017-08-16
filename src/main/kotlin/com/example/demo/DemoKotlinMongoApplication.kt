package com.example.demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoKotlinMongoApplication {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            SpringApplication.run(DemoKotlinMongoApplication::class.java, *args)

        }
    }
}