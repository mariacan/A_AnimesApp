package com.example.animesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class psasuke : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_psasuke)

        val bRegresar1= findViewById<Button>(R.id.regresar1)
        bRegresar1.setOnClickListener {
            finish()
        }
    }
}