package com.carrion.edward.androidmotionlayout

import androidx.recyclerview.widget.RecyclerView
import com.carrion.edward.androidmotionlayout.databinding.ViewItemBinding

class ItemViewHolder(private val viewItemBinding: ViewItemBinding) :
    RecyclerView.ViewHolder(viewItemBinding.root) {

    fun onBind(model: Model) {
        viewItemBinding.nameTextView.text = model.name
    }

}