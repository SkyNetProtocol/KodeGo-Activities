package com.example.activityd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityd.databinding.ActivityPage4Binding

class Page4Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPage4Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPage4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goToPage5.setOnClickListener {
            val intentGoToPage5 = Intent(this, Page5Activity::class.java)
            startActivity(intentGoToPage5)
        }

    }
}