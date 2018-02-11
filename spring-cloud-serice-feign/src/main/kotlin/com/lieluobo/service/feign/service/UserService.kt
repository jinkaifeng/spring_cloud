package com.lieluobo.service.feign.service

import com.lieluobo.facade.req.QueryUserByNameReq
import com.lieluobo.facade.resp.UserVo
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(value = "service-hi")
interface UserService {
    @RequestMapping(value = "/hi2", method = [RequestMethod.GET])
    fun sayHiFromClientOne(@RequestParam(value = "name") name: String): UserVo
}