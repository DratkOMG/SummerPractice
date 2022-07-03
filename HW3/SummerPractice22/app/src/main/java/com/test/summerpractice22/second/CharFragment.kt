package com.test.summerpractice22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentCharBinding
import com.test.summerpractice22.second.genshin.CharAdapter
import com.test.summerpractice22.second.genshin.CharRepository

class CharFragment : Fragment(R.layout.fragment_char) {
    private var _binding: FragmentCharBinding? = null
    private val binding get() = _binding!!

    private var adapter: CharAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCharBinding.bind(view)

        adapter = CharAdapter(CharRepository.chars) {
            val bundle = Bundle()
            bundle.putString(
                "ARG_TEXT",
                it.id.toString()
            )
            findNavController().navigate(R.id.action_charFragment_to_informationFragment, bundle)
        }
        binding.rvChar.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}