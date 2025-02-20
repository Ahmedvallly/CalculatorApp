package vcmsa.projects.calculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val buttonCalculator = findViewById<Button>(R.id.buttonCalculator)
        val buttonNewFeatures = findViewById<Button>(R.id.buttonNewFeatures)

        // Navigate to Calculator Screen
        buttonCalculator.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Navigate to New Features Screen
        buttonNewFeatures.setOnClickListener {
            val intent = Intent(this, NewFeaturesActivity::class.java)
            startActivity(intent)
        }
    }
}
