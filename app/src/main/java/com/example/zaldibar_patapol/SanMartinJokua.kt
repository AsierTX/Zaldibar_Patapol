package com.example.zaldibar_patapol
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SanMartinJokua : AppCompatActivity() {

    private val words = mutableListOf("", "Atea", "Beiratea", "Teilatua", "Kanpaiak", "Gurutzea", "Bankuak", "Altarea", "Ama Birjina")

    private lateinit var textView: TextView
    private lateinit var imageButtons: List<ImageButton>
    private lateinit var soundService: SoundService
    private var currentIndex = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_san_martin_jokua)

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
            textView.text = "Amaitu duzu!"
            imageButtons.forEach { it.isEnabled = false }
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

}
