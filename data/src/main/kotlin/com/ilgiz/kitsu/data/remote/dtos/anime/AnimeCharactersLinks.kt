package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.LinksXXXXXXXXXXXModel

data class LinksXXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXModel(
    self, related
)