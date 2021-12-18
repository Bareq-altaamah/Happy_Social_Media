package com.thechance.happysocialmedia.di

import com.thechance.happysocialmedia.data.remote.*
import dagger.*
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideMarvelService(
        okHttpClient: OkHttpClient,
        gsonConverterFactory: GsonConverterFactory
    ): HappySocialService {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://theChance.socialMedia") // change base url later
            .addConverterFactory(gsonConverterFactory)
            .build()
            .create(HappySocialService::class.java)
    }


    @Singleton
    @Provides
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        authInterceptor: AuthInterceptor
    ): OkHttpClient =
        OkHttpClient
            .Builder()
            .addInterceptor(authInterceptor)
            .addInterceptor(loggingInterceptor)
            .build()


    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor =
        HttpLoggingInterceptor().apply{
            level = HttpLoggingInterceptor.Level.BODY
        }


    @Singleton
    @Provides
    fun provideGsonConverter(): GsonConverterFactory =
        GsonConverterFactory.create()

}