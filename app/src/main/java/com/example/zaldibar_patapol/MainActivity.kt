package com.example.zaldibar_patapol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.os.Handler

class MainActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private var progressStatus = 0
    private val handler = Handler()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)

        // Inicia la animación
        startProgressBarAnimation()
    }

    private fun startProgressBarAnimation() {
        Thread {
            while (progressStatus < 100) {
                progressStatus += 1
                handler.post {
                    progressBar.progress = progressStatus
                }
                try {
                    // Ajusta el tiempo de pausa para controlar la velocidad de la animación
                    Thread.sleep(50)
                } catch (e: InterruptedException) {
                    e.printStackTrace()
                }
            }
            runOnUiThread {
                cargarinicio()
            }
        }.start()
    }

    private fun cargarinicio() {
        val intent = Intent(this, navtemporal::class.java)
        startActivity(intent)
    }

}