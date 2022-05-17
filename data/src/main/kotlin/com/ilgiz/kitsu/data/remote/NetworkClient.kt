package com.ilgiz.kitsu.data.remote

import com.ilgiz.kitsu.data.extensions.createAnApi
import com.ilgiz.kitsu.data.remote.apiservices.AnimeApiService
import com.ilgiz.kitsu.data.remote.apiservices.AuthenticationApiService
import com.ilgiz.kitsu.data.remote.apiservices.MangaApiService
import javax.inject.Inject

class NetworkClient @Inject constructor(
    retrofitClient: NetworkFastBuilder,
    okHttp: OkHttp
) {
    private val retrofit = retrofitClient.provideRetrofit(okHttp.provideOkHttpClient())
    fun provideAnimeApiService(): AnimeApiService = retrofit.createAnApi()
    fun provideMangaApiService(): MangaApiService = retrofit.createAnApi()

    class AuthenticationClient @Inject constructor(
        retrofitClient: NetworkFastBuilder,
        okHttp: OkHttp
    ) {
        private val retrofit =
            retrofitClient.provideAuthenticationRetrofit(okHttp.provideOkHttpClient())

        fun provideAuthenticationApiService(): AuthenticationApiService = retrofit.createAnApi()
    }


}