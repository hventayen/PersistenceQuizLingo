package com.example.quizlingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Question4Activity : AppCompatActivity() {

    private lateinit var previousButton: Button //initialize later
    private lateinit var nextButton: Button //initialize later


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTitle("Question 4")
        setContentView(R.layout.activity_question4)

        previousButton = findViewById(R.id.previousButton4)
        nextButton = findViewById(R.id.nextButton4)

        nextButton.text = "Next for results"

        previousButton.setOnClickListener {
            val Intent = Intent(this, Question3Activity::class.java)
            startActivity(Intent)
        }
        nextButton.setOnClickListener {
            val Intent = Intent(this, QuizResultsActivity::class.java)
            startActivity(Intent)
        }
    }
}