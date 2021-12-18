package com.thechance.happysocialmedia.ui.home

import com.thechance.happysocialmedia.domain.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel()