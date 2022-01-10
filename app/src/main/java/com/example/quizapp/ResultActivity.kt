package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val username = intent.getStringExtra(Constants.User_Name)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.Total_Question,0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        tv_Score.text ="Your Score is $correctAnswer out of $totalQuestions"
        bt_finish.setOnClickListener()
        {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}