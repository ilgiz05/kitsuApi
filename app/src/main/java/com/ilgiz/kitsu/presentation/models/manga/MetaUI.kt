package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())