package com.example.zoo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class KatalogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_katalog)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this@KatalogActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
