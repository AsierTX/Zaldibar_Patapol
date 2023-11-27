package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class navtemporal : AppCompatActivity() {
    private lateinit var birziklapen: Button
    private lateinit var mapa: Button
    private lateinit var button3: Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navtemporal)

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
        button3 = findViewById(R.id.button3)
        button3.setOnClickListener {
            val juego3 = Intent(this, HerriKirolak::class.java)
            startActivity(juego3)        }

    }
    private fun cargarmapa() {
        val intent = Intent(this, MapsActivity_full::class.java)
        startActivity(intent)
    }

}