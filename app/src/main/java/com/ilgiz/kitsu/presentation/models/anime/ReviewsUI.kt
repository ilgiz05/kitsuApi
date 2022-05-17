package com.ilgiz.kitsu.presentation.models.anime

import com.ilgiz.kitsu.domain.models.anime.ReviewsModel

data class ReviewsUI(
    val links: LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
