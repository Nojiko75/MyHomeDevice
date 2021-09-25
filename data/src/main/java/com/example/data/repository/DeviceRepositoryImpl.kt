package com.example.data.repository

import com.example.data.api.DeviceApi
import com.example.domain.model.Device
import com.example.domain.model.Result
import com.example.domain.repository.DeviceRepository

class DeviceRepositoryImpl (
    private val deviceApi: DeviceApi
) : DeviceRepository {
    override suspend fun getDeviceList(): Result<List<Device>> {
        val response = deviceApi.getDeviceList()
        if (response.isSuccessful) {
            response.body()?.let { deviceResponse ->
                val deviceList = deviceResponse.devices
                return Result.Success(listOf())
            }
        }
        return Result.Failure(Exception("error"), "error")
    }
}