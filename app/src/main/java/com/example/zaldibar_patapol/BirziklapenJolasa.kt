package com.example.zaldibar_patapol

import android.graphics.Rect
import android.os.Bundle
import android.view.DragEvent
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class BirziklapenJolasa : Fragment() {

    private var offsetX: Float = 0f
    private var offsetY: Float = 0f
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.birziklapen_jolasa, container, false)

        val platano: ImageView? = view?.findViewById(R.id.platano)
        val marron: ImageView? = view?.findViewById(R.id.marron)
        val carton: ImageView? = view?.findViewById(R.id.carton)
        val azul: ImageView? = view?.findViewById(R.id.azul)
        val amarillo: ImageView? = view?.findViewById(R.id.amarillo)

        carton?.setOnTouchListener { _, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    offsetX = event.x - carton.x
                    offsetY = event.y - carton.y
                }
                MotionEvent.ACTION_MOVE -> {
                    carton.x = event.x - offsetX
                    carton.y = event.y - offsetY
                }
                MotionEvent.ACTION_UP -> {
                    if (isViewOverlapping(carton, azul)) {
                        // La ImageView "carton" se soltó sobre "azul"
                        // Realiza las acciones necesarias aquí
                    } else if (isViewOverlapping(carton, amarillo)) {
                        // La ImageView "carton" se soltó sobre "amarillo"
                        // Realiza las acciones necesarias aquí
                    }
                }
            }
            true
        }


        return view
    }

    private fun isViewOverlapping(view1: View?, view2: View?): Boolean {
        if (view1 == null || view2 == null) return false

        val rect1 = Rect()
        view1.getHitRect(rect1)

        val rect2 = Rect()
        view2.getHitRect(rect2)

        return rect1.intersect(rect2)
    }
}