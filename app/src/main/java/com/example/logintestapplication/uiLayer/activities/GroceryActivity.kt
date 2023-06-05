package com.example.logintestapplication.uiLayer.activities

import android.content.res.Resources
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.logintestapplication.R
import com.example.logintestapplication.uiLayer.adapters.FragmentPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class GroceryActivity : AppCompatActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grocery)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)

        viewPager2.adapter = FragmentPageAdapter(this)
        TabLayoutMediator(tabLayout,viewPager2){ tab, index ->
            tab.text = when(index){
                0 -> {"List"}
                1 -> {"Search"}
                2 -> {"Transaction"}
                else -> {throw Resources.NotFoundException("Position Not Found")}
            }
        }.attach()
    }
}








