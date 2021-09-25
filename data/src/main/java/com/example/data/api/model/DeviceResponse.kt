package com.example.data.api.model

import com.example.domain.model.Address
import com.example.domain.model.Mode
import com.example.domain.model.ProductType
import com.example.domain.model.User
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class DeviceResponse (
    @SerializedName("devices")
    @Expose
    val devices: List<DeviceItem>,
    @SerializedName("user")
    @Expose
    val user: User
)

data class DeviceItem (
    @SerializedName("id")
    @Expose
    val id: Int,
    @SerializedName("deviceName")
    @Expose
    val deviceName: String,
    @SerializedName("intensity")
    @Expose
    val intensity: Int?,
    @SerializedName("mode")
    @Expose
    val mode: Mode?,
    @SerializedName("position")
    @Expose
    val position: Int?,
    @SerializedName("temperature")
    @Expose
    val temperature: Int?,
    @SerializedName("productType")
    @Expose
    val productType: ProductType
)

data class Address (
    @SerializedName("city")
    @Expose
    val city: String,
    @SerializedName("postalCode")
    @Expose
    val postalCode: Int,
    @SerializedName("street")
    @Expose
    val street: String,
    @SerializedName("streetCode")
    @Expose
    val streetCode: String,
    @SerializedName("country")
    @Expose
    val country: String
)

data class User (
    val firstName: String,
    val lastName: String,
    val address: Address,
    val birthDate: Long
)