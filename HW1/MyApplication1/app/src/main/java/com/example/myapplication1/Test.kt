package com.example.myapplication1

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Test: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val name = findViewById<EditText>(R.id.name).toString()
            val height = findViewById<EditText>(R.id.height).toString().toInt()
            val weight = findViewById<EditText>(R.id.weight).toString().toFloat()
            val age = findViewById<EditText>(R.id.age).toString().toInt()

            var error1 : Int = 0;
            if (name == "" || name.length > 50) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                error1 += 1
            }

            if (height <= 0 || height >= 250) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                error1 += 1
            }

            if (weight <= 0 || weight >= 250) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                error1 += 1
            }

            if (age <= 0 || age >= 150) {
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
                error1 += 1
            }

            if (error1 == 0) {
                val res = findViewById<TextView>(R.id.result)
                var value = 10 * weight + 6.25 * height + 5 * age + 5
                res.text = "Ответ: $value"

            }
        }
    }
}