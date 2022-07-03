package com.test.summerpractice22.second.genshin

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.test.summerpractice22.databinding.ItemCharBinding

class CharHolder(
    private val binding: ItemCharBinding,
    private val onItemClick: (Char) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(char: Char) {
        with(binding) {
            tvName.text = char.name
            tvLevel.text = "Level: " + char.level
            root.setOnClickListener {
                onItemClick(char)
            }

        Glide.with(binding.root)
            .load(char.url)
            .into(ivCover)
        }
    }
}