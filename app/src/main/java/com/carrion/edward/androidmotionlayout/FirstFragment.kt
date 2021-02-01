package com.carrion.edward.androidmotionlayout

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.carrion.edward.androidmotionlayout.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {
    private var fragmentFirstBinding: FragmentFirstBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentFirstBinding.bind(view)
        fragmentFirstBinding = binding

        val items = mutableListOf<Model>().apply {
            for (i in 0 until 10) {
                add(Model("Item ${i + 1}"))
            }
        }

        binding.recyclerView.adapter = ItemAdapter(items)
    }

    override fun onDestroyView() {
        fragmentFirstBinding = null
        super.onDestroyView()
    }
}