package com.example.activityd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityd.databinding.ActivityMainBinding
import com.example.activityd.databinding.ActivityPage2Binding

class Page2Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPage2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goToPage3.setOnClickListener {
            val intentGoToPage3 = Intent(this, Page3Activity::class.java)
            startActivity(intentGoToPage3)
        }
    }
}