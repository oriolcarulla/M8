package com.oriol.m8

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import kotlin.random.Random

class Part1 : AppCompatActivity() {
    private var contador = 0
    private var textSize = 23f
    private var showButton = 1f
    private var textColor = Color.BLACK
    private var backgroundColor = Color.WHITE

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.part1)

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

        // Restaurar estado si existe
        if (savedInstanceState != null) {
            contador = savedInstanceState.getInt("contador", 0)
            textSize = savedInstanceState.getFloat("textSize", 23f)
            showButton = savedInstanceState.getFloat("showButton", 1f)
            textColor = savedInstanceState.getInt("textColor", Color.BLACK)
            backgroundColor = savedInstanceState.getInt("backgroundColor", Color.WHITE)
        }

        // Aplicar valores restaurados
        textView.text = contador.toString()
        textView.textSize = textSize
        textView.alpha = showButton
        textView.setTextColor(textColor)
        layout.setBackgroundColor(backgroundColor)

        buttonSumar.setOnClickListener {
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
            textColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            textView.setTextColor(textColor)
        }

        buttonBackgroundColor.setOnClickListener {
            backgroundColor = Color.rgb(
                Random.nextInt(256),
                Random.nextInt(256),
                Random.nextInt(256)
            )
            layout.setBackgroundColor(backgroundColor)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contador", contador)
        outState.putFloat("textSize", textSize)
        outState.putFloat("showButton", showButton)
        outState.putInt("textColor", textColor)
        outState.putInt("backgroundColor", backgroundColor)
    }
}
