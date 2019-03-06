package com.example.recyclerview.remote.retrofit

object ApiUtils {

    val BASE_URL = "https://api.github.com/"
    val soService: SOService
        get() = RetrofitClient.getClient(BASE_URL).create(SOService::class.java!!)
}