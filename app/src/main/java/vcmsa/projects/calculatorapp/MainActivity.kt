package vcmsa.projects.calculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView
    private lateinit var b1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.editTextNumber1)
        et2 = findViewById(R.id.editTextNumber2)
        tv1 = findViewById(R.id.textViewResult)
        b1 = findViewById(R.id.buttonAdd)

        // Set click listener for the button
        b1.setOnClickListener {
            val num1Str = et1.text.toString()
            val num2Str = et2.text.toString()

            // Check if inputs are not empty
            if (num1Str.isNotEmpty() && num2Str.isNotEmpty()) {
                val num1 = num1Str.toDouble()
                val num2 = num2Str.toDouble()
                val result = num1 + num2

                // Display result
                tv1.text = "Result: $result"
            } else {
                tv1.text = "Please enter both numbers"
            }


        }
    }
}



