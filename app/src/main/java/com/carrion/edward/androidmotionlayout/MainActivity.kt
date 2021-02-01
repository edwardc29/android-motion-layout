package com.carrion.edward.androidmotionlayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.carrion.edward.androidmotionlayout.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = FragmentAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
            tab.text = if (position == 0) {
                "Movimientos"
            } else {
                "Operaciones"
            }
        }.attach()
    }
}