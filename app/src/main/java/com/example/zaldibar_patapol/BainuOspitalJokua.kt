package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        }

        // Cambiar el color de la ImageView a negro con una animación
        scope.launch {
            delay(3000) // Retrasar 3 segundos
            val animation = AnimationUtils.loadAnimation(this@BainuOspitalJokua, R.anim.fade_out)
            shuffledImageViews.forEach { imageView ->
                imageView.startAnimation(animation)
                imageView.setColorFilter(resources.getColor(android.R.color.black))

                // Establecer un OnClickListener para cada ImageView
                imageView.setOnClickListener {
                    handleImageViewClick(imageView)
                }
            }
        }
    }

    private fun handleImageViewClick(imageView: ImageView) {
        // Check if the clicked ImageView is already selected
        if (imageView == lastClickedImageView1 || imageView == lastClickedImageView2) {
            return  // Ignore the click if it's the same ImageView
        }

        // Quitar el ColorFilter de la ImageView clicada
        imageView.clearColorFilter()
        soundService = SoundService(this)

        // Verificar si las dos últimas ImageViews clicadas tienen el mismo tag
        if (lastClickedImageView1 != null && lastClickedImageView2 == null) {
            lastClickedImageView2 = imageView
            if (lastClickedImageView1?.tag == lastClickedImageView2?.tag) {
                // Las dos ImageViews tienen el mismo tag, por lo que las dejamos sin el ColorFilter y las desactivamos
                lastClickedImageView1?.isClickable = false
                lastClickedImageView2?.isClickable = false
                lastClickedImageView1 = null
                lastClickedImageView2 = null

                // Reproducir el sonido de correcto
                soundService.playCorrectSound()
            } else {
                // Las dos ImageViews no tienen el mismo tag, por lo que volvemos a aplicar el ColorFilter después de 0.05 segundos
                scope.launch {
                    delay(50) // Retrasar 0.05 segundos
                    lastClickedImageView1?.setColorFilter(resources.getColor(android.R.color.black))
                    lastClickedImageView2?.setColorFilter(resources.getColor(android.R.color.black))
                    lastClickedImageView1 = null
                    lastClickedImageView2 = null

                }

                // Mostrar un Toast indicando que el par no es el mismo
                Toast.makeText(this, "El par no es el mismo", Toast.LENGTH_SHORT).show()

                // Reproducir el sonido de incorrecto
                soundService.playIncorrectSound()
            }
        } else if (lastClickedImageView1 == null) {
            lastClickedImageView1 = imageView
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel() // Cancelar todas las corutinas cuando la actividad se destruye
    }
}