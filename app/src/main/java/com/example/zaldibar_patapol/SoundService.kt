package com.example.zaldibar_patapol

import android.content.Context
import android.media.MediaPlayer

class SoundService(private val context: Context) {

    private var mediaPlayer: MediaPlayer? = null

    fun playCorrectSound() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.sonido_acierto)
        mediaPlayer?.start()
    }

    fun playIncorrectSound() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.sonido_fallo)
        mediaPlayer?.start()
    }

    fun playF1audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego1)
        mediaPlayer?.start()
    }
    fun playF2audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego2)
        mediaPlayer?.start()
    }
    fun playF3audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego3)
        mediaPlayer?.start()
    }
    fun playF4audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego4)
        mediaPlayer?.start()
    }
    fun playF5audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego5)
        mediaPlayer?.start()
    }
    fun playF6audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego6)
        mediaPlayer?.start()
    }
    fun playF7audio() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.audiojuego7)
        mediaPlayer?.start()
    }

    private fun stopMediaPlayer() {
        mediaPlayer?.let {
            if (it.isPlaying) {
                it.stop()
            }
            it.release()
        }
    }
}
