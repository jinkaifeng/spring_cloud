package com.lieluobo.service.feign

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.feign.EnableFeignClients


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
class SpringCloudClientApplication{
//    @Value("\${server.port}")
//    var port: String? = null
//
//    @RequestMapping("/hi")
//    fun home(@RequestParam name: String): String {
//        return "hi $name,i am from port:$port"
//    }
//
//    @RequestMapping("/hi2")
//    override fun queryUserByName(@ModelAttribute req: QueryUserByNameReq): UserVo {
//        println (req)
//        return UserVo(1L,"123","1234","$port")
//    }
}

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudClientApplication::class.java, *args)
}

