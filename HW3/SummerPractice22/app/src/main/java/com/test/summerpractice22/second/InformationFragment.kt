package com.test.summerpractice22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentInformationBinding
import com.test.summerpractice22.second.genshin.CharRepository

class InformationFragment : Fragment(R.layout.fragment_information) {
    private var _binding: FragmentInformationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentInformationBinding.bind(view)
        val text = arguments?.getString("ARG_TEXT").orEmpty()

        if (text.isNotEmpty()) {
            binding.id.text = "ID: " + CharRepository.chars[text.toInt()].id.toString()
            binding.name.text = "Name: " + CharRepository.chars[text.toInt()].name
            binding.level.text = "Level: " + CharRepository.chars[text.toInt()].level.toString()
            binding.element.text = "Element: " + CharRepository.chars[text.toInt()].element
            binding.weapons.text = "Weapons: " + CharRepository.chars[text.toInt()].weapons

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}