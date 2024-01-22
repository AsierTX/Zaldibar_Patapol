package com.example.zaldibar_patapol

import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.location.Location
import android.net.Uri
import android.os.AsyncTask
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.room.Room
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationCallback
import com.google.android.gms.location.LocationRequest
import com.google.android.gms.location.LocationResult
import com.google.android.gms.location.LocationServices
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MapsActivity_full : AppCompatActivity(), OnMapReadyCallback,inicio_fragment_juego1.OnFragmentInteractionListener, inicio_fragment_juego2.OnFragmentInteractionListener, inicio_fragment_juego3.OnFragmentInteractionListener, inicio_fragment_juego4.OnFragmentInteractionListener, inicio_fragment_juego5.OnFragmentInteractionListener, inicio_fragment_juego6.OnFragmentInteractionListener, inicio_fragment_juego7.OnFragmentInteractionListener {




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
    private lateinit var botonMochila: ImageButton
    private var fragmentoVisible = false

    private lateinit var fusedLocationProviderClient: FusedLocationProviderClient
    private var myCurrentLocation: LatLng = LatLng(43.169689, -2.546189)
    private lateinit var selectedMarkerLocation: LatLng
    private val radiusInMeters = 30

    private lateinit var locationCallback: LocationCallback
    private val locationRequest: LocationRequest = LocationRequest.create()
        .setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY)
        .setInterval(5000)
        .setFastestInterval(1000)

    companion object{
        lateinit var database: appdatabase
            private set
        const val REQUEST_CODE_LOCATION = 0

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps_full)

        // Inicializar FusedLocationProviderClient
        fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(this)

        // Inicializar locationCallback
        locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                for (location in locationResult.locations) {
                    myCurrentLocation = LatLng(location.latitude, location.longitude)
                }
            }
        }

        // Solicitar actualizaciones de ubicación
        if (isLocationPermissionGranted()) {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return
            }
            fusedLocationProviderClient.requestLocationUpdates(locationRequest, locationCallback, null)
        } else {
            requestLocationPermission()
        }

        createFragment()
        crearBD()

        botonMochila = findViewById(R.id.imagebutton)
        try {
            val fragment = navegador_superior()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragmento2, fragment)
            transaction.commit()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        // Solicitar permisos de ubicación
        if (!isLocationPermissionGranted()) {
            requestLocationPermission()
        }

        botonMochila.setOnClickListener {
            try {
                val fragment = secretword()

                val transaction = supportFragmentManager.beginTransaction()

                // Verificar si el fragmento ya está agregado
                val existingFragment = supportFragmentManager.findFragmentById(R.id.fragmento)

                if (existingFragment != null) {
                    // Si el fragmento está presente, lo quitamos
                    transaction.remove(existingFragment)
                    fragmentoVisible = false
                } else {
                    // Si el fragmento no está presente, lo agregamos
                    transaction.replace(R.id.fragmento, fragment)
                    fragmentoVisible = true
                }

                transaction.commit()

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

    }

    override fun onCerrarFragmento() {
        // Llama a la función de la actividad
        encendermapa()
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
        val location = LatLng(43.169689,-2.546189) // coordenadas de Zaldibar
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(location, 17f))

        // Ajusta este valor según tus necesidades (0.5f significa la mitad del tamaño original)
        val scaleFactor = 0.2f

        for (markerInfo in markerList) {

            // Escala la imagen antes de establecerla como icono del marcador
            val originalBitmap = BitmapFactory.decodeResource(resources, R.drawable.escudo_solo)
            val originalWidth = originalBitmap.width
            val originalHeight = originalBitmap.height

            val scaledBitmap = Bitmap.createScaledBitmap(
                originalBitmap,
                (originalWidth * scaleFactor).toInt(),
                (originalHeight * scaleFactor).toInt(),
                false
            )


            val marker = googleMap.addMarker(
                MarkerOptions()
                    .position(markerInfo.coordinates)
                    .title(markerInfo.name)
                    .icon(BitmapDescriptorFactory.fromBitmap(scaledBitmap))

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

    private fun openGoogleMapsWithDirections(context: Context, selectedMarkerLocation:LatLng) {

        //desglosamos la variable en dos para usar el el url
        val destinationLat = selectedMarkerLocation.latitude
        val destinationLon = selectedMarkerLocation.longitude

        val gmmIntentUri = Uri.parse("google.navigation:q=$destinationLat,$destinationLon&mode=w")

        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")

        if (mapIntent.resolveActivity(context.packageManager) != null) {
            context.startActivity(mapIntent)
        }
    }

    private fun getCurrentLocation() {
        if (isLocationPermissionGranted()) {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                    this,
                    Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return
            }
            fusedLocationProviderClient.lastLocation
                .addOnSuccessListener { location ->
                    if (location != null) {
                        myCurrentLocation = LatLng(location.latitude, location.longitude)
                    }
                }
        } else {
            requestLocationPermission()
        }
    }



    private fun calculateDistance(location1: LatLng, location2: LatLng): Float {
        // Lógica para calcular la distancia entre dos ubicaciones (puedes usar Location.distanceBetween)

        val result = FloatArray(1)
        Location.distanceBetween(
            location1.latitude, location1.longitude,
            location2.latitude, location2.longitude, result
        )
        return result[0]
    }


    private fun apagarmapa() {

        map.uiSettings.isScrollGesturesEnabled = false
        map.uiSettings.isZoomGesturesEnabled = false
        map.uiSettings.isRotateGesturesEnabled = false
        map.uiSettings.isTiltGesturesEnabled = false
        map.uiSettings.isMapToolbarEnabled = false
        map.uiSettings.isZoomControlsEnabled = false


    }


    private fun encendermapa() {

        map.uiSettings.isScrollGesturesEnabled = true
        map.uiSettings.isZoomGesturesEnabled = true
        map.uiSettings.isRotateGesturesEnabled = true
        map.uiSettings.isTiltGesturesEnabled = true
        map.uiSettings.isMapToolbarEnabled = true
        map.uiSettings.isZoomControlsEnabled = true

    }

    private fun onMarker1Click() {


        // Realizar la consulta a la base de datos en un hilo secundario
        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado==true) {
                    val fragment = inicio_fragment_juego1()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    // Almacenar la ubicación del marcador seleccionado (en este caso, el marcador 1)
                    selectedMarkerLocation = LatLng(43.169689, -2.546189) // Coordenadas del marcador 1

                    // Obtener la ubicación actual
                    getCurrentLocation()

                    // Calcular la distancia entre la ubicación actual y la del marcador
                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    // Verificar si la distancia es menor o igual al radio
                    if (distance <= radiusInMeters) {
                        // Si estás dentro del radio, ejecutar la función específica
                        apagarmapa()
                        val fragment = inicio_fragment_juego2()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()
                    } else {
                        // Abrir el mapa
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }

    private fun onMarker2Click() {


        // Realizar la consulta a la base de datos en un hilo secundario
        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado==true) {
                    val fragment = inicio_fragment_juego2()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    // Almacenar la ubicación del marcador seleccionado (en este caso, el marcador 2)
                    selectedMarkerLocation = LatLng(43.170217, -2.547697)

                    // Obtener la ubicación actual
                    getCurrentLocation()

                    // Calcular la distancia entre la ubicación actual y la del marcador
                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    // Verificar si la distancia es menor o igual al radio
                    if (distance <= radiusInMeters) {
                        // Si estás dentro del radio, ejecutar la función específica
                        apagarmapa()
                        val fragment = inicio_fragment_juego2()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()
                    } else {
                        // Abrir el mapa
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }

    private fun onMarker3Click() {


        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado == true) {
                    val fragment = inicio_fragment_juego3()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    selectedMarkerLocation = LatLng(43.169050, -2.547347)

                    getCurrentLocation()

                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    if (distance <= radiusInMeters) {
                        apagarmapa()
                        val fragment = inicio_fragment_juego3()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()

                    } else {
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }
    private fun onMarker4Click() {


        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado == true) {
                    val fragment = inicio_fragment_juego4()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    selectedMarkerLocation = LatLng(43.168658, -2.547214)

                    getCurrentLocation()

                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    if (distance <= radiusInMeters) {
                        apagarmapa()
                        val fragment = inicio_fragment_juego4()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()

                    } else {
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }
    private fun onMarker5Click() {

        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado == true) {
                    val fragment = inicio_fragment_juego5()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    selectedMarkerLocation = LatLng(43.168128, -2.545681)

                    getCurrentLocation()

                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    if (distance <= radiusInMeters) {
                        apagarmapa()
                        val fragment = inicio_fragment_juego5()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()

                    } else {
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }
    private fun onMarker6Click() {


        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado == true) {
                    val fragment = inicio_fragment_juego6()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    selectedMarkerLocation = LatLng(43.171058, -2.545683)

                    getCurrentLocation()

                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    if (distance <= radiusInMeters) {
                        apagarmapa()
                        val fragment = inicio_fragment_juego6()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()

                    } else {
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }
    private fun onMarker7Click() {


        AsyncTask.execute {
            val activado = database.DBdao.selectactivado()

            runOnUiThread {
                if (activado == true) {
                    val fragment = inicio_fragment_juego7()
                    fragment.setOnFragmentInteractionListener(this)
                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.replace(R.id.fragmento, fragment)
                    transaction.commit()
                } else {
                    selectedMarkerLocation = LatLng(43.170783, -2.545906)

                    getCurrentLocation()

                    val distance = calculateDistance(myCurrentLocation, selectedMarkerLocation)
                    if (distance <= radiusInMeters) {
                        apagarmapa()
                        val fragment = inicio_fragment_juego7()
                        fragment.setOnFragmentInteractionListener(this)
                        val transaction = supportFragmentManager.beginTransaction()
                        transaction.replace(R.id.fragmento, fragment)
                        transaction.commit()

                    } else {
                        openGoogleMapsWithDirections(this, selectedMarkerLocation)
                    }
                }
            }
        }
    }

    private fun crearBD() {
        GlobalScope.launch(Dispatchers.IO) {
            database = Room.databaseBuilder(
                application,
                appdatabase::class.java,
                appdatabase.DATABASE_NAME
            )
                .allowMainThreadQueries()
                .build()
        }
        val juego1 = DBletrak(juego = "juego1", ganado = false)
        val juego2 = DBletrak(juego = "juego2", ganado = false)
        val juego3 = DBletrak(juego = "juego3", ganado = false)
        val juego4 = DBletrak(juego = "juego4", ganado = false)
        val juego5 = DBletrak(juego = "juego5", ganado = false)
        val juego6 = DBletrak(juego = "juego6", ganado = false)
        val juego7 = DBletrak(juego = "juego7", ganado = false)
        val admin = DBadmin(activado = false)
        GlobalScope.launch(Dispatchers.IO) {
            try {
                if (database.DBdao.countletrak() == 0) {
                    database.DBdao.insertletra(juego1)
                    database.DBdao.insertletra(juego2)
                    database.DBdao.insertletra(juego3)
                    database.DBdao.insertletra(juego4)
                    database.DBdao.insertletra(juego5)
                    database.DBdao.insertletra(juego6)
                    database.DBdao.insertletra(juego7)
                    database.DBdao.insertadmin(admin)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        // Detener las actualizaciones de ubicación
        fusedLocationProviderClient.removeLocationUpdates(locationCallback)
    }

}