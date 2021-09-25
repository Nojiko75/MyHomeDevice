package com.example.domain.usecase

import com.example.domain.model.Device
import com.example.domain.model.Result
import com.example.domain.repository.DeviceRepository

class GetDeviceListImpl (
    private val deviceRepository: DeviceRepository
) : GetDeviceList {
    override suspend fun getUserList(): Result<List<Device>> {
        return deviceRepository.getDeviceList()
    }
}