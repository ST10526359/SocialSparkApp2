package za.ac.iie.socialsparkapp

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtTime = findViewById<EditText>(R.id.edtTime)
        val btnShow = findViewById<Button>(R.id.btnShow)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResult = findViewById<TextView>(R.id.txtResult)

        btnShow.setOnClickListener {
            val input = edtTime.text.toString().lowercase()

            val result = when (input) {
                "morning" -> "Send a good morning text to a family member"
                "mid-morning" -> "Say thank you to a colleague"
                "afternoon" -> "Share a meme with a friend"
                "snack time" -> "Send a thinking of you message"
                "dinner" -> "Call a friend or relative"
                "night" -> "Comment on a friend's post"
                else -> "Invalid Time "
            }

            txtResult.text = result
        }

        btnReset.setOnClickListener {
            edtTime.text.clear()
            txtResult.text = ""
        }
    }
}