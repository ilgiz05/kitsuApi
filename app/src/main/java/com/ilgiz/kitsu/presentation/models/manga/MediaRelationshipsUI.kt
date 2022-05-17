package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI
)

fun MediaRelationshipsModel.toUI() = MediaRelationshipsUI(links.toUI())