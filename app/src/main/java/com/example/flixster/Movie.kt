package com.example.flixster

import android.support.annotation.Keep
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Keep
@Serializable
data class BaseResponse(
    @SerialName("results")
    val docs: List<Movie>?
)

@Keep
@Serializable
data class Movie(
    @SerialName("original_title")
    val title: String?,
    @SerialName("release_date")
    val pubDate: String?,
    @SerialName("poster_path")
    val posterPath: String?,
    @SerialName("overview")
    val abstract: String?,
    @SerialName("vote_average")
    val voteAverage: Float?,
    @SerialName("backdrop_path")
    val backdrop: String?,
) : java.io.Serializable


