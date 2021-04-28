package com.coderus.codingchallenge.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.coderus.codingchallenge.objectmodel.RocketLaunch

@Database(version = 1, entities = [RocketLaunch::class], exportSchema = false)
abstract class AppDatabase() : RoomDatabase() {
    abstract fun dao(): LaunchDao

    companion object {
        const val DATABASE_NAME = "launch_db"
    }
}
