package com.test.summerpractice22.second.genshin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.test.summerpractice22.databinding.ItemCharBinding

class CharAdapter(
    private var list: List<Char>,
    private val onItemClick: (Char) -> Unit,
) : RecyclerView.Adapter<CharHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharHolder = CharHolder(
        ItemCharBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemClick = onItemClick
    )

    override fun onBindViewHolder(
        holder: CharHolder,
        position: Int
    ) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}