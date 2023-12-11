package com.example.practica_appemisora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val b_enviar : Button = findViewById(R.id.b_enviar)

        b_enviar.setOnClickListener {
            val intent =
        }
    }

}