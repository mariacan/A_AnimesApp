package com.example.animesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class personaruto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_personaruto)

        val bregresar= findViewById<Button>(R.id.regresar1)
        bregresar.setOnClickListener {
            finish()
        }

        val bNaruto= findViewById<Button>(R.id.descripcionNaruto)
        bNaruto.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
        val bKakashi= findViewById<Button>(R.id.descripcionSasuke)
        bKakashi.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
        val bSakura= findViewById<Button>(R.id.descripcionSasuke)
        bSakura.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
        val bHinata= findViewById<Button>(R.id.descripcionSasuke)
        bHinata.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
        val bNeji= findViewById<Button>(R.id.descripcionSasuke)
        bNeji.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
        val bSasuke= findViewById<Button>(R.id.descripcionSasuke)
        bSasuke.setOnClickListener {
            var intent = Intent(this, psasuke::class.java)
            startActivity(intent)
        }
    }
}