package com.example.catalogemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    private lateinit var rv_movie : RecyclerView
    private var list : ArrayList<Data> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie = findViewById(R.id.rv_movie)
        rv_movie.setHasFixedSize(true)

        list.addAll(MovieData.ListData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rv_movie.layoutManager = LinearLayoutManager(this)
        val movieAdapter = MovieAdapter(list)
        rv_movie.adapter = movieAdapter

        movieAdapter.setOnItemClickCallback(object : MovieAdapter.OnItemClickCallback{
            override fun onItemClicked(data: Data) {

                startActivity<DetailActivity>(DetailActivity.EXTRA_TITLE to data)
            }
        })

    }
}
