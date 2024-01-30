package com.example.zaldibar_patapol

import android.app.AlertDialog
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class zaborrajuego : AppCompatActivity() {

    private lateinit var marroia: ImageView
    private lateinit var marroia2: ImageView
    private lateinit var marroia3: ImageView
    private lateinit var urdina: ImageView
    private lateinit var urdina2: ImageView
    private lateinit var urdina3: ImageView
    private lateinit var horia: ImageView
    private lateinit var horia2: ImageView
    private lateinit var horia3: ImageView
    private lateinit var amarillo: ImageView
    private lateinit var marron: ImageView
    private lateinit var azul: ImageView
    private lateinit var mediaplayer: MediaPlayer
    private lateinit var mediaplayer2: MediaPlayer
    var pulsado: Boolean = false

    companion object{
        lateinit var database: appdatabase
            private set
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zaborrajuego)

        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        database = Room.databaseBuilder(
            application,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()

        marroia = findViewById(R.id.marroia)
        marroia2 = findViewById(R.id.marroia2)
        marroia3 = findViewById(R.id.marroia3)
        horia = findViewById(R.id.horia)
        horia2 = findViewById(R.id.horia2)
        horia3 = findViewById(R.id.horia3)
        urdina = findViewById(R.id.urdina)
        urdina2 = findViewById(R.id.urdina2)
        urdina3 = findViewById(R.id.urdina3)
        marron = findViewById(R.id.marron)
        azul = findViewById(R.id.azul)
        amarillo = findViewById(R.id.amarillo)

        mediaplayer = MediaPlayer.create(this, R.raw.error)
        mediaplayer2 = MediaPlayer.create(this, R.raw.aplausos)


        marroia.setOnClickListener{
            if (marroia.alpha==0f){
                marroia.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                marroia.alpha=0f
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        marroia2.setOnClickListener{
            if (marroia2.alpha==0f){
                marroia2.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                marroia2.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        marroia3.setOnClickListener{
            if (marroia3.alpha==0f){
                marroia3.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                marroia3.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        horia.setOnClickListener{
            if (horia.alpha==0f){
                horia.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                horia.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
        }
        horia2.setOnClickListener{
            if (horia2.alpha==0f){
                horia2.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                horia2.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
        }
        horia3.setOnClickListener{
            if (horia3.alpha==0f){
                horia3.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()
            }
            azul.setOnClickListener{
                mediaplayer.start()
            }
            amarillo.setOnClickListener{
                horia3.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
        }
        urdina.setOnClickListener{
            if (urdina.alpha==0f){
                urdina.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()

            }
            azul.setOnClickListener{
                urdina.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        urdina2.setOnClickListener{
            if (urdina2.alpha==0f){
                urdina2.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 1f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 0.2f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()
            }
            azul.setOnClickListener{
                urdina2.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina3.alpha!=0f) {
                    urdina3.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        urdina3.setOnClickListener{
            if (urdina3.alpha==0f){
                urdina3.isClickable = false
            }else {
                if (marroia.alpha != 0f) {
                    marroia.alpha = 0.2f
                }
                if (marroia2.alpha != 0f) {
                    marroia2.alpha = 0.2f
                }
                if (marroia3.alpha != 0f) {
                    marroia3.alpha = 0.2f
                }
                if (horia.alpha != 0f) {
                    horia.alpha = 0.2f
                }
                if (horia2.alpha != 0f) {
                    horia2.alpha = 0.2f
                }
                if (horia3.alpha != 0f) {
                    horia3.alpha = 0.2f
                }
                if (urdina.alpha != 0f) {
                    urdina.alpha = 0.2f
                }
                if (urdina2.alpha != 0f) {
                    urdina2.alpha = 0.2f
                }
                if (urdina3.alpha != 0f) {
                    urdina3.alpha = 1f
                }
            }
            pulsado = true
            marron.setOnClickListener{
                mediaplayer.start()
            }
            azul.setOnClickListener{
                urdina3.alpha=0f
                if (marroia.alpha!=0f) {
                    marroia.alpha = 1f
                }
                if (marroia2.alpha!=0f) {
                    marroia2.alpha = 1f
                }
                if (marroia3.alpha!=0f) {
                    marroia3.alpha = 1f
                }
                if (horia.alpha!=0f) {
                    horia.alpha = 1f
                }
                if (horia2.alpha!=0f) {
                    horia2.alpha = 1f
                }
                if (horia3.alpha!=0f) {
                    horia3.alpha = 1f
                }
                if (urdina.alpha!=0f) {
                    urdina.alpha = 1f
                }
                if (urdina2.alpha!=0f) {
                    urdina2.alpha = 1f
                }
                if (marroia.alpha==0f && marroia2.alpha==0f && marroia3.alpha==0f && horia.alpha==0f && horia2.alpha==0f && horia3.alpha==0f && urdina.alpha==0f && urdina2.alpha==0f && urdina3.alpha==0f){
                    mediaplayer2.start()
                    GlobalScope.launch(Dispatchers.IO) {
                        database.DBdao.juego6pasado()
                    }
                    openGameResultFragment()
                }
            }
            amarillo.setOnClickListener{
                mediaplayer.start()
            }
        }
        marron.setOnClickListener{
            if (pulsado==false){
                dialog()
            }
        }
        amarillo.setOnClickListener{
            if (pulsado==false){
                dialog()
            }
        }
        azul.setOnClickListener{
            if (pulsado==false){
                dialog()
            }
        }

    }
    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego6()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
    private fun dialog() {
        val builder = AlertDialog.Builder(this)

        builder.setTitle(getString(R.string.error))
            .setMessage(getString(R.string.zaborrahartu))
            .setPositiveButton(getString(R.string.jarraitu)) { dialog, which ->
            }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}