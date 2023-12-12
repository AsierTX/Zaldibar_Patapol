package com.example.zaldibar_patapol

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var btnSalir: ImageButton

/**
 * A simple [Fragment] subclass.
 * Use the [inicio_fragment_juego1.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("UNREACHABLE_CODE")
class inicio_fragment_juego1 : Fragment() {
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
    interface OnFragmentInteractionListener : inicio_fragment_juego2.OnFragmentInteractionListener,
        inicio_fragment_juego3.OnFragmentInteractionListener,
        inicio_fragment_juego4.OnFragmentInteractionListener,
        inicio_fragment_juego5.OnFragmentInteractionListener,
        inicio_fragment_juego6.OnFragmentInteractionListener,
        inicio_fragment_juego7.OnFragmentInteractionListener {
        override fun onCerrarFragmento()
    }

    private var mListener: OnFragmentInteractionListener? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

    // Inflate the layout for this fragment
    val view = inflater.inflate(R.layout.fragment_inicio_juego1, container, false)

    val btnSalir = view.findViewById<ImageButton>(R.id.btnsalir)!!
    btnSalir.setOnClickListener {

        //llamamos a la funcion para enlazar el fragment con el activiy
        mListener?.onCerrarFragmento()

        // Cierra el fragmento
        requireActivity().supportFragmentManager.beginTransaction().remove(this).commit()

    }

        return view

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment inicio_fragment_juego1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            inicio_fragment_juego1().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    // Método para establecer el listener
    fun setOnFragmentInteractionListener(listener: OnFragmentInteractionListener) {
        mListener = listener
    }
}

