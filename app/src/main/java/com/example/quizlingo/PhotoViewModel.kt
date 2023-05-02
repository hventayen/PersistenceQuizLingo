package com.example.quizlingo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.quizlingo.api.PhotoItem
import com.example.quizlingo.api.UnsplashExecutor

class PhotoViewModel : ViewModel() {
//    private var userWordGuess: String = ""

    val generatedPhotoLiveData: LiveData<List<PhotoItem>>
    init {
        this.generatedPhotoLiveData = UnsplashExecutor().fetchPhotos()
    }

//    fun setWord(word: String) {
//        this.userWordGuess = word
//    }
//
//    fun getWord(): String {
//        return this.userWordGuess
//    }

}