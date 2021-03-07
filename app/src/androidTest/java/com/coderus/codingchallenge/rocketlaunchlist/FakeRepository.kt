package com.coderus.codingchallenge.rocketlaunchlist

import androidx.lifecycle.MutableLiveData
import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.repository.IRepository

class FakeRepository : IRepository
{
    private val rocketLaunches = mutableListOf<RocketLaunch>()

    private var shouldNetworkError = false

    fun setShouldNetworkError(value: Boolean) {
        shouldNetworkError = value
    }

    override fun getAllLaunches(): List<RocketLaunch> {
        return rocketLaunches
    }

    override fun insertAll(launches: List<RocketLaunch>) {
        rocketLaunches.addAll(launches)
    }

    override suspend fun retrieveRemoteData(): Resource<List<RocketLaunch>>
    {

        return if (shouldNetworkError) Resource.error("Error", null) else Resource.success(listOf<RocketLaunch>())
    }
}