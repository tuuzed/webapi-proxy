package com.tuuzed.common.webapi.client

import com.tuuzed.common.webapi.ListResp
import com.tuuzed.common.webapi.Resp
import com.tuuzed.common.webapi.http.Endpoint

interface WebApi {

    @Endpoint("/obj", method = "GET")
    fun obj(): Resp<Data>

    @Endpoint("/error", method = "GET")
    fun error(): Resp<Data>

    @Endpoint("/list", method = "GET")
    fun list(): ListResp<Data>

}