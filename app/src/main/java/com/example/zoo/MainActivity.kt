package com.example.zoo

// MainActivity to mapka próbowałem zmienić nazwe i błedy najebało -DJ

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this@MainActivity, KatalogActivity::class.java)
            startActivity(intent)
        }
    }



}

