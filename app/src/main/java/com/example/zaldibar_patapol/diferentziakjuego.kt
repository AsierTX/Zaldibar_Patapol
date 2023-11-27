package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

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
            updateCount()
        }
        dif2.setOnClickListener{
            dif2.alpha = 1f
            dif11.alpha = 1f
            updateCount()
        }
        dif3.setOnClickListener{
            dif3.alpha = 1f
            dif22.alpha = 1f
            updateCount()
        }
        dif4.setOnClickListener{
            dif4.alpha = 1f
            dif33.alpha = 1f
            updateCount()
        }
        dif5.setOnClickListener{
            dif5.alpha = 1f
            dif44.alpha = 1f
            updateCount()
        }
        dif6.setOnClickListener{
            dif6.alpha = 1f
            dif55.alpha = 1f
            updateCount()
        }
        dif0.setOnClickListener {
            dif1.alpha = 1f
            dif0.alpha = 1f
            updateCount()
        }
        dif11.setOnClickListener{
            dif2.alpha = 1f
            dif11.alpha = 1f
            updateCount()
        }
        dif22.setOnClickListener{
            dif3.alpha = 1f
            dif22.alpha = 1f
            updateCount()
        }
        dif33.setOnClickListener{
            dif4.alpha = 1f
            dif33.alpha = 1f
            updateCount()
        }
        dif44.setOnClickListener{
            dif5.alpha = 1f
            dif44.alpha = 1f
            updateCount()
        }
        dif55.setOnClickListener{
            dif6.alpha = 1f
            dif55.alpha = 1f
            updateCount()
        }
        if (dif1.alpha==1f && dif2.alpha==1f && dif3.alpha==1f && dif4.alpha==1f && dif5.alpha==1f && dif6.alpha==1f){
           mediaplayer.start()
        }

    }
    private fun updateCount() {
        countaurkituta++
        aurkituta.text = "AURKITUTA: $countaurkituta"
    }
}