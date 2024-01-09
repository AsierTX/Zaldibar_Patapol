package com.example.zaldibar_patapol

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide

class ImageLoaderService(private val context: Context) {
    fun loadImage(imageUrl: String, imageView: ImageView) {
        Glide.with(context)
            .load(imageUrl)
            .into(imageView)
    }
}