package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.os.AsyncTask
import io.socket.client.IO
import io.socket.client.Socket
import io.socket.emitter.Emitter
import java.net.URISyntaxException

class juegos_superados : AppCompatActivity() {

private lateinit var socket: Socket
private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_juegos_superados)


textViewResult = findViewById(R.id.serverreturn)

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
            textViewResult.text = "Zorionak! Mundu osoan $position. jokalaria zara, jokoa amaitu duzula."
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
}