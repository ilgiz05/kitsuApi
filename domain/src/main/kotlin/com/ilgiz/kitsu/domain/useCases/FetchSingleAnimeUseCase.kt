package com.ilgiz.kitsu.domain.useCases

import com.ilgiz.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class FetchSingleAnimeUseCase @Inject constructor(
    private val animeRepository: AnimeRepository
) {
    operator fun invoke(id: String) = animeRepository.fetchAnimeDetails(id)
}