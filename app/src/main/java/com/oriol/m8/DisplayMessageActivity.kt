package com.oriol.m8

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra("ms")
        // Capture the layout's TextView and set the string as its text
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }


        val imageView = findViewById<ImageView>(R.id.imageView).apply {

        }
    }
}