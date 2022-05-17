package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.MetaXXModel

data class MetaXXUI(
    val count: Int
)

fun MetaXXModel.toUI() = MetaXXUI(count)
