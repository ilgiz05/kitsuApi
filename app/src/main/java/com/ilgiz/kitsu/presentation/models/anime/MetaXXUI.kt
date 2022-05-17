package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
