package com.example.domain.model

class Light (
    override val id: Int,
    override val deviceName: String,
    val intensity: Int,
    val mode: Mode,
    override val productType: ProductType
) : Device(id, deviceName, productType)