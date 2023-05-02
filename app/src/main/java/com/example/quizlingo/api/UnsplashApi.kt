package com.example.quizlingo.api

import retrofit2.Call
import retrofit2.http.*

interface UnsplashApi {
//    @Headers("Accept-Version: v1", "Authorization: Client-ID IUBzaTo1Z3ItDHcMBjEt4XnYZp4Yi-DOignqYULIOiI")
    @GET("search/photos")
    fun fetchPhoto(): Call<UnsplashGetPhotosResponse>

    suspend fun searchPhotos(
        @Query("query")
    )
}