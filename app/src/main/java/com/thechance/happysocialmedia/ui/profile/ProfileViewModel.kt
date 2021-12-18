package com.thechance.happysocialmedia.ui.profile

import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel()