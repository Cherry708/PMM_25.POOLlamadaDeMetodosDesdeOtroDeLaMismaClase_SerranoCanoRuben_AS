package com.example.pmm_25poollamadademetodosdesdeotrodelamismaclase_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ProblemaPropuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto1)

        val tvResult = findViewById<TextView>(R.id.tvResult20)

        val hijos = Hijos()
        hijos.cargar()
        val message = "Mayores de edad ${hijos.mayorDeEdad()}, edad promedio: ${hijos.promedio()}"
        tvResult.text = message
    }
}