package com.example.quickwash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quickwash.Splashscreen.SplashScreenActivity
import com.example.quickwash.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    binding.btnSplashscreen.setOnClickListener {
        val intent = Intent(this, SplashScreenActivity::class.java)
        startActivity(intent)
//        Toast.makeText(this, "Hallo", Toast.LENGTH_LONG).show()
        finish()
    }
    }
}