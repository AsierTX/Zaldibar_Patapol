package com.example.zaldibar_patapol

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.os.SystemClock
import android.widget.Toast

class timerservice : Service() {

    companion object {
        private var instance: timerservice? = null

        fun getInstance(): timerservice {
            if (instance == null) {
                instance = timerservice()
            }
            return instance!!
        }
    }

    private var isRunning = false
    private var startTime: Long = 0
    private val binder = LocalBinder()

    inner class LocalBinder : Binder() {
        fun getService(): timerservice = this@timerservice
    }

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    fun starttimer(context: Context) {
        if (!isRunning) {
            startTime = SystemClock.elapsedRealtime()
            isRunning = true
            Toast.makeText(context, "Empieza el tiempo", Toast.LENGTH_SHORT).show()
        }
    }

    fun stoptimer(context: Context?) {
        if (isRunning) {
            isRunning = false
            val tiempoTranscurrido = SystemClock.elapsedRealtime() - startTime
            mostrarTiempoEnToast(context, tiempoTranscurrido)
        }
    }

    private fun mostrarTiempoEnToast(context: Context?, tiempo: Long) {
        context?.let {
            val segundos = tiempo / 1000
            val milisegundos = tiempo % 1000
            val mensaje = "Tiempo transcurrido: $segundos segundos $milisegundos milisegundos"
            Toast.makeText(it.applicationContext, mensaje, Toast.LENGTH_SHORT).show()
        }
    }
}
