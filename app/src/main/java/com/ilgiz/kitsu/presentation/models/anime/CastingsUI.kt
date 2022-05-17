package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.CastingsModel

data class CastingsUI(
    val links: LinksXXXUI
)

fun CastingsModel.toUI() = CastingsUI(links.toUI())
