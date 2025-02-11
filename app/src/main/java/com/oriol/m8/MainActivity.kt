package com.oriol.m8

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.editTextText)
        val message = editText.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java)
        intent.putExtra("ms", message)
        startActivity(intent)


    }
}