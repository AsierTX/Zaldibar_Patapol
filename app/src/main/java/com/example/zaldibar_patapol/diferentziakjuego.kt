package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class diferentziakjuego : AppCompatActivity() {

    private lateinit var dif1: ImageButton
    private lateinit var dif2: ImageButton
    private lateinit var dif3: ImageButton
    private lateinit var dif4: ImageButton
    private lateinit var dif5: ImageButton
    private lateinit var dif6: ImageButton
    private lateinit var dif0: ImageButton
    private lateinit var dif11: ImageButton
    private lateinit var dif22: ImageButton
    private lateinit var dif33: ImageButton
    private lateinit var dif44: ImageButton
    private lateinit var dif55: ImageButton
    private lateinit var aurkituta: TextView
    private lateinit var num: TextView

    private lateinit var mediaplayer: MediaPlayer

    private var countaurkituta = 0



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diferentziakjuego)

        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        dif1 = findViewById(R.id.dif)
        dif2 = findViewById(R.id.dif1)
        dif3 = findViewById(R.id.dif2)
        dif4 = findViewById(R.id.dif3)
        dif5 = findViewById(R.id.dif4)
        dif6 = findViewById(R.id.dif5)

        dif0 = findViewById(R.id.dif0)
        dif11 = findViewById(R.id.dif11)
        dif22 = findViewById(R.id.dif22)
        dif33 = findViewById(R.id.dif33)
        dif44 = findViewById(R.id.dif44)
        dif55 = findViewById(R.id.dif55)

        mediaplayer = MediaPlayer.create(this, R.raw.aplausos)


        aurkituta = findViewById(R.id.textView6)
        num = findViewById(R.id.textView8)

        dif1.alpha=0f
        dif2.alpha=0f
        dif3.alpha=0f
        dif4.alpha=0f
        dif5.alpha=0f
        dif6.alpha=0f
        dif0.alpha=0f
        dif11.alpha=0f
        dif22.alpha=0f
        dif33.alpha=0f
        dif44.alpha=0f
        dif55.alpha=0f


        dif1.setOnClickListener {
            dif1.alpha = 1f
            dif0.alpha = 1f
            dif1.isClickable = false
            dif0.isClickable = false
            updateCount()
        }
        dif2.setOnClickListener{
            dif2.alpha = 1f
            dif11.alpha = 1f
            dif2.isClickable = false
            dif11.isClickable = false
            updateCount()
        }
        dif3.setOnClickListener{
            dif3.alpha = 1f
            dif22.alpha = 1f
            dif3.isClickable = false
            dif22.isClickable = false
            updateCount()
        }
        dif4.setOnClickListener{
            dif4.alpha = 1f
            dif33.alpha = 1f
            dif4.isClickable = false
            dif33.isClickable = false
            updateCount()
        }
        dif5.setOnClickListener{
            dif5.alpha = 1f
            dif44.alpha = 1f
            dif5.isClickable = false
            dif44.isClickable = false
            updateCount()
        }
        dif6.setOnClickListener{
            dif6.alpha = 1f
            dif55.alpha = 1f
            dif6.isClickable = false
            dif55.isClickable = false
            updateCount()
        }
        dif0.setOnClickListener {
            dif1.alpha = 1f
            dif0.alpha = 1f
            dif1.isClickable = false
            dif0.isClickable = false
            updateCount()
        }
        dif11.setOnClickListener{
            dif2.alpha = 1f
            dif11.alpha = 1f
            dif2.isClickable = false
            dif11.isClickable = false
            updateCount()
        }
        dif22.setOnClickListener{
            dif3.alpha = 1f
            dif22.alpha = 1f
            dif3.isClickable = false
            dif22.isClickable = false
            updateCount()
        }
        dif33.setOnClickListener{
            dif4.alpha = 1f
            dif33.alpha = 1f
            dif4.isClickable = false
            dif33.isClickable = false
            updateCount()
        }
        dif44.setOnClickListener{
            dif5.alpha = 1f
            dif44.alpha = 1f
            dif5.isClickable = false
            dif44.isClickable = false
            updateCount()
        }
        dif55.setOnClickListener{
            dif6.alpha = 1f
            dif55.alpha = 1f
            dif6.isClickable = false
            dif55.isClickable = false
            updateCount()
        }
        if (countaurkituta==6){
           mediaplayer.start()
            openGameResultFragment()
        }

    }
    private fun updateCount() {
        countaurkituta++
        aurkituta.text = "AURKITUTA: $countaurkituta"
        if (countaurkituta==6){
            mediaplayer.start()
            openGameResultFragment()
        }
    }
    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego7()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}