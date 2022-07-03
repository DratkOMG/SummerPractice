package com.test.summerpractice22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentProfileBinding
import com.test.summerpractice22.databinding.FragmentSearchBinding

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private val SHOW_WHAT = "From Profile"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentProfileBinding.bind(view)

        with(binding) {
            itProfile.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    SHOW_WHAT
                )
                findNavController().navigate(R.id.action_profileFragment_to_meowMeowFragment, bundle)
            }

        }
    }
}