package com.test.summerpractice22.second

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.core.content.edit
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private val SHOW_WHAT = "From Main"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentMainBinding.bind(view)

        with(binding) {
            itMain.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    SHOW_WHAT
                )
                findNavController().navigate(R.id.action_mainFragment_to_meowMeowFragment, bundle)
            }


        }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
