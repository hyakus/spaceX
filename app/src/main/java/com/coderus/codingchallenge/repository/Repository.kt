package com.coderus.codingchallenge.repository

import com.coderus.codingchallenge.api.APIService
import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.room.AppDatabase
import java.io.IOException
import javax.inject.Inject

/**
** Primary implementation for the Repository for retrieving [RocketLaunch] data.
*/
class Repository @Inject constructor(
    private val db: AppDatabase
) {
    /**
    ** Retrieve all available cached [RocketLaunch]es.
    */
    fun getAllLaunches(): List<RocketLaunch> =  db.dao().getAllLaunches()

    /**
    ** Store new [RocketLaunch]es.
    */
    fun insertAll(launches: List<RocketLaunch>) {
        db.dao().insertAll(launches)
    }
    /**
    ** Retrieve all new [RocketLaunch]es.
    */
    suspend fun retrieveRemoteData(): Resource<List<RocketLaunch>> {
        return try {
            val response = APIService.create().getRocketLaunchList()

            if (response.isEmpty()) {
                Resource.error("An unknown error occurred", null)
            } else {
                Resource.success(response)
            }
        } catch (e: IOException) {
            Resource.error("Could not connect to the server. Check your connection and try again", null)
        }
    }
}
