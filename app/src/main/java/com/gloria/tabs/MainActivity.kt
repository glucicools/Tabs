package com.gloria.tabs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gloria.tabs.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var whatsAppAdapter: WhatsAppadapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        whatsAppAdapter = WhatsAppadapter(supportFragmentManager)
        binding.pager.adapter = whatsAppAdapter
        binding.tabLayout.setupWithViewPager(binding.pager)
    }
}