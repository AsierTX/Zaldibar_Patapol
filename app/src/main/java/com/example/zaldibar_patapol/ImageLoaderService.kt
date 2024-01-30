package com.example.zaldibar_patapol

import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.ImageView

class ImageLoaderService(private val context: Context) {
    fun loadImage(imageResId: Int, imageViews: List<ImageView>, tag: String) {
        for (imageView in imageViews) {
            imageView.setImageResource(imageResId)
            imageView.tag = tag


            // Espera 3 segundos antes de iniciar la animación
            Handler(Looper.getMainLooper()).postDelayed({
                // Aplicar un filtro de color azul
                imageView.setColorFilter(context.resources.getColor(android.R.color.holo_blue_light))
                imageView.animate()
                    .rotationY(180f)
                    .setDuration(1000)
                    .start()
            }, 3000) // 3000 milisegundos = 3 segundos
        }
    }
}