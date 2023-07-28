package com.example.activityd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activityd.databinding.ActivityPage2Binding
import com.example.activityd.databinding.ActivityPage3Binding

class Page3Activity : AppCompatActivity() {

    private lateinit var binding: ActivityPage3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityPage3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.goToPage4.setOnClickListener {
            val intentGoToPage4 = Intent(this, Page4Activity::class.java)
            startActivity(intentGoToPage4)
        }
    }
}