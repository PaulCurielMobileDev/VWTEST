package com.mexicandeveloper.vwtest.api

import com.mexicandeveloper.vwtest.models.InfoResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET(".json")
    suspend fun getInfo():Response<InfoResponse>
}