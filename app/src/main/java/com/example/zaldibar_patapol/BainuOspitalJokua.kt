package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BainuOspitalJokua : AppCompatActivity() {

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
        imageLoaderService.loadImage(imageResIds[i], shuffledImageViews.slice(i*2 until i*2+2), "Pair${i+1}")
    }
}