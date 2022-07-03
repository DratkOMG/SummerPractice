package com.test.summerpractice22.second

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.test.summerpractice22.R

class MeowMeowFragment : Fragment(R.layout.fragment_meow_meow) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val text = arguments?.getString("ARG_TEXT").orEmpty()

        if (text.isNotEmpty()) {
            Snackbar.make(view, text, Snackbar.LENGTH_SHORT).show()
        }
    }
}