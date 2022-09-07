package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
        val viewText = findViewById<TextView>(R.id.textView)
        var counter = 0
            btnClickMe.setOnClickListener {
                counter += 1
                viewText.text = counter.toString()
            }

    }
}