package com.example.quizlingo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.quizlingo.api.UnsplashExecutor

class PhotoAPIFragment : Fragment() {
    private lateinit var photoView: ImageView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.photoapi_fragment, container, false)
        this.photoView = view.findViewById(R.id.photo_view)

        // Hardcoded "dog" to be the query, this is temporary until we have a word bank
        val query = "dog"
        val unsplashExecutor = UnsplashExecutor(photoView)
        unsplashExecutor.searchPhotos(query)

        return view
    }
}