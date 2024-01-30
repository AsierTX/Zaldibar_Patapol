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
    private lateinit var juego5: Button
    private lateinit var juego1: Button
    private lateinit var finaltext: Button
    private lateinit var jogo2: Button



    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navtemporal)


        finaltext = findViewById(R.id.finaltext)

        finaltext.setOnClickListener{
            val intentjuego = Intent(this, juegos_superados::class.java)
            startActivity(intentjuego)
        }

        jogo2 = findViewById(R.id.btn_jogo2)

        jogo2.setOnClickListener{
            val intentjuego = Intent(this, BainuOspitalJokua::class.java)
            startActivity(intentjuego)
        }

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

        juego5 = findViewById(R.id.juego5)
        juego5.setOnClickListener {
            val intent5 = Intent(this, puzzle::class.java)
            startActivity(intent5)
        }

        juego1 = findViewById(R.id.juego1)
        juego1.setOnClickListener {
            val intentJ1 = Intent(this, SanMartinJokua::class.java)
            startActivity(intentJ1)
        }

    }
    private fun cargarmapa() {
        val intent = Intent(this, MapsActivity_full::class.java)
        startActivity(intent)
    }

}