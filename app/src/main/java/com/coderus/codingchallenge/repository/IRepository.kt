package com.coderus.codingchallenge.repository

import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.objectmodel.RocketLaunch

interface IRepository
{
    fun getAllLaunches(): List<RocketLaunch>
    fun insertAll(launches: List<RocketLaunch>)
    suspend fun retrieveRemoteData(): Resource<List<RocketLaunch>>
}