package com.example.quizlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question1Activity : AppCompatActivity() {

    private lateinit var previousButton: Button //initialize later
    private lateinit var nextButton: Button //initialize later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Question 1")
        setContentView(R.layout.activity_question1)

        previousButton = findViewById(R.id.previousButton1)
        nextButton = findViewById(R.id.nextButton1)

        previousButton.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
        nextButton.setOnClickListener {
            val Intent = Intent(this, Question2Activity::class.java)
            startActivity(Intent)
        }
    }
}