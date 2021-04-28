package com.coderus.codingchallenge.api

import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.util.concurrent.Executors
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

/**
 * Retrofit API to retrieve data from the SpaceX API.
 */
interface APIService {

    /**
     * Retrieve list of rocket launches from the SpaceX API.
     */
    @GET("launches")
    suspend fun getRocketLaunchList(): List<RocketLaunch>

    companion object {
        /**
         * Create [APIService] instance.
         */
        fun create(): APIService = Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com/v4/")
            .client(OkHttpClient.Builder().build())
            .callbackExecutor(Executors.newSingleThreadExecutor())
            .addConverterFactory(
                MoshiConverterFactory.create(
                    Moshi.Builder()
                        .add(KotlinJsonAdapterFactory())
                        .build()
                )
            )
            .build()
            .create(APIService::class.java)
    }
}
