package com.thechance.happysocialmedia.data.local

import androidx.room.TypeConverter
import java.util.*

class Convertor {

    @TypeConverter
    fun dateToLong(date: Date) = date.time

    @TypeConverter
    fun longToDate(long:Long) = Date(long)

}