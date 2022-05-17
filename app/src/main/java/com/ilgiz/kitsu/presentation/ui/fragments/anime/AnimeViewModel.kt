package com.ilgiz.kitsu.presentation.ui.fragments.anime

import com.ilgiz.kitsu.data.repositories.AnimeRepositoryImpl
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPagedAnime().gatherPagingRequest {
            it.toUI()
        }


}