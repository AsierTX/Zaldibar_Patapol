package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [secretword.newInstance] factory method to
 * create an instance of this fragment.
 */
class secretword : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId", "SuspiciousIndentation")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        database = Room.databaseBuilder(
            requireContext().applicationContext,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()


        val view = inflater.inflate(R.layout.fragment_secretword, container, false)

        val textE = view.findViewById<TextView>(R.id.textE)
        val textL = view.findViewById<TextView>(R.id.textL)
        val textI = view.findViewById<TextView>(R.id.textI)
        val textZ = view.findViewById<TextView>(R.id.textZ)
        val textA = view.findViewById<TextView>(R.id.textA)
        val textT = view.findViewById<TextView>(R.id.textT)
        val textEE = view.findViewById<TextView>(R.id.textEE)

        GlobalScope.launch(Dispatchers.IO) {
            if (database.DBdao.juegoganado("juego1") == true) {
                textZ.text = getString(R.string.Z)
            }
            if (database.DBdao.juegoganado("juego2") == true) {
                textL.text = getString(R.string.L)
            }
            if (database.DBdao.juegoganado("juego3") == true) {
                textA.text = getString(R.string.A)
            }
            if (database.DBdao.juegoganado("juego4") == true) {
                textEE.text = getString(R.string.E2)
            }
            if (database.DBdao.juegoganado("juego5") == true) {
                textI.text = getString(R.string.I)
            }
            if (database.DBdao.juegoganado("juego6") == true) {
                textE.text = getString(R.string.E)
            }
            if (database.DBdao.juegoganado("juego7") == true) {
                textT.text = getString(R.string.T)
            }
        }

        val btnsalir = view.findViewById<ImageButton>(R.id.btnsalir2)!!

        btnsalir.setOnClickListener{
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.beginTransaction().remove(this@secretword).commit()
        }
        val hitza = view.findViewById<EditText>(R.id.pasahitza)

        val berriz = view.findViewById<Button>(R.id.berriz)

        berriz.setOnClickListener{
            val builder = AlertDialog.Builder(context)
            builder.setTitle("KONTUZ!")
            builder.setMessage("Berriro hasi nahi duzu Zaldibarreko ibiblbidea?")

            builder.setPositiveButton("Bai") { dialog, which ->
                GlobalScope.launch(Dispatchers.IO) {
                    database.DBdao.removeletra()

                    val juego1 = DBletrak(juego="juego1", ganado = false)
                    val juego2 = DBletrak(juego="juego2", ganado = false)
                    val juego3 = DBletrak(juego="juego3", ganado = false)
                    val juego4 = DBletrak(juego="juego4", ganado = false)
                    val juego5 = DBletrak(juego="juego5", ganado = false)
                    val juego6 = DBletrak(juego="juego6", ganado = false)
                    val juego7 = DBletrak(juego="juego7", ganado = false)

                        try{
                            database.DBdao.insertletra(juego1)
                            database.DBdao.insertletra(juego2)
                            database.DBdao.insertletra(juego3)
                            database.DBdao.insertletra(juego4)
                            database.DBdao.insertletra(juego5)
                            database.DBdao.insertletra(juego6)
                            database.DBdao.insertletra(juego7)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    textE.text = getString(R.string.X)
                    textL.text = getString(R.string.X)
                    textI.text = getString(R.string.X)
                    textZ.text = getString(R.string.X)
                    textA.text = getString(R.string.X)
                    textT.text = getString(R.string.X)
                    textEE.text = getString(R.string.X)
                    }
                recargarActividad()
            }

            builder.setNegativeButton("Ez") { dialog, which ->
            }
            val dialog = builder.create()
            dialog.show()
        }
        val btnkonprobatu = view.findViewById<Button>(R.id.konprobatu)!!
        btnkonprobatu.setOnClickListener {
            val textoIngresado = hitza.text.toString().toLowerCase()
            if (hitza.text.toString() != "") {
                if (textoIngresado == "elizate") {
                    hitza.setBackgroundResource(R.drawable.fondoverde)
                    Handler().postDelayed({
                        hitza.setBackgroundResource(R.drawable.bordestext)
                    }, 3000)
                    requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()


                    // Abrir el fragment "savegame"
                    val savegameFragment = savegame_fragment()
                    requireActivity().supportFragmentManager.beginTransaction()
                        .replace(R.id.fragmento, savegameFragment)
                        .addToBackStack(null)
                        .commit()
                } else {
                    hitza.setBackgroundResource(R.drawable.fondorojo)
                    Handler().postDelayed({
                        hitza.setBackgroundResource(R.drawable.bordestext)
                    }, 3000)
                }

            }else{
                dialog()
            }
        }

        return view
    }

    companion object {
        lateinit var database: appdatabase
            private set
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment secretword.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            secretword().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun dialog() {
        val builder = AlertDialog.Builder(context)

        builder.setTitle("ERROR")
            .setMessage("Idatzi zerbait!")
            .setPositiveButton("Jarraitu") { dialog, which ->
            }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    fun setOnFragmentInteractionListener(mapsactivityFull: MapsActivity_full) {
        TODO("Not yet implemented")
    }
    private fun recargarActividad() {
        if (activity != null) {
            requireActivity().recreate()
        }
    }
}