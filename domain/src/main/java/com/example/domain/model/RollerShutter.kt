package com.example.domain.model

class RollerShutter (
    override val id: Int,
    override val deviceName: String,
    val position: Int,
    override val productType: ProductType
): Device(id, deviceName, productType)