package com.test.summerpractice22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.test.summerpractice22.R
import com.test.summerpractice22.databinding.FragmentReelsBinding
import com.test.summerpractice22.databinding.FragmentSearchBinding

class ReelsFragment : Fragment(R.layout.fragment_reels) {
    private var _binding: FragmentReelsBinding? = null
    private val binding get() = _binding!!
    private val SHOW_WHAT = "From Reels"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentReelsBinding.bind(view)

        with(binding) {
            itReels.setOnClickListener {
                val bundle = Bundle()
                bundle.putString(
                    "ARG_TEXT",
                    SHOW_WHAT
                )
                findNavController().navigate(R.id.action_reelsFragment_to_meowMeowFragment, bundle)
            }

        }
    }
}