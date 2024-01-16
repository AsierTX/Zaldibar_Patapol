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

    fun playAplausosSound() {
        stopMediaPlayer()
        mediaPlayer = MediaPlayer.create(context, R.raw.sonido_aplausos)
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
