package com.coderus.codingchallenge.dagger

import android.content.Context
import androidx.room.Room
import com.coderus.codingchallenge.repository.Repository
import com.coderus.codingchallenge.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * General Dagger Module for the Application.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /**
     * Provides an instance of the Room [AppDatabase].
     */
    @Singleton
    @Provides
    fun provideDB(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration().build()
    }
    /**
     * Provides an instance of the [Repository].
     */
    @Provides
    fun provideRepository(db: AppDatabase): Repository = Repository(db)

}
