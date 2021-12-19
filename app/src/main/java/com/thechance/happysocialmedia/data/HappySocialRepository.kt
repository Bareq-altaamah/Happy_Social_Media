package com.thechance.happysocialmedia.data

import com.thechance.happysocialmedia.domain.models.Post
import kotlinx.coroutines.flow.Flow

interface HappySocialRepository{
    fun getFakePost(): Flow<List<Post>>
}