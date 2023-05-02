package com.example.quizlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question3Activity : AppCompatActivity() {

    private lateinit var previousButton: Button //initialize later
    private lateinit var nextButton: Button //initialize later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Question 3")
        setContentView(R.layout.activity_question3)

        previousButton = findViewById(R.id.previousButton3)
        nextButton = findViewById(R.id.nextButton3)

        previousButton.setOnClickListener {
            val Intent = Intent(this, Question3Activity::class.java)
            startActivity(Intent)
        }
        nextButton.setOnClickListener {
            val Intent = Intent(this, Question4Activity::class.java)
            startActivity(Intent)
        }
    }
}