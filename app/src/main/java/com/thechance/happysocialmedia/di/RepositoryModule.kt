package com.thechance.happysocialmedia.di

import com.thechance.happysocialmedia.data.remote.HappySocialRepositoryImpl
import com.thechance.happysocialmedia.domain.HappySocialRepository
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideHappySocialRepository(
        impl: HappySocialRepositoryImpl
    ): HappySocialRepository

}