package com.coderus.codingchallenge

import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.coderus.codingchallenge.objectmodel.RocketLaunch
import com.coderus.codingchallenge.room.AppDatabase
import com.coderus.codingchallenge.room.LaunchDao
import kotlinx.coroutines.runBlocking
import org.junit.After
import org.junit.Before
import org.junit.Test

internal class LaunchDaoTest {

    private lateinit var database: AppDatabase
    private lateinit var dao: LaunchDao

    @Before
    fun setup() {
        database = Room.inMemoryDatabaseBuilder(ApplicationProvider.getApplicationContext(),
            AppDatabase::class.java).allowMainThreadQueries().build()

        dao = database.dao()
    }

    @After
    fun teardown() {
        database.close()
    }

    @Test
    fun insertAllRocketLaunch() = runBlocking {
        val launch = RocketLaunch(-1, "name", "date", "details", true)
        val launch2 = RocketLaunch(-2, "name", "date", "details", true)
        val launch3 = RocketLaunch(-3, "name", "date", "details", true)

        val list = listOf<RocketLaunch>(launch, launch2, launch3)

        dao.insertAll(list)

        val allLaunches = dao.getAllLaunches()

        assert(allLaunches.contains(launch))
        assert(allLaunches.contains(launch2))
        assert(allLaunches.contains(launch3))
    }

    @Test
    fun insertRocketLaunch() = runBlocking {
        val launch = RocketLaunch(-1, "name", "date", "details", true)

        dao.insert(launch)

        val allLaunches = dao.getAllLaunches()

        assert(allLaunches.contains(launch))
    }

    @Test
    fun deleteRocketLaunch() = runBlocking {
        val launch = RocketLaunch(-1, "name", "date", "details", true)

        dao.insert(launch)
        dao.delete(launch)

        val allLaunches = dao.getAllLaunches()
        assert(!allLaunches.contains(launch))
    }
}
