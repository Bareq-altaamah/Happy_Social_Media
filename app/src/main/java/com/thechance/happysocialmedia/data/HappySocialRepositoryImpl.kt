package com.thechance.happysocialmedia.data

import com.thechance.happysocialmedia.data.local.daos.HappySocialDao
import com.thechance.happysocialmedia.data.remote.HappySocialService
import com.thechance.happysocialmedia.domain.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HappySocialRepositoryImpl @Inject constructor(
    dao: HappySocialDao,
    apiService: HappySocialService,
): HappySocialRepository {
    override fun getFakePost(): Flow<List<Post>> {
        TODO("Not yet implemented")
    }
}