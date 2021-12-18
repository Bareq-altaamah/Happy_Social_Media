package com.thechance.happysocialmedia.data.remote

import com.thechance.happysocialmedia.data.local.HappySocialDao
import com.thechance.happysocialmedia.data.local.mappers.LocalMappers
import com.thechance.happysocialmedia.domain.mappers.DomainMappers
import com.thechance.happysocialmedia.domain.HappySocialRepository
import javax.inject.Inject

class HappySocialRepositoryImpl @Inject constructor(
    dao: HappySocialDao,
    apiService: HappySocialService,
    domainMapper: DomainMappers,
    localMapper: LocalMappers
): HappySocialRepository