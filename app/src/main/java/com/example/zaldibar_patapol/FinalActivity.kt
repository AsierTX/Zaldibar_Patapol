package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.room.Room
import io.socket.client.IO
import io.socket.client.Socket
import io.socket.emitter.Emitter
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.net.URISyntaxException

class FinalActivity : AppCompatActivity() {

    private lateinit var TV1: TextView
    private lateinit var TV2: TextView
    private lateinit var TV3: TextView
    private lateinit var socket: Socket
    private lateinit var nombrejugador: String
    private lateinit var mytimerservice: timerservice
    private lateinit var berrirohasi: Button
    private lateinit var atera: Button
    companion object{
        lateinit var database: appdatabase
            private set
    }


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        TV1 = findViewById(R.id.textView1)
        TV2 = findViewById(R.id.textView2)
        TV3 = findViewById(R.id.textView3)
        berrirohasi = findViewById(R.id.berrirohasi)
        atera = findViewById(R.id.atera)
        nombrejugador = intent.extras?.getString("nombrejugador") ?: ""

        mytimerservice = timerservice.getInstance()

        val tiempo = mytimerservice.stoptimer(this)
        val tiempoformateado = formatMillisToTime(tiempo)

        TV1.text = getString(R.string.Zorionak1) + nombrejugador
        TV2.text = getString(R.string.tiempo) + tiempoformateado

        berrirohasi.setOnClickListener{
            crearBDnueva()
            val intent = Intent(this, MapsActivity_full::class.java)
            startActivity(intent)
        }
        atera.setOnClickListener{
            finishAffinity()
        }
        // Ejecuta la tarea fuera del hilo principal
        Thread {
            SocketClientTask().execute()
        }.start()
    }

    inner class SocketClientTask : AsyncTask<Void, Void, Int>() {

        override fun doInBackground(vararg params: Void?): Int {
            try {
                // Reemplaza la URL con la URL de tu servidor en glitch.com
                val serverUrl = "https://erronka-zaldibar.glitch.me/"
                val options = IO.Options()
                options.forceNew = true
                socket = IO.socket(serverUrl, options)

                // Escucha el evento 'position'
                socket.on("position", onPosition)

                socket.connect()
            } catch (e: URISyntaxException) {
                e.printStackTrace()
            }
            return 0
        }

        private val onPosition = Emitter.Listener { args ->
            // Maneja la posición recibida del servidor
            val position = args[0] as Int
            runOnUiThread {
                TV3.text = "Mundu osoan $position. jokalaria zara jokoa amaitzen."
            }
        }

        override fun onPostExecute(result: Int) {
            // No necesitamos hacer nada aquí por ahora
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        socket.disconnect()
    }


    fun formatMillisToTime(millis: Long): String {
        val segundosTotales = millis / 1000
        val horas = segundosTotales / 3600
        val minutos = (segundosTotales % 3600) / 60
        val segundos = segundosTotales % 60

        return String.format("%02d:%02d:%02d", horas, minutos, segundos)
    }
    private fun crearBDnueva() {
        GlobalScope.launch(Dispatchers.IO) {
            database = Room.databaseBuilder(
                application,
                appdatabase::class.java,
                appdatabase.DATABASE_NAME
            )
                .allowMainThreadQueries()
                .build()
        }
            database.DBdao.removeletra()

            val juego1 = DBletrak(juego="juego1", ganado = false)
            val juego2 = DBletrak(juego="juego2", ganado = false)
            val juego3 = DBletrak(juego="juego3", ganado = false)
            val juego4 = DBletrak(juego="juego4", ganado = false)
            val juego5 = DBletrak(juego="juego5", ganado = false)
            val juego6 = DBletrak(juego="juego6", ganado = false)
            val juego7 = DBletrak(juego="juego7", ganado = false)

            try{
                secretword.database.DBdao.insertletra(juego1)
                secretword.database.DBdao.insertletra(juego2)
                secretword.database.DBdao.insertletra(juego3)
                secretword.database.DBdao.insertletra(juego4)
                secretword.database.DBdao.insertletra(juego5)
                secretword.database.DBdao.insertletra(juego6)
                secretword.database.DBdao.insertletra(juego7)
            } catch (e: Exception) {
                e.printStackTrace()
            }

    }
}

