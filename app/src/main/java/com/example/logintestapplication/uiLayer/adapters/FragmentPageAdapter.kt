package com.example.logintestapplication.uiLayer.adapters

import android.content.res.Resources
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.ListFragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.logintestapplication.uiLayer.fragments.Search
import com.example.logintestapplication.uiLayer.fragments.Transaction

class FragmentPageAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
           return when (position) {
            0 -> {
                com.example.logintestapplication.uiLayer.fragments.ListFragment()
            }
            1 -> {
                Search()
            }
            2 -> {
                Transaction()
            }
               else -> {throw Resources.NotFoundException("Position Not Found")}
           }
    }
}