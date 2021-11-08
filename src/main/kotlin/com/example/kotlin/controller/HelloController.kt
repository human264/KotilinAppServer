package com.example.kotlin.controller

import com.example.kotlin.common.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HelloController {




    @GetMapping("/api/v1/hello")
    fun hello() = ApiResponse.ok("world")


}