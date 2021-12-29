package com.thechance.happysocialmedia.ui.post

import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PostViewModel @Inject constructor(
    repository: HappySocialRepository
) : BaseViewModel()