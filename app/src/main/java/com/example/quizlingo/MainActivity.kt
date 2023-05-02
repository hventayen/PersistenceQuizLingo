package com.example.quizlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// Hello, this is Connie. Let me know if you have any questions or think if there's anything better
// we can do.

class MainActivity : AppCompatActivity() {

    private lateinit var startButton: Button //initialize later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getSupportActionBar()?.hide()
        setContentView(R.layout.activity_main)

        startButton = findViewById(R.id.startQuiz)

        startButton.setOnClickListener {
            val Intent = Intent(this, Question1Activity::class.java)
            startActivity(Intent)
        }
    }
}