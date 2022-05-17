package com.ilgiz.kitsu.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.ilgiz.kitsu.data.remote.apiservices.AnimeApiService
import com.ilgiz.kitsu.data.remote.dtos.anime.toDomain
import com.ilgiz.kitsu.data.remote.pagingsources.AnimePagingSource
import com.ilgiz.kitsu.data.repositories.base.BaseRepository
import com.ilgiz.kitsu.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {

    fun fetchPagedAnime() =
        Pager(PagingConfig(pageSize = 20, initialLoadSize = 10)) {
            AnimePagingSource(animeApiService)
        }.flow.map { data -> data.map { it.toDomain() } }

    override fun fetchAnimeDetails(id: String) = sendRequest {
        animeApiService.fetchSingleAnime(id).toDomain()
    }
}