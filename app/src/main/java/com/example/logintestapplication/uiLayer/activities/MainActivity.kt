package com.example.logintestapplication.uiLayer.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.logintestapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signIn.setOnClickListener {
            val intentGroceryActivity = Intent(this, GroceryActivity::class.java)
            startActivity(intentGroceryActivity)
            Log.e("DIALOG", "Pass")
        }

        binding.signUp.setOnClickListener {
            val intentSignUpActivity = Intent(this, SignUpActivity::class.java)
            startActivity(intentSignUpActivity)
            Log.e("DIALOG", "Pass")
        }
    }
}