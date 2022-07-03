package com.test.summerpractice22.second


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.findNavController
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentActivateBinding
import com.test.summerpractice22.databinding.FragmentSearchBinding

class ActivateFragment : Fragment(R.layout.fragment_activate) {
    private var _binding: FragmentActivateBinding? = null
    private val binding get() = _binding!!
    private val SHOW_WHAT = "From Activate"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentActivateBinding.bind(view)

        with(binding) {
            itActivate.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    SHOW_WHAT
                )
                findNavController().navigate(R.id.action_activateFragment_to_meowMeowFragment, bundle)
            }


        }
    }
}