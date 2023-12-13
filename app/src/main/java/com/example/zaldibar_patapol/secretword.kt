package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

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

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_secretword, container, false)

        val hitza = view.findViewById<EditText>(R.id.editTextText2)

        val btnkonprobatu = view.findViewById<Button>(R.id.konprobatu)!!
        btnkonprobatu.setOnClickListener {
            val textoIngresado = hitza.text.toString().toLowerCase()
            if (hitza.text.toString() != "") {
                if (textoIngresado == "elizate") {
                    hitza.setBackgroundResource(R.drawable.fondoverde)
                    Handler().postDelayed({
                        hitza.setBackgroundResource(R.drawable.bordestext)
                    }, 3000)
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
}