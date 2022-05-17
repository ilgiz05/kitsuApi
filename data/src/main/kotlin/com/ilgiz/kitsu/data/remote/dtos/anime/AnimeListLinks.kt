package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.LinksXXXXXXXXXXXXXModel

data class LinksXXXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String
)

fun LinksXXXXXXXXXXXXX.toDomain() =
    LinksXXXXXXXXXXXXXModel(
        first, prev, next, last
    )
