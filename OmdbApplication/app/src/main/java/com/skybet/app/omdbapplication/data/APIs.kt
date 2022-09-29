package com.skybet.app.omdbapplication.data

import com.google.gson.JsonObject
import retrofit2.http.GET
import retrofit2.http.Query

interface APIs {

    @GET("api/users")
    suspend fun getMovies(@Query("API_KEY") apiKey : String, @Query("city") c : String = ""  ): JsonObject
}