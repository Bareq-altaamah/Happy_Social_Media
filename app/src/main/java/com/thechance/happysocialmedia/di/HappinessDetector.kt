package com.thechance.happysocialmedia.di

import com.shahad.app.happiness_detector.HappinessCalculator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HappinessDetector {

    @Singleton
    @Provides
    fun provideHappinessCalculator(): HappinessCalculator = HappinessCalculator()

}