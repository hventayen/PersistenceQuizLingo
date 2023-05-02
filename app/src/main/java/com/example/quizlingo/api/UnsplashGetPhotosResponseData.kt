package com.example.quizlingo.api

import com.google.gson.annotations.SerializedName

class UnsplashGetPhotosResponseData {
    @SerializedName("regular")
    lateinit var regular: List<PhotoItem>
}