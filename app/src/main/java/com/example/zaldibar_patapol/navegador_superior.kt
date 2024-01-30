package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.constraintlayout.widget.ConstraintLayout
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
 * Use the [navegador_superior.newInstance] factory method to
 * create an instance of this fragment.
 */
class navegador_superior : Fragment() {
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
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_navegador_superior, container, false)

        // Cargar imágenes en los ImageButtons
        val imageButton3: ImageButton = view.findViewById(R.id.imageButton3)
        val imageButton4: ImageButton = view.findViewById(R.id.imageButton4)
        val constraintLayoutreal: ConstraintLayout = view.findViewById(R.id.constraintLayoutreal)
        val textpasahitza: EditText = view.findViewById(R.id.textpasahitza)
        val salirbtn: ImageButton = view.findViewById(R.id.salirbtn)
        val sartubtn: Button = view.findViewById(R.id.sartubtn)
        val aterabtn: Button = view.findViewById(R.id.aterabtn)


        constraintLayoutreal.visibility = View.INVISIBLE

        database = Room.databaseBuilder(
            requireContext().applicationContext,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()


        imageButton3.setOnClickListener {
            val intent = Intent(context, MapsActivity_full::class.java)
            startActivity(intent)
        }

        imageButton4.setOnClickListener {
            if (constraintLayoutreal.visibility == View.VISIBLE) {
                constraintLayoutreal.visibility = View.INVISIBLE
                constraintLayoutreal.isClickable = false
            } else {
                constraintLayoutreal.visibility = View.VISIBLE
                constraintLayoutreal.isClickable = true
            }
        }
        salirbtn.setOnClickListener{
            constraintLayoutreal.visibility = View.INVISIBLE
            constraintLayoutreal.isClickable = false
        }
        sartubtn.setOnClickListener{
            if (textpasahitza.text.toString() == getString(R.string.contraseña)){
                GlobalScope.launch(Dispatchers.IO) {
                    database.DBdao.updateactivado()
                }
                recargarActividad()
                textpasahitza.text.clear()
                constraintLayoutreal.visibility = View.INVISIBLE
                constraintLayoutreal.isClickable = false
            }else{
                dialog()
            }
        }
        aterabtn.setOnClickListener{
            val builder = AlertDialog.Builder(context)
            builder.setTitle(getString(R.string.librea))
            builder.setMessage(getString(R.string.desaktibatu))

            builder.setPositiveButton(getString(R.string.bai)) { dialog, which ->
                GlobalScope.launch(Dispatchers.IO) {
                    database.DBdao.updatedesactivado()
                }
                recargarActividad()
                constraintLayoutreal.visibility = View.INVISIBLE
                constraintLayoutreal.isClickable = false
            }

            builder.setNegativeButton(getString(R.string.ez)) { dialog, which ->
            }
            val dialog = builder.create()
            dialog.show()
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
         * @return A new instance of fragment navegador_superior.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            navegador_superior().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun dialog() {
        val builder = AlertDialog.Builder(context)

        builder.setTitle(getString(R.string.error))
            .setMessage(getString(R.string.ezdazuzena))
            .setPositiveButton(getString(R.string.jarraitu)) { dialog, which ->
            }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
    private fun recargarActividad() {
        if (activity != null) {
            requireActivity().recreate()
        }
    }
}