package com.example.quizlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question2Activity : AppCompatActivity() {

    private lateinit var previousButton: Button //initialize later
    private lateinit var nextButton: Button //initialize later

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Question 2")
        setContentView(R.layout.activity_question2)

        previousButton = findViewById(R.id.previousButton2)
        nextButton = findViewById(R.id.nextButton2)

        previousButton.setOnClickListener {
            val Intent = Intent(this, Question1Activity::class.java)
            startActivity(Intent)
        }
        nextButton.setOnClickListener {
            val Intent = Intent(this, Question3Activity::class.java)
            startActivity(Intent)
        }
    }
}