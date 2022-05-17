package com.ilgiz.kitsu.domain.repositories

import com.ilgiz.kitsu.domain.either.Either
import com.ilgiz.kitsu.domain.models.auth.TokenModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username: String, password: String): Flow<Either<String, TokenModel>>
}