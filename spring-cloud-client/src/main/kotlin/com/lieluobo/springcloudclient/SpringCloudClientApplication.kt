package com.lieluobo.springcloudclient

import com.lieluobo.facade.UserFacade
import com.lieluobo.facade.req.QueryUserByNameReq
import com.lieluobo.facade.resp.UserVo
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping



@SpringBootApplication
@EnableEurekaClient
@RestController
class SpringCloudClientApplication :UserFacade{
    @Value("\${server.port}")
    var port: String? = null

    @RequestMapping("/hi")
    fun home(@RequestParam name: String): String {
        return "hi $name,i am from port:$port"
    }

    @RequestMapping("/hi2")
    override fun queryUserByName(@RequestParam name: String): UserVo {
        println (name)
        return UserVo(1L,name,"1234","$port")
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudClientApplication::class.java, *args)
}

