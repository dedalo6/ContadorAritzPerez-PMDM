package com.example.contadorestilos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var contador = 0
        val botonSumar: Button = findViewById(R.id.btnSuma)
        val botonRestar: Button = findViewById(R.id.btnResta)
        val botonReset: Button = findViewById(R.id.btnReset)
        val textViewNumero : TextView = findViewById(R.id.textViewNumero)

        botonSumar.setOnClickListener {
            contador++
            textViewNumero.text = contador.toString()
        }

        botonRestar.setOnClickListener {
            contador = maxOf(contador - 1, 0)
//            contador = if (contador > 0) contador - 1 else 0
            textViewNumero.text = contador.toString()
        }
        botonReset.setOnClickListener {
            contador = 0
            textViewNumero.text = contador.toString()
        }
    }
}