package com.example.zaldibar_patapol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BainuOspitalJokua : AppCompatActivity() {

    private lateinit var imageLoaderService: ImageLoaderService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bainuetxe_ospital_jokua)

        imageLoaderService = ImageLoaderService(this)

        // Load images into ImageViews
        val imageView1: ImageView = findViewById(R.id.IMG_1)
        val imageView2: ImageView = findViewById(R.id.IMG_2)
        val imageView3: ImageView = findViewById(R.id.IMG_3)
        val imageView4: ImageView = findViewById(R.id.IMG_4)
        val imageView5: ImageView = findViewById(R.id.IMG_5)
        val imageView6: ImageView = findViewById(R.id.IMG_6)
        val imageView7: ImageView = findViewById(R.id.IMG_7)
        val imageView8: ImageView = findViewById(R.id.IMG_8)
        val imageView9: ImageView = findViewById(R.id.IMG_9)
        val imageView10: ImageView = findViewById(R.id.IMG_10)


        val imageUrl1 = "https://example.com/image1.jpg"
        val imageUrl2 = "https://example.com/image2.jpg"
        val imageUrl3 = "https://example.com/image3.jpg"
        val imageUrl4 = "https://example.com/image4.jpg"
        val imageUrl5 = "https://example.com/image5.jpg"

        imageLoaderService.loadImage(imageUrl1, imageView1)
        imageLoaderService.loadImage(imageUrl2, imageView2)
        imageLoaderService.loadImage(imageUrl3, imageView3)
        imageLoaderService.loadImage(imageUrl4, imageView4)
        imageLoaderService.loadImage(imageUrl5, imageView5)
        imageLoaderService.loadImage(imageUrl1, imageView6)
        imageLoaderService.loadImage(imageUrl2, imageView7)
        imageLoaderService.loadImage(imageUrl3, imageView8)
        imageLoaderService.loadImage(imageUrl4, imageView9)
        imageLoaderService.loadImage(imageUrl5, imageView10)

    }
}
