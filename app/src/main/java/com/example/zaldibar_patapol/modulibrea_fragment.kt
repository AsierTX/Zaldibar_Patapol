package com.example.zaldibar_patapol

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"
private lateinit var sartu: Button
private lateinit var contraseña: EditText


/**
 * A simple [Fragment] subclass.
 * Use the [modulibrea_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class modulibrea_fragment : Fragment() {
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

    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_modulibrea_fragment, container, false)

        database = Room.databaseBuilder(
            requireContext().applicationContext,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()

        contraseña = view.findViewById<EditText>(R.id.pasahitza)!!
        sartu = view.findViewById<Button>(R.id.iniciar_activity)!!
        sartu.setOnClickListener {
            if (contraseña.text.toString() == getString(R.id.pasahitza)){
                GlobalScope.launch(Dispatchers.IO) {
                    database.DBdao.updateactivado()
                }
            }else{
                dialog()
            }
        }
        val btnsalir = view.findViewById<ImageButton>(R.id.btnsalir2)!!

        btnsalir.setOnClickListener{
            val fragmentManager = requireActivity().supportFragmentManager
            fragmentManager.beginTransaction().remove(this@modulibrea_fragment).commit()
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
         * @return A new instance of fragment modulibrea_fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            modulibrea_fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun dialog() {
        val builder = AlertDialog.Builder(context)

        builder.setTitle("ERROR")
            .setMessage("Pasahitza ez da zuzena!")
            .setPositiveButton("Jarraitu") { dialog, which ->
            }

        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}