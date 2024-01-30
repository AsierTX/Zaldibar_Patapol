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
import androidx.fragment.app.Fragment

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [savegame_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class savegame_fragment : Fragment() {
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
        val view = inflater.inflate(R.layout.fragment_savegame_fragment, container, false)

        val izena = view.findViewById<EditText>(R.id.pasahitza)
        val button = view.findViewById<Button>(R.id.iniciar)

        button.setOnClickListener {
            if (izena.text.toString() != "") {

                val intent = Intent(activity, FinalActivity::class.java)
                val bundle = Bundle()
                bundle.putString("nombrejugador", izena.text.toString())
                intent.putExtras(bundle)
                startActivity(intent)

                requireFragmentManager().beginTransaction().remove(this).commit()

            } else {
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
         * @return A new instance of fragment savegame_fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            savegame_fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
    private fun dialog() {
        val builder = AlertDialog.Builder(context)

        builder.setTitle(getString(R.string.error))
            .setMessage(getString(R.string.idatzi))
            .setPositiveButton(getString(R.string.jarraitu)) { dialog, which ->
            }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }
}