package com.thechance.happysocialmedia.di

import com.thechance.happysocialmedia.data.FakeRepository
import com.thechance.happysocialmedia.data.HappySocialRepository
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

//    @Singleton
//    @Binds
//    abstract fun provideHappySocialRepository(
//        impl: HappySocialRepositoryImpl
//    ): HappySocialRepository

    @Singleton
    @Binds
    abstract fun provideFakeRepository(
        impl: FakeRepository
    ): HappySocialRepository
}