package com.example.myapplication3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnAuthor = findViewById<Button>(R.id.button)
        val btnFaculty = findViewById<Button>(R.id.button2)
        val btnCity = findViewById<Button>(R.id.button3)
        val editTextName = findViewById<EditText>(R.id.editTextText2)
        val textViewHeader = findViewById<TextView>(R.id.textView)

        btnAuthor.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "Автор додатка: Заплетнюк Діана Сергіївна")
            startActivity(intent)
        }

        btnFaculty.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "Факультет: Інформаційні технології")
            startActivity(intent)
        }

        btnCity.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("info", "Місто: Боярка")
            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
