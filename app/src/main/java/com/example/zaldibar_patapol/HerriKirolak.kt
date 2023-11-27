package com.example.zaldibar_patapol

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.media.MediaPlayer
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HerriKirolak(private val context: Context) {

    private lateinit var imageView: ImageView
    private lateinit var buttons: List<Button>
    private lateinit var correctImageDrawable: BitmapDrawable
    private lateinit var incorrectImageDrawable: BitmapDrawable
    private lateinit var mediaPlayer: MediaPlayer

    private val imageList = mutableListOf(
        R.drawable.estroprobak,
        R.drawable.harrijasotze,
        R.drawable.segaproba,
        R.drawable.sokatira,
        R.drawable.aizkolaritza,
        R.drawable.astoprobak,
        R.drawable.eskupilota,
        R.drawable.txingak
    )

    private var currentImageIndex = -1

    fun initialize(view: View) {
        imageView = view.findViewById(R.id.imageView)
        buttons = listOf(
            view.findViewById(R.id.button1),
            view.findViewById(R.id.button2),
            view.findViewById(R.id.button3),
            view.findViewById(R.id.button4),
            view.findViewById(R.id.button5),
            view.findViewById(R.id.button6),
            view.findViewById(R.id.button7),
            view.findViewById(R.id.button8)
        )

        correctImageDrawable = context.resources.getDrawable(R.drawable.correcto, null) as BitmapDrawable
        incorrectImageDrawable = context.resources.getDrawable(R.drawable.incorrecto, null) as BitmapDrawable

        mediaPlayer = MediaPlayer.create(context, R.raw.sonido_aplausos)

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener { handleButtonClick(index) }
        }

        showRandomImage()
    }

    private fun showRandomImage() {
        val randomIndex = (0 until imageList.size).random()
        if (randomIndex != currentImageIndex) {
            currentImageIndex = randomIndex
            imageView.setImageResource(imageList[currentImageIndex])
        } else {
            showRandomImage()
        }
    }

    private fun handleButtonClick(buttonIndex: Int) {
        if (buttonIndex == currentImageIndex) {
            buttons[buttonIndex].background = correctImageDrawable
            mediaPlayer.start()
            showRandomImage()
        } else {
            buttons[buttonIndex].background = incorrectImageDrawable
            // Puedes agregar lógica para una respuesta incorrecta si lo necesitas
        }
    }

    fun releaseMediaPlayer() {
        mediaPlayer.release()
    }
}
