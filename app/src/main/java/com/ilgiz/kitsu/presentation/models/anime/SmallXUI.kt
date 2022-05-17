package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.SmallXModel

data class SmallXUI(
    val width: Int?,
    val height: Int?
)

fun SmallXModel.toUI() = SmallXUI(width, height)
