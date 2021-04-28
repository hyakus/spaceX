package com.coderus.codingchallenge.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.coderus.codingchallenge.objectmodel.RocketLaunch

@Dao
interface LaunchDao {
    @Query("SELECT * FROM launch")
    fun getAllLaunches(): List<RocketLaunch>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(launches: List<RocketLaunch>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(launch: RocketLaunch)

    @Delete
    fun delete(launch: RocketLaunch)

    @Update
    fun updateLaunch(launch: RocketLaunch)
}
