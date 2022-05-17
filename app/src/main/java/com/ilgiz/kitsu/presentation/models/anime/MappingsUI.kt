package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())