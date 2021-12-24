package com.thechance.happysocialmedia.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.Constants.TAG
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener{

    val posts = MutableLiveData<List<Post>>()

    private val _isScrollingUp = MutableLiveData(true)
    val isScrollingUp: LiveData<Boolean> = _isScrollingUp

    init {
        viewModelScope.launch {
            repository.getAllPosts().collect {
                posts.postValue(it)
            }
        }
    }

    fun setScrollUp() = _isScrollingUp.postValue(true)
    fun setScrollDown() = _isScrollingUp.postValue(false)
}