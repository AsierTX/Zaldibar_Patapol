package com.example.zaldibar_patapol

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class HerriKirolak : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var buttons: List<Button>
    private lateinit var mediaPlayerAcierto: MediaPlayer
    private lateinit var mediaPlayerFallo: MediaPlayer
    private lateinit var mediaPlayerAplausos: MediaPlayer

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

    private val shownImages = mutableListOf<Int>() // Lista para rastrear las imágenes mostradas

    private var isPlayingAudio = false // Control del estado de reproducción del audio de aplausos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_herri_kirolak)

        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        imageView = findViewById(R.id.imageView)
        buttons = listOf(
            findViewById(R.id.button1),
            findViewById(R.id.button2),
            findViewById(R.id.button3),
            findViewById(R.id.button4),
            findViewById(R.id.button5),
            findViewById(R.id.button6),
            findViewById(R.id.button7),
            findViewById(R.id.button8)
        )

        mediaPlayerAcierto = MediaPlayer.create(this, R.raw.sonido_acierto)
        mediaPlayerFallo = MediaPlayer.create(this, R.raw.sonido_fallo)
        mediaPlayerAplausos = MediaPlayer.create(this, R.raw.sonido_aplausos)

        buttons.forEachIndexed { index, button ->
            button.setOnClickListener { handleButtonClick(index, button) }
        }

        showRandomImage()
    }

    private fun showRandomImage() {
        if (shownImages.size == imageList.size) {
            mediaPlayerAplausos.start()

            openGameResultFragment()
            // Aquí puedes realizar las acciones finales del juego, ya que todas las imágenes se han mostrado
        } else {
            var randomIndex: Int
            do {
                randomIndex = (0 until imageList.size).random()
            } while (shownImages.contains(randomIndex))

            shownImages.add(randomIndex)
            imageView.setImageResource(imageList[randomIndex])

            // Habilitar botones para interacción nuevamente
            buttons.forEach { it.isClickable = true }
        }
    }

    private fun handleButtonClick(buttonIndex: Int, button: Button) {
        if (shownImages.contains(buttonIndex)) {
            mediaPlayerAcierto.start()
            button.alpha = 0.5f // Reduce la opacidad del botón al acertar
            button.isClickable = false // Deshabilita el botón al acertar
            showRandomImage()
        } else {
            mediaPlayerFallo.start()
            button.alpha = 0.5f // Reduce la opacidad del botón al fallar
            button.isClickable = false // Deshabilita el botón al fallar

            // Restaura la opacidad del botón después de 1 segundo
            button.postDelayed({
                button.alpha = 1.0f // Restaura la opacidad del botón
                button.isClickable = true
            }, 1000)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayerAcierto.release()
        mediaPlayerFallo.release()
        mediaPlayerAplausos.release()
    }

    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego3()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}
