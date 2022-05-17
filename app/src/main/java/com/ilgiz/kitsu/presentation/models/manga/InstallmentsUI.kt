package com.ilgiz.kitsu.presentation.models.manga

import com.ilgiz.kitsu.domain.models.manga.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
