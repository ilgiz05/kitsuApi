package com.ilgiz.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LinksXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String
)

fun LinksXX.toDomain() = com.ilgiz.kitsu.domain.models.manga.LinksXXModel(
    self, related
)