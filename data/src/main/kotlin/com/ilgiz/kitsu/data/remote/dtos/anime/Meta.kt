package com.ilgiz.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.anime.MetaModel

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())