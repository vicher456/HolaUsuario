package com.example.holausuario

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
/* Aquí, importo varias librerías que me hacen falta para hacer el nuevo botón */

class SaludoActivity : AppCompatActivity() {
    private lateinit var txtSaludo: TextView
    private lateinit var btnVolver: Button
    /* Aquí, creo las 2 variables, que son los 2 botones */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        // Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.txtSaludo)
        btnVolver = findViewById(R.id.btnVolver) // Hago lo mismo que hice con el anterior botón

        // Recuperamos la información pasada en el intent
        val saludo = intent.getStringExtra("NOMBRE")

        // Construimos el mensaje a mostrar
        txtSaludo.text = "Hola $saludo"

        // Configuramos el evento clic para el botón Volver
        btnVolver.setOnClickListener {
            // Creamos el Intent para volver a la actividad principal
            val cambioActivity = Intent(this@SaludoActivity, MainActivity::class.java)
            // Iniciamos la actividad principal
            startActivity(cambioActivity)
            // Cerramos la actividad actual
            finish()
        }
    }
}