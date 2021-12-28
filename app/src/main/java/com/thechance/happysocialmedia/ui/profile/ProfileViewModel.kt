package com.thechance.happysocialmedia.ui.profile

import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener {

    val user = repository.getCurrentUserInfo().asLiveData(Dispatchers.IO)
    val posts = repository.getAllPosts().asLiveData(Dispatchers.IO)
}