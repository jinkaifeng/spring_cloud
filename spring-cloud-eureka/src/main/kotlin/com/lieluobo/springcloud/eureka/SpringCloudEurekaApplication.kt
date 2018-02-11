package com.lieluobo.springcloud.eureka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class SpringCloudEurekaApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaApplication::class.java, *args)
}
