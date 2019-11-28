package com.example.catalogemovie

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class MovieAdapter (private val listData : ArrayList<Data>) : RecyclerView.Adapter<MovieAdapter.ListViewHolder>(){


    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Data)
    }


    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_movie, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listData.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listData[position]

        holder.imgView?.let {
            Glide.with(holder.itemView.context)
                .load(data.photo)
                .apply(RequestOptions().override(418,718))
                .into(it)
        }

        holder.tvTitle?.text = data.title
        holder.tvRelease?.text = data.realese
        holder.tvGenre?.text =data.genre


        holder.itemView.setOnClickListener{

            onItemClickCallback.onItemClicked(data)
        }

    }


    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvTitle : TextView? = itemView.findViewById(R.id.txt_title)
        val imgView : ImageView? = itemView.findViewById(R.id.img_poster)
        val tvRelease : TextView? = itemView.findViewById(R.id.txt_release1)
        var tvGenre : TextView? = itemView.findViewById(R.id.txt_genre)
    }

}