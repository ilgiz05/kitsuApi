package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXXXXXXX.toDomain() = com.ilgiz.kitsu.domain.models.anime.LinksXXXXXXXModel(
    self, related
)