package com.example.catalogemovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.Glide.*
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_TITLE = "extra_title"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)


        val data = intent.getParcelableExtra(EXTRA_TITLE) as Data


        txt_titlee?.text = data.title.toString()
        txt_genre?.text = data.genre
        txt_release?.text = data.realese
        txt_runtime?.text = data.runtime
        txt_companies?.text = data.companies
        txt_description?.text = data.description

        Glide.with(this@DetailActivity)
            .load(data.photo?.toInt())
            .apply(RequestOptions().override(480,718))
            .into(img_detail_photo)

    }
}
