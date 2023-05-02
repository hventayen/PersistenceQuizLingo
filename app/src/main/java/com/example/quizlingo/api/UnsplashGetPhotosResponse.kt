package com.example.quizlingo.api

import com.google.gson.annotations.SerializedName

class UnsplashGetPhotosResponse {
    @SerializedName("urls")
    lateinit var urls: UnsplashGetPhotosResponseData
}
