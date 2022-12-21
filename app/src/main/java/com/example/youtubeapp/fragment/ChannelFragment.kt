package com.example.youtubeapp.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapp.R

class ChannelFragment : Fragment() {
    companion object {
        const val TAG = "ChannelFragment"
    }

    private lateinit var videosRecyclerView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_channel, container, false)
        videosRecyclerView = view.findViewById(R.id.list_videos)
        return view
    }
}