package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.coroutines.*
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class BainuOspitalJokua : AppCompatActivity() {

    private lateinit var imageLoaderService: ImageLoaderService
    private val scope = CoroutineScope(Dispatchers.Main)
    private var lastClickedImageView1: ImageView? = null
    private var lastClickedImageView2: ImageView? = null
    private lateinit var soundService: SoundService
    private lateinit var imageViews: List<ImageView>
    private var foundPairsCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bainu_ospital_jokua)

        imageLoaderService = ImageLoaderService(this)

        // Cargar imágenes en ImageViews
        imageViews = listOf(
            findViewById(R.id.IMG_1),
            findViewById(R.id.IMG_2),
            findViewById(R.id.IMG_3),
            findViewById(R.id.IMG_4),
            findViewById(R.id.IMG_5),
            findViewById(R.id.IMG_6),
            findViewById(R.id.IMG_7),
            findViewById(R.id.IMG_8),
            findViewById(R.id.IMG_9),
            findViewById(R.id.IMG_10),
            findViewById(R.id.IMG_11),
            findViewById(R.id.IMG_12),
            findViewById(R.id.IMG_13),
            findViewById(R.id.IMG_14)
        )

        // Set a fixed size for the ImageViews
        val imageSize = resources.getDimensionPixelSize(R.dimen.image_size)
        for (imageView in imageViews) {
            imageView.layoutParams.width = imageSize
            imageView.layoutParams.height = imageSize
        }

        // Mezclar la lista de ImageViews
        val shuffledImageViews = imageViews.shuffled()

        // Asignar imágenes a pares de ImageViews de manera aleatoria
        val imageResIds = listOf(
            R.drawable.img_p1,
            R.drawable.img_p2,
            R.drawable.img_p3,
            R.drawable.img_p4,
            R.drawable.img_p5,
            R.drawable.img_p6,
            R.drawable.img_p7
        )

        for (i in imageResIds.indices) {
            val pairImageViews = shuffledImageViews.slice(i * 2 until i * 2 + 2)
            val tag = "Pair${i + 1}"
            imageLoaderService.loadImage(imageResIds[i], pairImageViews, tag)
        }

        for (imageView in imageViews) {
            imageView.setOnClickListener {
                handleImageViewClick(it as ImageView)
            }
        }
    }

    private fun handleImageViewClick(imageView: ImageView) {
        imageView.animate()
            .rotationY(0f)
            .setDuration(1000)
            .start()

        // Deshabilitar el ImageView después de que se ha hecho clic en él
        imageView.isClickable = false

        // Guardar los dos últimos ImageViews clicados
        if (lastClickedImageView1 == null) {
            lastClickedImageView1 = imageView
        } else if (lastClickedImageView2 == null) {
            lastClickedImageView2 = imageView

            // Deshabilitar todos los ImageViews
            for (iv in imageViews) {
                iv.isClickable = false
            }

            // Comparar los tags de los dos ImageViews
            if (lastClickedImageView1?.tag == lastClickedImageView2?.tag) {
                // Los ImageViews tienen el mismo tag
                Toast.makeText(this, "¡Coincidencia!", Toast.LENGTH_SHORT).show()
                soundService.playCorrectSound()

                // Incrementar el recuento de pares encontrados
                foundPairsCount++

                // Si se han encontrado todos los pares, reproducir el sonido de aplausos
                if (foundPairsCount == 7) {
                    soundService.playAplausosSound()
                }

            } else {
                // Los ImageViews tienen diferentes tags
                Toast.makeText(this, "No coinciden", Toast.LENGTH_SHORT).show()
                soundService.playIncorrectSound()
            }

// Habilitar todos los ImageViews después de medio segundo
            Handler(Looper.getMainLooper()).postDelayed({
                for (iv in imageViews) {
                    iv.isClickable = true
                }

                // Revertir la animación y habilitar los ImageViews
                if (lastClickedImageView1?.tag != lastClickedImageView2?.tag) {
                    lastClickedImageView1?.animate()?.rotationY(180f)?.setDuration(1000)?.start()
                    lastClickedImageView2?.animate()?.rotationY(180f)?.setDuration(1000)?.start()
                    lastClickedImageView1?.isClickable = true
                    lastClickedImageView2?.isClickable = true
                }
            }, 500) // 500 milisegundos = medio segundo
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel() // Cancelar todas las corutinas cuando la actividad se destruye
    }
}