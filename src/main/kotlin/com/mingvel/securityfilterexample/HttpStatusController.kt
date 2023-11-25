package com.mingvel.securityfilterexample

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/http-status")
class HttpStatusController {

    @GetMapping("/ok")
    fun getStatusOk(): ResponseEntity<Any> {
        return ResponseEntity.ok().build()
    }
}
