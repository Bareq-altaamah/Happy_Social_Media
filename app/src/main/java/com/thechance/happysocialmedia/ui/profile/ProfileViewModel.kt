package com.thechance.happysocialmedia.ui.profile

import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener {

    val posts = repository.getAllPosts().asLiveData(Dispatchers.IO)
}