package com.thechance.happysocialmedia.data.local

import androidx.room.*
import com.thechance.happysocialmedia.data.local.daos.HappySocialDao
import com.thechance.happysocialmedia.data.local.entities.TestEntity

@TypeConverters(Convertor::class)
@Database(entities = [TestEntity::class] , version = 1)
abstract class HappySocialDatabase: RoomDatabase() {

    abstract fun happySocialDao(): HappySocialDao

    companion object{
        const val DATABASE_NAME = "HAPPY_SOCIAL_MEDIA"
    }

}