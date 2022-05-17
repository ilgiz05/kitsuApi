package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.LargeXModel

data class LargeXUI(
    val width: Int?,
    val height: Int?
)

fun LargeXModel.toUI() = LargeXUI(width, height)