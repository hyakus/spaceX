package com.coderus.codingchallenge

import com.coderus.codingchallenge.repository.Repository
import com.coderus.codingchallenge.objectmodel.Resource
import com.coderus.codingchallenge.room.AppDatabase
import com.coderus.codingchallenge.room.LaunchDao
import io.mockk.coEvery
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.runs

object MockHelper {
    fun mockRepository() = mockk<Repository> {
        coEvery { retrieveRemoteData() } returns Resource.success(listOf())
        every { getAllLaunches() } returns listOf()
        every { insertAll(any()) } just runs
    }

    fun createMockDatabase(dao: LaunchDao = mockk()) = mockk<AppDatabase> {
        every { dao() } returns dao
        every { close() } just runs
    }

    fun mockLaunchDao() = mockk<LaunchDao> {
        coEvery { insert(any()) } just runs
        coEvery { updateLaunch(any()) } just runs
        coEvery { insertAll(any()) } just runs
        coEvery { getAllLaunches() } returns listOf()
    }
}