package com.thechance.happysocialmedia.data

import com.thechance.happysocialmedia.data.local.daos.HappySocialDao
import com.thechance.happysocialmedia.data.remote.HappySocialService
import javax.inject.Inject

class HappySocialRepositoryImpl @Inject constructor(
    dao: HappySocialDao,
    apiService: HappySocialService,
)