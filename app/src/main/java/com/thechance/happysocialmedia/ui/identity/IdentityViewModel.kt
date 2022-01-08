package com.thechance.happysocialmedia.ui.identity

import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class IdentityViewModel @Inject constructor(
    val repository: HappySocialRepository
) : BaseViewModel() {
}