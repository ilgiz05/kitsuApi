package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.MangaDataModel
import com.ilgiz.kitsu.presentation.base.BaseDiffModel

data class MangaDataUI(
    override val id: String,
    val type: String,
    val links: LinksUI,
    val mangaDto: MangaUI,
    val relationships: RelationshipsUI
) : BaseDiffModel

fun MangaDataModel.toUI() =
    MangaDataUI(id, type, links.toUI(), mangaDto.toUI(), relationships.toUI())