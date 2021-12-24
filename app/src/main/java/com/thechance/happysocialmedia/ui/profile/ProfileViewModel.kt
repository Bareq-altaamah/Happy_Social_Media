package com.thechance.happysocialmedia.ui.profile

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.extensions.log
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(), ProfilePostInteractionListener {

    val posts = MutableLiveData<List<Post>>()

    init {
        viewModelScope.launch {
            repository.getAllPosts().collect {
                posts.postValue(it)
            }
        }
    }

}