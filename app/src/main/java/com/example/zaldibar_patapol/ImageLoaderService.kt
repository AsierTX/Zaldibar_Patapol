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
                imageView.animate()
                    .rotationY(180f)
                    .setDuration(1000)
                    .withEndAction {
                        // Aquí puedes agregar el código para esconder la imagen detrás de otra imagen.
                        // Por ejemplo, podrías cambiar la imagen a una imagen de fondo.
                        imageView.setImageResource(R.drawable.background_image)
                    }
                    .start()
            }, 3000) // 3000 milisegundos = 3 segundos
        }
        }
    }
}