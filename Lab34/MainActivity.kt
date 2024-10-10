package com.example.myapplication4

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication4.databinding.ActivityMainBinding
import android.graphics.Color
import android.view.View


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.setOnClickListener {
            binding.tvName.setTextColor(Color.BLUE)
        }

        binding.tvGroup.setOnClickListener {
            binding.tvGroup.setTextColor(Color.CYAN)
        }

        binding.tvCity.setOnClickListener {
            binding.tvCity.setTextColor(Color.YELLOW)
        }

        binding.btnHide.setOnClickListener {
            binding.tvName.visibility = View.INVISIBLE
        }

        binding.btnShow.setOnClickListener {
            binding.tvName.visibility = View.VISIBLE
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
