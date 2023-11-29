package com.example.zaldibar_patapol

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class SanMartin_ermita : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var imageViews: List<ImageView>
    private lateinit var mediaPlayerAcierto: MediaPlayer
    private lateinit var mediaPlayerFallo: MediaPlayer
    private lateinit var mediaPlayerAplausos: MediaPlayer

    private var isPlayingAudio = false

    private val images = mutableListOf(
      R.drawable.aizkolaritza
    )

    private val texts = listOf("Atea", "Beiratea", "Teilatua", "Kanpaiak", "Gurutzea", "Bankuak", "Altarea", "Ama Birjina")

    private val shownImageViews = mutableListOf<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_san_martin_ermita)

        textView = findViewById(R.id.hitza_eliza)
        imageViews = listOf(
            findViewById(R.id.imageView4),
            findViewById(R.id.imageView6),
            findViewById(R.id.imageView7),
            findViewById(R.id.imageView10),
            findViewById(R.id.imageView11),
            findViewById(R.id.imageView12),
            findViewById(R.id.imageView13),
            findViewById(R.id.imageView14),
        )

        mediaPlayerAcierto = MediaPlayer.create(this, R.raw.sonido_acierto)
        mediaPlayerFallo = MediaPlayer.create(this, R.raw.sonido_fallo)
        mediaPlayerAplausos = MediaPlayer.create(this, R.raw.sonido_aplausos)

        imageViews.forEachIndexed { index, imageView ->
            imageView.setOnClickListener(object : View.OnClickListener {
                override fun onClick(v: View) {
                    handleImageViewClick(index, imageView)
                }
            })
        }

        fun handleImageViewClick(index: Int, imageView: ImageView) {
            // Tu código para manejar el clic del ImageView
        }

        showRandomString()
    }

    private fun showRandomString() {
        if (shownImageViews.size == texts.size) {
            mediaPlayerAplausos.start()
        } else {
            var randomIndex: Int
            do {
                randomIndex = (0 until texts.size).random()
            } while (shownImageViews.contains(randomIndex))

            shownImageViews.add(randomIndex)
            textView.text = texts[randomIndex]

            imageViews.forEach {it.isClickable = true}
        }
    }

    private fun handleImageViewClick(imageViewIndex: Int, imageView: ImageView) {
        if (shownImageViews.contains(imageViewIndex)) {
            mediaPlayerAcierto.start()
            imageViews[imageViewIndex].isClickable = false
            showRandomString()
        } else {
            mediaPlayerFallo.start()
            imageViews[imageViewIndex].isClickable = false

            // Restaura la opacidad del botón después de 1 segundo
            imageViews[imageViewIndex].postDelayed({
                imageViews[imageViewIndex].isClickable = true
            }, 1000)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayerAcierto.release()
        mediaPlayerFallo.release()
        mediaPlayerAplausos.release()
    }
}