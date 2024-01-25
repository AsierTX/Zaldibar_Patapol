package com.example.zaldibar_patapol
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class SanMartinJokua : AppCompatActivity() {

    private val words = mutableListOf("", "Atea", "Beiratea", "Teilatua", "Kanpaiak", "Gurutzea", "Bankuak", "Altarea", "Ama Birjina")

    private lateinit var textView: TextView
    private lateinit var imageButtons: List<ImageButton>
    private lateinit var soundService: SoundService
    private var currentIndex = 0

    companion object{
        lateinit var database: appdatabase
            private set
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_san_martin_jokua)

        database = Room.databaseBuilder(
            application,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()

        textView = findViewById(R.id.textView)
        imageButtons = listOf(
            findViewById(R.id.IBTN_1),
            findViewById(R.id.IBTN_2),
            findViewById(R.id.IBTN_3),
            findViewById(R.id.IBTN_4),
            findViewById(R.id.IBTN_5),
            findViewById(R.id.IBTN_6),
            findViewById(R.id.IBTN_7),
            findViewById(R.id.IBTN_8)
        )
        database = Room.databaseBuilder(
            application,
            appdatabase::class.java,
            appdatabase.DATABASE_NAME
        )
            .allowMainThreadQueries()
            .build()
        soundService = SoundService(this)
        // Set an initial random word
        setRandomWord()

        imageButtons.forEach { button ->
            button.setOnClickListener {
                handleButtonClick(button)
            }
        }
    }

    private fun setRandomWord() {
        if (words.size > 1) {
            // Remove the current word from the list to avoid repetition
            words.removeAt(currentIndex)
            currentIndex = (0 until words.size).random()
            // Set the new random word
            textView.text = words[currentIndex]
        }   else {
            textView.text = "No more words"
            imageButtons.forEach { it.isEnabled = false }
            openGameResultFragment()
            GlobalScope.launch(Dispatchers.IO) {
                database.DBdao.juego1pasado()
            }
        }
    }

    private fun handleButtonClick(button: ImageButton) {
        val wordInButton = button.tag as String?
        // Check if the word in the button matches the current word
        if (wordInButton == words[currentIndex]) {
            // make the button transparent and disabled
            button.alpha = 0.5f
            button.isEnabled = false
            soundService.playCorrectSound()
            setRandomWord()
        } else {
            // error message
            showToast("! Try again.")
            soundService.playIncorrectSound()
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
    private fun openGameResultFragment() {
        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val gameResultFragment = final_fragment_juego1()
        fragmentTransaction.replace(R.id.fragmento, gameResultFragment)

        fragmentTransaction.commit()
    }
}
