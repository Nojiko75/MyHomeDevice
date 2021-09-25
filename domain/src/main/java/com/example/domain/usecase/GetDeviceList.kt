package com.example.domain.usecase

import com.example.domain.model.Device
import com.example.domain.model.Result

interface GetDeviceList {
    suspend fun getUserList() : Result<List<Device>>
}