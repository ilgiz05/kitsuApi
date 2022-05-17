package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())