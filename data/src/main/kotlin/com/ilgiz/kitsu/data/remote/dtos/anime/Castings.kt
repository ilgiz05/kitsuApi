package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.CastingsModel

data class Castings(
    @SerializedName("links")
    val links: LinksXXX
)

fun Castings.toDomain() = CastingsModel(
    links.toDomain()
)