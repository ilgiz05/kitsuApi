package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.SingleAnimeModel

data class SingleAnimeUI(
    val data: AnimeDataUI
)

fun SingleAnimeModel.toUI() = SingleAnimeUI(data.toUI())
