package com.coderus.codingchallenge.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.coderus.codingchallenge.objectmodel.RocketLaunch

/**
 * Dao for operating on the Room database.
 */
@Dao
interface LaunchDao {
    /**
     * Retrieve stored [RocketLaunch]s.
     */
    @Query("SELECT * FROM launch")
    fun getAllLaunches(): List<RocketLaunch>
    /**
     * Store new [RocketLaunch] List.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(launches: List<RocketLaunch>)
    /**
     * Store new [RocketLaunch].
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(launch: RocketLaunch)
    /**
     * Delete [RocketLaunch] from database.
     */
    @Delete
    fun delete(launch: RocketLaunch)
    /**
     * Update stored [RocketLaunch] record.
     */
    @Update
    fun updateLaunch(launch: RocketLaunch)
}
