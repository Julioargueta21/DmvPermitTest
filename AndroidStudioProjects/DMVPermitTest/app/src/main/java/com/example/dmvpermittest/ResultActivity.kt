package com.example.dmvpermittest

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dmvpermittest.*
import com.permittest.jargueta.databinding.ActivityResultBinding
import com.quizapp.Constants
import java.util.*


class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions."
        binding.btnFinish.setBackgroundColor(Color.parseColor("#5E5A60"))
        binding.btnFinish.isEnabled = false

        
        binding.btnFinish.postDelayed({
            binding.btnFinish.setBackgroundColor(Color.parseColor("#6a1b9a"))
            binding.btnFinish.isEnabled = true
        }, 5000)

        binding.btnFinish.setOnClickListener {
            startActivity(Intent(this@ResultActivity, MainActivity::class.java))
        }
    }
}