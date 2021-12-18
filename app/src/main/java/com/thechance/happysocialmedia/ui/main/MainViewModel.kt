package com.thechance.happysocialmedia.ui.main

import com.thechance.happysocialmedia.domain.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel()