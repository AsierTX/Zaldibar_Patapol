package com.example.zaldibar_patapol

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class puzzle : AppCompatActivity() {

    private lateinit var im1:ImageButton
    private lateinit var im2:ImageButton
    private lateinit var im3:ImageButton
    private lateinit var im4:ImageButton
    private lateinit var im5:ImageButton
    private lateinit var im6:ImageButton
    private lateinit var im7:ImageButton
    private lateinit var im8:ImageButton
    private lateinit var im9:ImageButton
    private lateinit var im10:ImageButton
    private lateinit var im11:ImageButton
    private lateinit var im12:ImageButton
    private lateinit var im13:ImageButton
    private lateinit var im14:ImageButton
    private lateinit var im15:ImageButton
    private lateinit var im16:ImageButton
    private lateinit var c1: ImageButton
    private lateinit var c2:ImageButton
    private lateinit var c3:ImageButton
    private lateinit var c4:ImageButton
    private lateinit var c5:ImageButton
    private lateinit var c6:ImageButton
    private lateinit var c7:ImageButton
    private lateinit var c8:ImageButton
    private lateinit var c9:ImageButton
    private lateinit var c10:ImageButton
    private lateinit var c11:ImageButton
    private lateinit var c12:ImageButton
    private lateinit var c13:ImageButton
    private lateinit var c14:ImageButton
    private lateinit var c15:ImageButton
    private lateinit var c16:ImageButton
    private lateinit var mediaPlayercorrecto: MediaPlayer
    private lateinit var mediaPlayererror: MediaPlayer
    private lateinit var mediaPlayeraplausos: MediaPlayer


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puzzle)

        im1 = findViewById(R.id.im1)
        im2 = findViewById(R.id.im2)
        im3 = findViewById(R.id.im3)
        im4 = findViewById(R.id.im4)
        im5 = findViewById(R.id.im5)
        im6 = findViewById(R.id.im6)
        im7 = findViewById(R.id.im7)
        im8 = findViewById(R.id.im8)
        im9 = findViewById(R.id.im9)
        im10 = findViewById(R.id.im10)
        im11= findViewById(R.id.im11)
        im12= findViewById(R.id.im12)
        im13= findViewById(R.id.im13)
        im14= findViewById(R.id.im14)
        im15= findViewById(R.id.im15)
        im16= findViewById(R.id.im16)

        c1 = findViewById(R.id.c1)
        c2 = findViewById(R.id.c2)
        c3 = findViewById(R.id.c3)
        c4 = findViewById(R.id.c4)
        c5 = findViewById(R.id.c5)
        c6 = findViewById(R.id.c6)
        c7 = findViewById(R.id.c7)
        c8 = findViewById(R.id.c8)
        c9 = findViewById(R.id.c9)
        c10 = findViewById(R.id.c10)
        c11= findViewById(R.id.c11)
        c12= findViewById(R.id.c12)
        c13= findViewById(R.id.c13)
        c14= findViewById(R.id.c14)
        c15= findViewById(R.id.c15)
        c16= findViewById(R.id.c16)

        mediaPlayercorrecto = MediaPlayer.create(this, R.raw.sonido_acierto)
        mediaPlayererror = MediaPlayer.create(this, R.raw.sonido_fallo)
        mediaPlayeraplausos = MediaPlayer.create(this, R.raw.sonido_aplausos)

        im1.setOnClickListener{
            if (im1.alpha==0f){
               im1.isClickable = false
            }
            else{
                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 0.3f
                }
            }

            c1.setOnClickListener {
                c1.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 0f

                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }








        }
        im2.setOnClickListener{
            if (im2.alpha==0f){
                im2.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                c2.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 0f

                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im3.setOnClickListener{
            if (im3.alpha==0f){
                im3.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                c3.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 0f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im4.setOnClickListener{
            if (im4.alpha==0f){
                im4.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                c4.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 0f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im5.setOnClickListener{
            if (im5.alpha==0f){
                im5.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                c5.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 0f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im6.setOnClickListener{
            if (im6.alpha==0f){
                im6.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                c6.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 0f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im7.setOnClickListener{
            if (im7.alpha==0f){
                im7.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                c7.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 0f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im8.setOnClickListener{
            if (im8.alpha==0f){
                im8.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
                c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                    mediaPlayererror.start()

                }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                c8.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 0f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im9.setOnClickListener{
            if (im9.alpha==0f){
                im9.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                c9.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 0f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im10.setOnClickListener{
            if (im10.alpha==0f){
                im10.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                c10.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 0f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im11.setOnClickListener{
            if (im11.alpha==0f){
                im11.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                c11.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 0f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im12.setOnClickListener{
            if (im12.alpha==0f){
                im12.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                c12.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 0f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }

        }
        im13.setOnClickListener{
            if (im13.alpha==0f){
                im13.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                c13.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 0f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im14.setOnClickListener{
            if (im14.alpha==0f){
                im14.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                c14.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 0f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c16.setOnClickListener {
                (Toast.makeText(this, "Gilipollas", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }

        }
        im15.setOnClickListener{
            if (im15.alpha==0f){
                im15.isClickable = false
            }
            else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0.3f
                }
            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()


            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()

            }
            c15.setOnClickListener {
                c15.alpha=0f
                mediaPlayercorrecto.start()

                if (im1.alpha!=0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha!=0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha!=0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha!=0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha!=0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha!=0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha!=0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha!=0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha!=0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha!=0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha!=0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha!=0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha!=0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha!=0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha!=0f) {
                    im15.alpha = 0f
                }
                if (im16.alpha!=0f) {
                    im16.alpha = 1f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
            c16.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
            }

        }
        im16.setOnClickListener {
            if (im16.alpha == 0f) {
                im16.isClickable = false
            } else {
                if (im1.alpha != 0f) {
                    im1.alpha = 0.3f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 0.3f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 0.3f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 0.3f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 0.3f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 0.3f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 0.3f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 0.3f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 0.3f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 0.3f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 0.3f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 0.3f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 0.3f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 0.3f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 0.3f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 1f
                }

            }
            c1.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c2.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c3.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c4.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c5.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c6.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c7.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c8.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c9.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c10.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c11.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c12.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c13.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c14.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c15.setOnClickListener {
                (Toast.makeText(this, "EZ", Toast.LENGTH_SHORT).show())
                mediaPlayererror.start()
            }
            c16.setOnClickListener {
                c16.alpha = 0f
                mediaPlayercorrecto.start()

                if (im1.alpha != 0f) {
                    im1.alpha = 1f
                }
                if (im2.alpha != 0f) {
                    im2.alpha = 1f
                }
                if (im3.alpha != 0f) {
                    im3.alpha = 1f
                }
                if (im4.alpha != 0f) {
                    im4.alpha = 1f
                }
                if (im5.alpha != 0f) {
                    im5.alpha = 1f
                }
                if (im6.alpha != 0f) {
                    im6.alpha = 1f
                }
                if (im7.alpha != 0f) {
                    im7.alpha = 1f
                }
                if (im8.alpha != 0f) {
                    im8.alpha = 1f
                }
                if (im9.alpha != 0f) {
                    im9.alpha = 1f
                }
                if (im10.alpha != 0f) {
                    im10.alpha = 1f
                }
                if (im11.alpha != 0f) {
                    im11.alpha = 1f
                }
                if (im12.alpha != 0f) {
                    im12.alpha = 1f
                }
                if (im13.alpha != 0f) {
                    im13.alpha = 1f
                }
                if (im14.alpha != 0f) {
                    im14.alpha = 1f
                }
                if (im15.alpha != 0f) {
                    im15.alpha = 1f
                }
                if (im16.alpha != 0f) {
                    im16.alpha = 0f
                }
                if (c1.alpha==0f && c2.alpha==0f && c3.alpha==0f && c4.alpha==0f && c5.alpha==0f && c6.alpha==0f && c7.alpha==0f && c8.alpha==0f && c9.alpha==0f && c10.alpha==0f && c11.alpha==0f && c12.alpha==0f && c13.alpha==0f && c14.alpha==0f && c15.alpha==0f && c16.alpha==0f){
                    mediaPlayeraplausos.start()
                    openGameResultFragment()
                }
            }
        }

    }
    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego5()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}