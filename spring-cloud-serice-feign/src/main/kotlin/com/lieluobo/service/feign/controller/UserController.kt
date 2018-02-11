package com.lieluobo.service.feign.controller

import com.lieluobo.service.feign.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    @Autowired
    lateinit var userService: UserService

    @RequestMapping(value = "/hi2", method = [RequestMethod.GET])
    fun sayHi(@RequestParam name: String): String {
//        var req = QueryUserByNameReq()
//        req.name = "name"
        return userService.sayHiFromClientOne(name).toString()
    }

}