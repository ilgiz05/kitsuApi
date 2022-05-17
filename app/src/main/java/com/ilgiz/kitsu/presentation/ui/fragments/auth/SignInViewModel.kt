package com.ilgiz.kitsu.presentation.ui.fragments.auth

import com.ilgiz.kitsu.domain.useCases.SignInUseCase
import com.ilgiz.kitsu.presentation.base.BaseViewModel
import com.ilgiz.kitsu.presentation.models.auth.TokenUI
import com.ilgiz.kitsu.presentation.models.auth.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val signInUseCase: SignInUseCase
) : BaseViewModel() {
    private val _signInState = mutableUiStateFlow<TokenUI>()
    val signInState = _signInState.asStateFlow()

    fun signIn(username: String, password: String) =
        signInUseCase(username, password).gatherRequest(_signInState) { it.toUI() }
}