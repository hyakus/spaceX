package com.coderus.codingchallenge.repository

import com.coderus.codingchallenge.api.APIService
import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.room.AppDatabase
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import java.io.IOException
import java.util.concurrent.Executors
import javax.inject.Inject

class Repository @Inject constructor(
    private val db: AppDatabase
) : IRepository {

    override fun getAllLaunches(): List<RocketLaunch>
    {
        return db.dao().getAllLaunches()
    }

    override fun insertAll(launches: List<RocketLaunch>)
    {
        db.dao().insertAll(launches)
    }

    override suspend fun retrieveRemoteData(): Resource<List<RocketLaunch>>
    {
        return try {
            val response = APIService.create().getRocketLaunchList()

            if(response.isEmpty())
            {
                Resource.error("An unknown error occurred", null)
            }
            else
            {
                Resource.success(response)
            }
        } catch (e: IOException)
        {
            Resource.error("Could not connect to the server. Check your connection and try again", null)
        }
    }

}