package com.example.animesapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nombreanimes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nombreanimes)

        val bregresar= findViewById<Button>(R.id.regresar1)
        bregresar.setOnClickListener {
            finish()
        }

        val bPnaruto= findViewById<Button>(R.id.obrasf)
        bPnaruto.setOnClickListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
        val bPdemon= findViewById<Button>(R.id.obrasp)
        bPdemon.setOnClickListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
        val bPboku= findViewById<Button>(R.id.obrasl)
        bPboku.setOnClickListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
        val bPtokyo= findViewById<Button>(R.id.obrasv)
        bPtokyo.setOnClickListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
        val bPdragonb= findViewById<Button>(R.id.obrasd)
        bPdragonb.setOnClickListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
        val bPone= findViewById<Button>(R.id.obrasfco)
        bPone kListener {
            var intent = Intent(this, personaruto::class.java)
            startActivity(intent)
        }
    }
}