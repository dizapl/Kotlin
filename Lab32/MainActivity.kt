package com.example.myapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.widget.Button


class MainActivity : AppCompatActivity() {
    private lateinit var tvDay: TextView
    private lateinit var btnNextDay: Button
    private val daysOfWeek = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    private var currentDayIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            tvDay = findViewById(R.id.tvDay)
            btnNextDay = findViewById(R.id.btnNextDay)

            tvDay.text = daysOfWeek[currentDayIndex]

            btnNextDay.setOnClickListener {
                currentDayIndex = (currentDayIndex + 1) % daysOfWeek.size
                tvDay.text = daysOfWeek[currentDayIndex]
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
