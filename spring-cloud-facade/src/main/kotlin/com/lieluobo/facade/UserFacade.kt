package com.lieluobo.facade

import com.lieluobo.facade.req.QueryUserByNameReq
import com.lieluobo.facade.resp.UserVo

interface UserFacade {

    fun queryUserByName(name: String): UserVo

}