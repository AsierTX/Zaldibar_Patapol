package com.example.zaldibar_patapol

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity_full : AppCompatActivity(), OnMapReadyCallback {

    data class MarkerInfo(
        val name: String,
        val coordinates: LatLng,
        val onClickFunction: () -> Unit
    )


    val markerList = listOf(
        MarkerInfo("Marcador1", LatLng(43.169689, -2.546189), ::onMarker1Click,),
        MarkerInfo("Marcador2", LatLng(43.170217, -2.547697), ::onMarker2Click,),

        )




    private lateinit var map: GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_full)
        createFragment()
    }

    private fun createFragment() {
        val mapFragment: SupportMapFragment =
            supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap

        // Zoom en coordenadas específicas de zaldibar
        val location = LatLng(43.1709413,-2.5466649) // Nueva York, por ejemplo
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 16f))


        for (markerInfo in markerList) {
            val marker = googleMap.addMarker(
                MarkerOptions()
                    .position(markerInfo.coordinates)
                    .title(markerInfo.name)
            )

            // Asocia la funcion al tag del marcador
            if (marker != null) {
                marker.tag = markerInfo.onClickFunction

                }

            // Configura los marcadores para que llamen a su funcion especifica
            googleMap.setOnMarkerClickListener { clickedMarker ->
                // Recupera la funcion del tag y la mete en el marcador
                val onClickAction = clickedMarker.tag as? () -> Unit
                onClickAction?.invoke()
                true
            }
        }

    }

    private fun onMarker1Click() {
        Toast.makeText(this, "Clic en Marcador 1", Toast.LENGTH_SHORT).show()
        // Puedes agregar más acciones según tus necesidades
    }

    private fun onMarker2Click() {
        Toast.makeText(this, "Clic en Marcador 2", Toast.LENGTH_SHORT).show()
        // Puedes agregar más acciones según tus necesidades
    }
}