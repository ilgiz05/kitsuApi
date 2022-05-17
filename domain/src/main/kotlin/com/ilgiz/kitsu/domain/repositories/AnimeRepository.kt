package com.ilgiz.kitsu.domain.repositories

import com.ilgiz.kitsu.domain.either.Either
import com.ilgiz.kitsu.domain.models.anime.SingleAnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, SingleAnimeModel>>
}