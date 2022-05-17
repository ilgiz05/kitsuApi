package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.TinyModel

data class Tiny(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun Tiny.toDomain() = TinyModel(width, height)