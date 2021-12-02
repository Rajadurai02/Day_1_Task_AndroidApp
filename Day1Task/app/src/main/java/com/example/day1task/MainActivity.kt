package com.example.day1task

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val targetView = findViewById<TextView>(R.id.targetView)
        val redButton = findViewById<TextView>(R.id.RedView)
        val greenButton = findViewById<TextView>(R.id.GreenView)
        val blueButton = findViewById<TextView>(R.id.BlueView)

        redButton.setOnClickListener{
            targetView.text = "Red was clicked"
        }
        greenButton.setOnClickListener{
            targetView.text = "Green was clicked"
        }
        blueButton.setOnClickListener{
            targetView.text = "Blue was clicked"
        }
    }
}