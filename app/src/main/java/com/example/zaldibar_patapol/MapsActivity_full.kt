package com.example.zaldibar_patapol

import android.Manifest
import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class MapsActivity_full : AppCompatActivity(), OnMapReadyCallback {


    //Objeto que usamos para definir todos los datos de la array
    data class MarkerInfo(
        val name: String,
        val coordinates: LatLng,
        val onClickFunction: () -> Unit
    )
    //Array con las ubicaciones de los juegos
    val markerList = listOf(
        MarkerInfo("San Martin Ermita", LatLng(43.169689, -2.546189), ::onMarker1Click,),
        MarkerInfo("Bainuetxe-Ospital psikiatrikoa", LatLng(43.170217, -2.547697), ::onMarker2Click,),
        MarkerInfo("Zaldibarko Pilotalekuak", LatLng(43.169050, -2.547347), ::onMarker3Click,),
        MarkerInfo("Zaldibarko Dorrea", LatLng(43.168658, -2.547214), ::onMarker4Click,),
        MarkerInfo("Santamañeko istripua", LatLng(43.168128, -2.545681), ::onMarker5Click,),
        MarkerInfo("Zabortegia", LatLng(43.171058, -2.545683), ::onMarker6Click,),
        MarkerInfo("Jaietako txopoa ", LatLng(43.170783, -2.545906), ::onMarker7Click,),
        )




    private lateinit var map: GoogleMap

    companion object{
        const val REQUEST_CODE_LOCATION = 0
    }

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

    //Comprueba si el permiso esta dado o no
    private fun isLocationPermissionGranted() = ContextCompat.checkSelfPermission(
        this,
        Manifest.permission.ACCESS_FINE_LOCATION
    ) == PackageManager.PERMISSION_GRANTED

    @SuppressLint("MissingPermission")
    private fun enableLocation(){
        if(!::map.isInitialized)return
        if(isLocationPermissionGranted()){

            map.isMyLocationEnabled = true
        }else{
            requestLocationPermission()
        }
    }

    private fun requestLocationPermission(){
        if(ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.ACCESS_FINE_LOCATION)) {
            Toast.makeText(this, "Acepta los permisos", Toast.LENGTH_SHORT).show()
        }else{
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),REQUEST_CODE_LOCATION)
        }
    }

    @SuppressLint("MissingPermission")
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when(requestCode){
            REQUEST_CODE_LOCATION -> if(grantResults.isNotEmpty() && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                map.isMyLocationEnabled=true
            }else{
                Toast.makeText(this, "Ve a ajustes a aceptar los permisos", Toast.LENGTH_SHORT).show()
            }else ->{}
        }
    }



    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        enableLocation()

        // Zoom en coordenadas específicas de zaldibar
        val location = LatLng(43.1709413,-2.5466649) // coordenadas de Zaldibar
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

    }

    private fun onMarker2Click() {
        Toast.makeText(this, "Clic en Marcador 2", Toast.LENGTH_SHORT).show()

    }

    private fun onMarker3Click() {
        Toast.makeText(this, "Clic en Marcador 3", Toast.LENGTH_SHORT).show()

    }
    private fun onMarker4Click() {
        Toast.makeText(this, "Clic en Marcador 4", Toast.LENGTH_SHORT).show()

    }
    private fun onMarker5Click() {
        Toast.makeText(this, "Clic en Marcador 5", Toast.LENGTH_SHORT).show()

    }
    private fun onMarker6Click() {
        Toast.makeText(this, "Clic en Marcador 6", Toast.LENGTH_SHORT).show()

    }
    private fun onMarker7Click() {
        Toast.makeText(this, "Clic en Marcador 7", Toast.LENGTH_SHORT).show()

    }



}