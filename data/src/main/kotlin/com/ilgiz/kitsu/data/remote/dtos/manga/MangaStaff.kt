package com.ilgiz.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.ilgiz.kitsu.domain.models.manga.MangaStaffModel

data class MangaStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX
)

fun MangaStaff.toDomain() =
    MangaStaffModel(links.toDomain())