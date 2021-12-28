package com.thechance.happysocialmedia.data

import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.domain.models.User
import kotlinx.coroutines.flow.Flow

interface HappySocialRepository{
    fun getAllPosts(): Flow<List<Post>>
    fun getCurrentUserInfo(): Flow<User>
    fun getUserByName(name: String): Flow<List<User>>
}