package com.mexicandeveloper.vwtest.repository

import com.mexicandeveloper.vwtest.api.ApiService
import javax.inject.Inject

class InfoRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getInfo() = apiService.getInfo()
}