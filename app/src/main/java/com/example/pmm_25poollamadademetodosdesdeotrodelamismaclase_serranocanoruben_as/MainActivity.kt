package com.example.pmm_25poollamadademetodosdesdeotrodelamismaclase_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber0 = findViewById<EditText>(R.id.etNumber10)
        val etNumber1 = findViewById<EditText>(R.id.etNumber11)
        val tvResult = findViewById<TextView>(R.id.tvResult10)

        val btnEnter = findViewById<Button>(R.id.btnEnter10)
        btnEnter.setOnClickListener {
            val userInteger0 = etNumber0.text.toString().toInt()
            val userInteger1 = etNumber1.text.toString().toInt()
            val operacion = Operaciones(userInteger0,userInteger1)
            val addition = operacion.sumar()
            val multiplication = operacion.producto()
            val message = "Suma: $addition, multiplicación: $multiplication"
            tvResult.text = message
        }
    }
}