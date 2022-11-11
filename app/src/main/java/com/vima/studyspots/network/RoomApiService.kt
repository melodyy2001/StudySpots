package com.vima.studyspots.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://www.lib.utexas.edu/study-spaces-technology/"

// Using retrofit, helping us tell retrofit was to do with data
// build to create retrofit object with a converter
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface RoomApiService {
    // appending this to the get request
    // looking for subfolder/reserving a study room (reserve-study-room)
    @GET("reserve-study-room")
    // calling function from coroutine
    suspend fun getBookRoom(): String
}

// extending from RoomAPiService, inheriting it
object RoomApi{
    // waits for first usage before initializing
    val retrofitService : RoomApiService by lazy{
        retrofit.create(RoomApiService::class.java)
    }
}