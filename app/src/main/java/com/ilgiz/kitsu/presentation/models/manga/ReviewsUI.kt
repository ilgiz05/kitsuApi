package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())