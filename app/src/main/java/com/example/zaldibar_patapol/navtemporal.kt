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
    private lateinit var juego4: Button
    private lateinit var juego3: Button



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

        juego4 = findViewById(R.id.juego4)
        juego4.setOnClickListener{
            val intentjuego4 = Intent(this, laberintojuego::class.java)
            startActivity(intentjuego4)
        }

        mapa = findViewById(R.id.button6)
        mapa.setOnClickListener{
            cargarmapa()
        }
        juego3 = findViewById(R.id.button3)
        juego3.setOnClickListener {
            val intent = Intent(this, HerriKirolak::class.java)
            startActivity(intent)
        }

        button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Puzzle::class.java)
            startActivity(intent)
        }

    }
    private fun cargarmapa() {
        val intent = Intent(this, MapsActivity_full::class.java)
        startActivity(intent)
    }

}