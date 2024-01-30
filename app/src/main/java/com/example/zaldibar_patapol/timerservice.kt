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
        }
    }

    fun stoptimer(context: Context?): Long {
        var tiempoTranscurrido: Long = 0

        if (isRunning) {
            isRunning = false
            tiempoTranscurrido = SystemClock.elapsedRealtime() - startTime
        }

        return tiempoTranscurrido
    }



}
