package com.example.app.model.entity

import retrofit2.http.GET

interface ApiService {
    @GET("data")
    suspend fun fetchData(): ApiResponse // Assuming ApiResponse is your data model
}