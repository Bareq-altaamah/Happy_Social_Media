package com.thechance.happysocialmedia.data.remote

import com.thechance.happysocialmedia.data.local.HappySocialDao
import com.thechance.happysocialmedia.data.local.mappers.LocalMapper
import com.thechance.happysocialmedia.domain.mappers.DomainMapper
import com.thechance.happysocialmedia.domain.HappySocialRepository
import javax.inject.Inject

class HappySocialRepositoryImpl @Inject constructor(
    dao: HappySocialDao,
    apiService: HappySocialService,
    domainMapper: DomainMapper,
    localMapper: LocalMapper
): HappySocialRepository