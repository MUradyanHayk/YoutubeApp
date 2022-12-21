package com.example.youtubeapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.youtubeapp.R
import com.example.youtubeapp.model.YoutubeDataModel

class VideoPostAdapter(val context: Context, val list: MutableList<YoutubeDataModel>) : RecyclerView.Adapter<VideoPostAdapter.YoutubePostHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YoutubePostHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.youtube_post_layout, parent, false)
        return YoutubePostHolder(view)
    }

    override fun onBindViewHolder(holder: YoutubePostHolder, position: Int) {
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class YoutubePostHolder : RecyclerView.ViewHolder {

        var titleTextView: TextView? = null
        var videoDesTextView: TextView? = null
        var dateTextView: TextView? = null
        var thumbImageView: ImageView? = null

        constructor(itemView: View) : super(itemView) {
            this.titleTextView = itemView.findViewById(R.id.titleTextView)
            this.videoDesTextView = itemView.findViewById(R.id.videoDesTextView)
            this.dateTextView = itemView.findViewById(R.id.dateTextView)
            this.thumbImageView = itemView.findViewById(R.id.thumbImageView)
        }
    }
}