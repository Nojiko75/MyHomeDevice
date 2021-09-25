package com.example.domain.repository

import com.example.domain.model.Device
import com.example.domain.model.Result

interface DeviceRepository {
    suspend fun getDeviceList() : Result<List<Device>>
}