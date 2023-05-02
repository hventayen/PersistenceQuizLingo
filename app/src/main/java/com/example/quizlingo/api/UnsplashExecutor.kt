package com.example.quizlingo.api

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val TAG = "UnsplashExecutor"

class UnsplashExecutor {
    private val api: UnsplashApi

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.unsplash.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        this.api = retrofit.create(UnsplashApi::class.java)
    }

    fun fetchPhotos(): LiveData<List<PhotoItem>> {
        val responseLiveData: MutableLiveData<List<PhotoItem>> = MutableLiveData()
        val unsplashRequest: Call<UnsplashGetPhotosResponse> = this.api.fetchPhoto()

        unsplashRequest.enqueue(object: Callback<UnsplashGetPhotosResponse>{
            override fun onFailure(call: Call<UnsplashGetPhotosResponse>, t: Throwable) {
                Log.e(TAG, "Failed to fetch Unsplash photo.")
            }

            override fun onResponse(
                call: Call<UnsplashGetPhotosResponse>,
                response: Response<UnsplashGetPhotosResponse>
            ) {
                Log.d(TAG, "Response received from Unsplash endpoint.")

                val unsplashGetPhotosResponse: UnsplashGetPhotosResponse? = response.body()
                val unsplashGetPhotosResponseData: UnsplashGetPhotosResponseData? = unsplashGetPhotosResponse?.urls

                var generatedPhotos: List<PhotoItem> = unsplashGetPhotosResponseData?.regular ?: mutableListOf()
                generatedPhotos = generatedPhotos.filterNot {
                    it.regular.isBlank()
                }
                Log.d(TAG, "Unsplash photos: $generatedPhotos")

                responseLiveData.value = generatedPhotos
            }
        })


        return responseLiveData
    }
}