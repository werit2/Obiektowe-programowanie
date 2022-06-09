package com.example.zoo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mapka: ImageView = findViewById(R.id.mapka)
        val wybiegA: ImageView = findViewById(R.id.ramkaa)
        val wybiegB: ImageView = findViewById(R.id.ramkab)
        val wybiegC: ImageView = findViewById(R.id.ramkac)
        val wybiegD: ImageView = findViewById(R.id.ramkad)
        val wybiegE: ImageView = findViewById(R.id.ramkae)
        val wybiegF: ImageView = findViewById(R.id.ramkaf)
        val wybiegG: ImageView = findViewById(R.id.ramkag)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this@MainActivity, KatalogActivity::class.java)
            startActivity(intent)
        }

        mapka.setOnClickListener {
            wybiegA.visibility = View.INVISIBLE
            wybiegB.visibility = View.INVISIBLE
            wybiegC.visibility = View.INVISIBLE
            wybiegD.visibility = View.INVISIBLE
            wybiegE.visibility = View.INVISIBLE
            wybiegF.visibility = View.INVISIBLE
            wybiegG.visibility = View.INVISIBLE
        }
    }

    fun znajdzZwierze(wybieg: Char) {

        val wybiegA: ImageView = findViewById(R.id.ramkaa)
        val wybiegB: ImageView = findViewById(R.id.ramkab)
        val wybiegC: ImageView = findViewById(R.id.ramkac)
        val wybiegD: ImageView = findViewById(R.id.ramkad)
        val wybiegE: ImageView = findViewById(R.id.ramkae)
        val wybiegF: ImageView = findViewById(R.id.ramkaf)
        val wybiegG: ImageView = findViewById(R.id.ramkag)

        when (wybieg) {
            'A' -> wybiegA.visibility = View.VISIBLE
            'B' -> wybiegB.visibility = View.VISIBLE
            'C' -> wybiegC.visibility = View.VISIBLE
            'D' -> wybiegD.visibility = View.VISIBLE
            'E' -> wybiegE.visibility = View.VISIBLE
            'F' -> wybiegF.visibility = View.VISIBLE
            'G' -> wybiegG.visibility = View.VISIBLE
        }
    }
}