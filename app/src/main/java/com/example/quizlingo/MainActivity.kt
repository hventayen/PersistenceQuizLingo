package com.example.quizlingo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val photoFragment = this.supportFragmentManager.findFragmentById(R.id.photo_fragment_container)
        if (photoFragment == null) {
            val fragment = PhotoFragment()
            this.supportFragmentManager
                .beginTransaction()
                .add(R.id.photo_fragment_container, fragment)
                .commit()
        }
    }
}