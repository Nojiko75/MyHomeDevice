package com.example.domain.model

class Heater (
    override val id: Int,
    override val deviceName: String,
    val mode: Mode,
    val temperature: Int,
    override val productType: ProductType
) : Device(id, deviceName, productType)