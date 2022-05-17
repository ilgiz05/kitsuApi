package com.ilgiz.kitsu.presentation.ui.fragments.anime.detailed

import com.ilgiz.kitsu.domain.useCases.FetchSingleAnimeUseCase
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.anime.SingleAnimeUI
import com.ilgiz.kitsu.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailedAnimeViewModel @Inject constructor(
    private val fetchSingleAnimeUseCase: FetchSingleAnimeUseCase,
) : BaseViewModel() {
    private val _singleAnimeState = mutableUiStateFlow<SingleAnimeUI>()
    var singleAnimeState = _singleAnimeState.asStateFlow()


    fun fetchSingleAnime(id: String) =
        fetchSingleAnimeUseCase(id).gatherRequest(_singleAnimeState) { it.toUI() }


}