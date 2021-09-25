package com.example.data.di

import com.example.data.api.DeviceApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val apiModule = module {
    single { get<Retrofit>().create(DeviceApi::class.java) }

    single {
        Retrofit.Builder()
            .baseUrl("http://storage42.com/modulotest/data.json")
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}