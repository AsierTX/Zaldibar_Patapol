package com.example.zaldibar_patapol

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var soundService: SoundService

/**
 * A simple [Fragment] subclass.
 * Use the [inicio_fragment_juego7.newInstance] factory method to
 * create an instance of this fragment.
 */
class inicio_fragment_juego7 : Fragment() {
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

    // Define la interfaz de comunicación entre el fragment
    interface OnFragmentInteractionListener {
        fun onCerrarFragmento()
    }

    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_inicio_juego7, container, false)

        val btnSalir = view.findViewById<ImageButton>(R.id.btnsalir)!!
        btnSalir.setOnClickListener {

            //llamamos a la funcion para enlazar el fragment con el activiy
            mListener?.onCerrarFragmento()

            // Cierra el fragmento
            requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()

        }
        val iniciaractivity = view.findViewById<Button>(R.id.iniciar_activity)
        iniciaractivity.setOnClickListener{

            soundService.stopMediaPlayer()

            mListener?.onCerrarFragmento()

            // Cierra el fragmento
            requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()

            abrirjuego7()
        }

        soundService = SoundService(requireContext().applicationContext)
        soundService.playF7audio()
        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment inicio_fragment_juego7.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            inicio_fragment_juego7().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun abrirjuego7() {
        val intent = Intent(activity, diferentziakjuego::class.java)
        startActivity(intent)
    }
    fun setOnFragmentInteractionListener(listener: inicio_fragment_juego1.OnFragmentInteractionListener) {
        mListener = listener
    }
}