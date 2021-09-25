package com.example.data.api

import com.example.data.api.model.DeviceResponse
import retrofit2.Response
import retrofit2.http.GET

interface DeviceApi {
    @GET
    suspend fun getDeviceList() : Response<DeviceResponse>
}