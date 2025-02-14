package com.oriol.m8

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private var contador = 0;
    private var textSize = 23f
    private var showButton = 1f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layout = findViewById<ConstraintLayout>(R.id.main)
        val textView = findViewById<TextView>(R.id.textView)
        val buttonSumar = findViewById<Button>(R.id.button)
        val buttonRestar = findViewById<Button>(R.id.button2)
        val buttonAumentar = findViewById<Button>(R.id.button3)
        val buttonDisminuir = findViewById<Button>(R.id.button6)
        val buttonEsconder = findViewById<Button>(R.id.button4)
        val buttonMostrar = findViewById<Button>(R.id.button7)
        val buttonColorText = findViewById<Button>(R.id.button5)
        val buttonBackgroundColor = findViewById<Button>(R.id.button8)

        buttonSumar.setOnClickListener{
            contador++
            textView.text = contador.toString()
        }
        buttonRestar.setOnClickListener {
            contador--
            textView.text = contador.toString()
        }

        buttonAumentar.setOnClickListener {
            textSize++
            textView.textSize = textSize
        }
        buttonDisminuir.setOnClickListener {
            textSize--
            textView.textSize = textSize
        }

        buttonEsconder.setOnClickListener {
            showButton = 0f
            textView.alpha = showButton
        }

        buttonMostrar.setOnClickListener {
            showButton = 1f
            textView.alpha = showButton
        }

        buttonColorText.setOnClickListener {
            val color = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            textView.setTextColor(color)
        }

        buttonBackgroundColor.setOnClickListener {
            val color = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            layout.setBackgroundColor(color)
        }



    }
}