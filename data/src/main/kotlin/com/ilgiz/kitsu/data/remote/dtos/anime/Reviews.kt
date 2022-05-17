package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.ReviewsModel

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())