package com.example.flixster

import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide


private const val TAG = "DetailActivity"

class DetailActivity : AppCompatActivity() {
    private lateinit var movieImageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var overviewTextView: TextView
    private lateinit var releaseDateTextView: TextView
    private lateinit var ratingBar: RatingBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // TODO: Find the views for the screen
        movieImageView = findViewById(R.id.movieImage)
        titleTextView = findViewById(R.id.movieTitle)
        overviewTextView = findViewById(R.id.movieOverview)
        releaseDateTextView = findViewById(R.id.movieDate)
        ratingBar = findViewById(R.id.ratingBar)

        //TODO: Get the extra from the Intent
        val movie = intent.getSerializableExtra(MOVIE_EXTRA) as Movie

        //TODO: Set the title, byline, and abstract information from the movie
        titleTextView.text = movie.title
        overviewTextView.text = movie.abstract
        releaseDateTextView.text = movie.pubDate
        if(movie.voteAverage != null) {
            ratingBar.rating = movie.voteAverage
        }
        //TODO: Load the media image
        Glide.with(this)
            .load("https://image.tmdb.org/t/p/w500/" + movie.backdrop)
            .into(movieImageView)
    }
}
