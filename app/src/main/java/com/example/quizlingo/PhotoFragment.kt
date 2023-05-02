package com.example.quizlingo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider

class PhotoFragment : Fragment() {
    private lateinit var photoViewModel: PhotoViewModel

    private lateinit var imageView: ImageView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // missing
        this.photoViewModel = ViewModelProvider(this.requireActivity())[PhotoViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_photo, container, false)

        this.imageView = view.findViewById(R.id.imageView)
        this.button = view.findViewById(R.id.button)

        return view
    }
}