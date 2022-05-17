package com.ilgiz.kitsu.domain.models.anime


data class AnimeDataModel(
    val id: String,
    val type: String?,
    val links: LinksModel?,
    val animeDto: AnimeModel,
    val relationships: RelationshipsModel?
)
