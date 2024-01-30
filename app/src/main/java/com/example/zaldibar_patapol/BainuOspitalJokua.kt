package com.example.zaldibar_patapol

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.room.Room
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

class BainuOspitalJokua : AppCompatActivity() {

    private lateinit var imageLoaderService: ImageLoaderService
    private val scope = CoroutineScope(Dispatchers.Main)
    private var lastClickedImageView1: ImageView? = null
    private var lastClickedImageView2: ImageView? = null
    private lateinit var soundService: SoundService
    private lateinit var imageViews: List<ImageView>
    private var foundPairsCount = 0
    private val clickedImageViews = mutableListOf<ImageView>()
    private val unclickedImageViews = mutableListOf<ImageView>()

    companion object{
        lateinit var database: appdatabase
            private set
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bainu_ospital_jokua)

        imageLoaderService = ImageLoaderService(this)
        soundService = SoundService(this)

        database = Room.databaseBuilder(
            application,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()
        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

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

        unclickedImageViews.addAll(imageViews)

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
        // Verificar si el ImageView ya ha sido clicado
        val isAlreadyClicked = clickedImageViews.contains(imageView)

        if (!isAlreadyClicked) {
            imageView.animate()
                .rotationY(0f)
                .setDuration(1000)
                .start()

            // Deshabilitar el ImageView después de que se ha hecho clic en él
            imageView.isClickable = false

            // Quitar el filtro de color azul de la imagen clicada
            imageView.setColorFilter(null)

            // Mover el ImageView de la lista de ImageViews no clicados a la lista de ImageViews clicados
            unclickedImageViews.remove(imageView)
            clickedImageViews.add(imageView)
        }

        // Verificar si se han seleccionado dos imágenes
        if (lastClickedImageView1 != null && lastClickedImageView2 != null) {
            return  // Salir de la función si ya se han seleccionado dos imágenes
        }

        // Guardar los dos últimos ImageViews clicados
        if (lastClickedImageView1 == null) {
            lastClickedImageView1 = imageView
        } else if (lastClickedImageView2 == null && lastClickedImageView1 != imageView) {
            lastClickedImageView2 = imageView

            // Comparar los tags de los dos ImageViews
            if (lastClickedImageView1?.tag == lastClickedImageView2?.tag) {
                // Los ImageViews tienen el mismo tag
                soundService.playCorrectSound()

                // Incrementar el recuento de pares encontrados
                foundPairsCount++

                // Si se han encontrado todos los pares, reproducir el sonido de aplausos
                if (foundPairsCount == 7) {
                    soundService.playAplausosSound()
                    openGameResultFragment()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego2pasado()
                    }

                    // Ocultar y deshabilitar todos los ImageViews
                    for (iv in imageViews) {
                        iv.visibility = View.INVISIBLE
                        iv.isClickable = false
                    }
                }
            } else {
                // Los ImageViews tienen diferentes tags
                soundService.playIncorrectSound()

                // Aplicar filtro de color azul nuevamente a las imágenes que no coinciden
                Handler(Looper.getMainLooper()).postDelayed({
                    lastClickedImageView1?.setColorFilter(ContextCompat.getColor(this, android.R.color.holo_blue_light))
                    lastClickedImageView2?.setColorFilter(ContextCompat.getColor(this, android.R.color.holo_blue_light))
                    lastClickedImageView1?.animate()?.rotationY(180f)?.setDuration(1000)?.start()
                    lastClickedImageView2?.animate()?.rotationY(180f)?.setDuration(1000)?.start()

                    // Habilitar los ImageViews que no coinciden
                    lastClickedImageView1?.isClickable = true
                    lastClickedImageView2?.isClickable = true

                    // Devolver los ImageViews a la lista de no clicados
                    clickedImageViews.remove(lastClickedImageView1)
                    clickedImageViews.remove(lastClickedImageView2)
                    unclickedImageViews.add(lastClickedImageView1!!)
                    unclickedImageViews.add(lastClickedImageView2!!)
                }, 500) // 500 milisegundos = medio segundo
            }

            // Habilitar todos los ImageViews después de medio segundo
            Handler(Looper.getMainLooper()).postDelayed({
                for (iv in unclickedImageViews) {
                    iv.isClickable = true
                }
                // Limpiar las variables que almacenan las últimas imágenes clicadas
                lastClickedImageView1 = null
                lastClickedImageView2 = null
            }, 500) // 500 milisegundos = medio segundo
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        scope.cancel() // Cancelar todas las corutinas cuando la actividad se destruye
    }

    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego2()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}