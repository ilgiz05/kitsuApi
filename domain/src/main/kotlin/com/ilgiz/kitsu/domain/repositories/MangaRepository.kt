package com.ilgiz.kitsu.domain.repositories

import com.ilgiz.kitsu.domain.either.Either
import com.ilgiz.kitsu.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchDetailedManga(id: String): Flow<Either<String, SingleMangaModel>>
}