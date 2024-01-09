package com.example.zaldibar_patapol

import android.content.Context
import android.widget.ImageView

class ImageLoaderService(private val context: Context) {
    fun loadImage(imageResId: Int, imageViews: List<ImageView>, tag: String) {
        for (imageView in imageViews) {
            imageView.setImageResource(imageResId)
            imageView.tag = tag
        }
    }
}