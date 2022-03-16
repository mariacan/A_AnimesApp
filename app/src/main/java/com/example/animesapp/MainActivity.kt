package com.example.animesapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /* bIngresar.setOnclickListener {
            val showSigned = signIn(edtUsuario.text.toString(), edtContraseña.text.toString())
            if (showSigned) {
                Toast.makeText(this, "Acceder", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
    private fun  signIn(edtUsuario: String, edtContraseña: String): Boolean{
        return edtUsuario.isNotEmpty() && edtContraseña.isNotEmpty()
    }*/
    }
}