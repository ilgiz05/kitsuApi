package com.ilgiz.kitsu.presentation.ui.fragments.manga

import com.ilgiz.kitsu.data.repositories.MangaRepositoryImpl
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl

) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPagedManga().gatherPagingRequest { it.toUI() }
}