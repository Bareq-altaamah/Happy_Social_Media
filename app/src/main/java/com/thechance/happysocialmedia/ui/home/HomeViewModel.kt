package com.thechance.happysocialmedia.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener{

    val posts = repository.getAllPosts().asLiveData(Dispatchers.IO)

    private val _isScrollingUp = MutableLiveData(true)
    val isScrollingUp: LiveData<Boolean> = _isScrollingUp

    fun setScrollUp() = _isScrollingUp.postValue(true)
    fun setScrollDown() = _isScrollingUp.postValue(false)

    override fun onClickItem() {
        TODO("Not yet implemented")
    }

    override fun onClickDownVote() {
        TODO("Not yet implemented")
    }

    override fun onClickUpVote() {
        TODO("Not yet implemented")
    }
}