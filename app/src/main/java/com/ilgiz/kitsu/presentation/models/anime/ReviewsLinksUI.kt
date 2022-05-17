package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.LinksXXXXXXModel

data class LinksXXXXXXUI(
    val self: String,
    val related: String
)

fun LinksXXXXXXModel.toUI() = LinksXXXXXXUI(self, related)
