package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2);
        rollButton.setOnClickListener { rollDice() }
        }

    private fun rollDice(){
        val randomInt = Random().nextInt( 6 ) + 1
        val resultText: TextView = findViewById(R.id.tv_number1)
        resultText.text = randomInt.toString()

        val randomInt2 = Random().nextInt( 6 ) + 1
        val resultText2: TextView = findViewById(R.id.tv_number2)
        resultText2.text = randomInt2.toString()

        val randomInt3 = Random().nextInt( 6 ) + 1
        val resultText3: TextView = findViewById(R.id.tv_number3)
        resultText3.text = randomInt3.toString()
    }

}
