package com.ilgiz.kitsu.data.repositories

import com.ilgiz.kitsu.data.local.preferences.PreferencesHelper
import com.ilgiz.kitsu.data.remote.apiservices.AuthenticationApiService
import com.ilgiz.kitsu.data.remote.dtos.auth.AuthDto
import com.ilgiz.kitsu.data.remote.dtos.auth.toDomain
import com.ilgiz.kitsu.data.repositories.base.BaseRepository
import com.ilgiz.kitsu.domain.models.auth.TokenModel
import com.ilgiz.kitsu.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper
) : BaseRepository(), AuthenticationRepository {
    override fun authenticate(
        username: String,
        password: String
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}