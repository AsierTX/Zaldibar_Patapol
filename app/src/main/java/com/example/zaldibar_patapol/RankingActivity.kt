package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class RankingActivity : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ranking)

        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        listView = findViewById(R.id.listView)

        // Datos de ejemplo para la lista
        val top = arrayOf("Top 1", "Top 2", "Top 3", "Top 4", "Top 5")
        val nombre = arrayOf("Juan", "Asier", "Josu", "Jon", "Xabi")
        val tiempo =
            arrayOf("== 01:32:22", "== 01:37:22", "== 01:42:22", "== 01:46:22", "== 01:54:22")

        // Crear un ArrayList para almacenar los datos de cada fila
        val dataList = ArrayList<String>()

        // Combinar los datos en un solo array para la vista del listado
        for (i in top.indices) {
            dataList.add("${top[i]}   ${nombre[i]}   ${tiempo[i]}")
        }

        // Crear un ArrayAdapter personalizado para el ListView
        val adapter = ArrayAdapter(this, R.layout.custom_textview, dataList)

        // Establecer el adaptador en el ListView
        listView.adapter = adapter

    }
}