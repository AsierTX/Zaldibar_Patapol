package com.example.zaldibar_patapol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.coroutines.*
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class BainuOspitalJokua : AppCompatActivity() {

    private lateinit var imageLoaderService: ImageLoaderService
    private val scope = CoroutineScope(Dispatchers.Main)
    private var lastClickedImageViews: Pair<ImageView?, ImageView?> = Pair(null, null)
    private lateinit var soundService: SoundService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bainuetxe_ospital_jokua)

        imageLoaderService = ImageLoaderService(this)

        // Cargar imágenes en ImageViews
        val imageViews: List<ImageView> = listOf(
            findViewById(R.id.IMG_1),
            findViewById(R.id.IMG_2),
            findViewById(R.id.IMG_3),
            findViewById(R.id.IMG_4),
            findViewById(R.id.IMG_5),
            findViewById(R.id.IMG_6),
            findViewById(R.id.IMG_7),
            findViewById(R.id.IMG_8),
            findViewById(R.id.IMG_9),
            findViewById(R.id.IMG_10)
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
            R.drawable.img_p5
        )

        for (i in imageResIds.indices) {
            val pairImageViews = shuffledImageViews.slice(i * 2 until i * 2 + 2)
            val tag = "Pair${i + 1}"
            imageLoaderService.loadImage(imageResIds[i], pairImageViews, tag)

            // Cambiar el color de la ImageView a negro con una animación
            scope.launch {
                delay(3000) // Retrasar 3 segundos
                val animation = AnimationUtils.loadAnimation(this@BainuOspitalJokua, R.anim.fade_out)
                pairImageViews.forEach { imageView ->
                    imageView.startAnimation(animation)
                    imageView.setColorFilter(resources.getColor(android.R.color.black))

                    // Establecer un OnClickListener para cada ImageView
                    imageView.setOnClickListener {
                        handleImageViewClick(imageView)
                    }
                }
            }
        }
        val exit = findViewById<ImageButton>(R.id.ibExit)
        exit.setOnClickListener() {
            val intent = Intent(this, MapsActivity_full::class.java)
            startActivity(intent)
        }
    }

    private fun handleImageViewClick(imageView: ImageView) {
        // Quitar el ColorFilter de la ImageView clicada
        imageView.clearColorFilter()
        soundService = SoundService(this)

        // Verificar si las dos últimas ImageViews clicadas tienen el mismo tag
        if (lastClickedImageViews.first != null && lastClickedImageViews.second == null) {
            lastClickedImageViews = Pair(lastClickedImageViews.first, imageView)
            if (lastClickedImageViews.first?.tag == lastClickedImageViews.second?.tag) {
                // Las dos ImageViews tienen el mismo tag, por lo que las dejamos sin el ColorFilter y las desactivamos
                lastClickedImageViews.first?.isClickable = false
                lastClickedImageViews.second?.isClickable = false
                lastClickedImageViews = Pair(null, null)

                // Reproducir el sonido de correcto
                soundService.playCorrectSound()
            } else {
                // Las dos ImageViews no tienen el mismo tag, por lo que volvemos a aplicar el ColorFilter después de un segundo
                scope.launch {
                    delay(1000) // Retrasar 1 segundo
                    lastClickedImageViews.first?.setColorFilter(resources.getColor(android.R.color.black))
                    lastClickedImageViews.second?.setColorFilter(resources.getColor(android.R.color.black))
                    lastClickedImageViews = Pair(null, null)
                }

                // Mostrar un Toast indicando que el par no es el mismo
                Toast.makeText(this, "El par no es el mismo", Toast.LENGTH_SHORT).show()

                // Reproducir el sonido de incorrecto
                soundService.playIncorrectSound()
            }
        } else if (lastClickedImageViews.first == null) {
            lastClickedImageViews = Pair(imageView, null)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel() // Cancelar todas las corutinas cuando la actividad se destruye
    }
}