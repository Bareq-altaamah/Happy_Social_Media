package com.thechance.happysocialmedia.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(){

    val post = MutableLiveData<List<Post>>()

    init {
        viewModelScope.launch {
            repository.getAllPosts().collect {
                post.postValue(it)
                Log.i(TAG, "HomeViewModel: post -----{ $it } ")
            }
        }
    }
}