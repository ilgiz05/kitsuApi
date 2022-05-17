package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.SmallXModel

data class SmallX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)

fun SmallX.toDomain() = SmallXModel(width, height)