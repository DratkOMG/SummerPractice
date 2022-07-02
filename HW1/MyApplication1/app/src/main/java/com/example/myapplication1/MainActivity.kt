package com.example.myapplication1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val name = binding.name.text.toString()
            val height = binding.height.text.toString().toInt()
            val weight = binding.weight.text.toString().toFloat()
            val age = binding.age.text.toString().toInt()

            var error: Int = 0
            if (name == "" || name.length > 50) {
                error++
            }

            if (height <= 0 || height >= 250) {
                error++
            }

            if (weight <= 0 || weight >= 250) {
                error++
            }

            if (age <= 0 || age >= 150) {
                error++
            }

            if (error == 0) {
                var value = (10 * weight + 6.25 * height + 5 * age + 5).toInt().toString()
                binding.result.text = "Ответ: $value"
            } else {
                binding.result.text = "Data entered incorre  ctly."
            }
        }
    }
}