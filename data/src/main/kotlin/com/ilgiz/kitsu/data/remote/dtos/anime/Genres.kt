package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.GenresModel

data class Genres(
    @SerializedName("links")
    val links: LinksX
)

fun Genres.toDomain() = GenresModel(
    links.toDomain()
)
