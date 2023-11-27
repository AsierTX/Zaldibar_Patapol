package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class navtemporal : AppCompatActivity() {
    private lateinit var birziklapen: Button
    private lateinit var mapa: Button
    private lateinit var juegozaborra: Button
    private lateinit var juego7: Button


    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navtemporal)

        juegozaborra = findViewById(R.id.juego6)

        juegozaborra.setOnClickListener{
            val intentjuego = Intent(this, zaborrajuego::class.java)
            startActivity(intentjuego)
        }
        juego7 = findViewById(R.id.juego7)
        juego7.setOnClickListener{
            val intentjuego7 = Intent(this, diferentziakjuego::class.java)
            startActivity(intentjuego7)
        }
        birziklapen = findViewById(R.id.birziklapenjolasa)
            birziklapen.setOnClickListener {
                val fragment = ospitalpsikiatrikoa()
                val transaction = supportFragmentManager.beginTransaction()
                transaction.replace(R.id.fragmento, fragment)
                transaction.commit()
            }

        mapa = findViewById(R.id.button6)
        mapa.setOnClickListener{
            cargarmapa()
        }
    }
    private fun cargarmapa() {
        val intent = Intent(this, MapsActivity_full::class.java)
        startActivity(intent)
    }

}