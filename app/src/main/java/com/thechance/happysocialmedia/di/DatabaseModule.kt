package com.thechance.happysocialmedia.di

import android.content.Context
import androidx.room.Room
import com.thechance.happysocialmedia.data.local.*
import com.thechance.happysocialmedia.data.local.daos.HappySocialDao
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.*

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(
        @ApplicationContext context: Context
    ): HappySocialDatabase =
        Room.databaseBuilder(
            context,
            HappySocialDatabase::class.java,
            HappySocialDatabase.DATABASE_NAME
        ).build()


    @Singleton
    @Provides
    fun provideDao(database: HappySocialDatabase): HappySocialDao =
        database.happySocialDao()

}