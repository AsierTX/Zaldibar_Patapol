package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.coroutines.*

class BainuOspitalJokua : AppCompatActivity() {

    private lateinit var imageLoaderService: ImageLoaderService
    private val scope = CoroutineScope(Dispatchers.Main)

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

                    // Imprimir el tag y el identificador de la ImageView en la terminal
                    println("El ImageView con el ID ${imageView.id} tiene el tag: $tag")
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        scope.cancel() // Cancelar todas las corutinas cuando la actividad se destruye
    }
}