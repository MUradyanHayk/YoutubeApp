package com.example.youtubeapp.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.youtubeapp.fragment.ChannelFragment
import com.example.youtubeapp.fragment.LiveFragment
import com.example.youtubeapp.fragment.PlayListFragment

class PagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, var numOfTabs: Int = 0) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return numOfTabs
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val tab1 = ChannelFragment()
                return tab1
            }
            1 -> {
                val tab2 = PlayListFragment()
                return tab2
            }
            2 -> {
                val tab3 = LiveFragment()
                return tab3
            }
            else -> ChannelFragment()
        }
    }
}