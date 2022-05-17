package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.LinksModel

data class Links(
    @SerializedName("self")
    val self: String
)

fun Links.toDomain() = LinksModel(self)