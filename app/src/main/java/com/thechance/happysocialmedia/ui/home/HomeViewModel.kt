package com.thechance.happysocialmedia.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    val repository: HappySocialRepository
): BaseViewModel(), PostInteractionListener{
    val posts = repository.getAllPosts().asLiveData(Dispatchers.IO)
    private val _navigateToPostDetails = MutableLiveData<Event<Post?>>()
    private val _navigateToCreatePost = MutableLiveData<Event<Boolean>>()
    val navigateToPostDetails: LiveData<Event<Post?>> get() = _navigateToPostDetails
    val navigateToCreatePost: LiveData<Event<Boolean>> get() = _navigateToCreatePost

    private val _isScrollingUp = MutableLiveData(true)
    val isScrollingUp: LiveData<Boolean> = _isScrollingUp

    fun setScrollUp() = _isScrollingUp.postValue(true)
    fun setScrollDown() = _isScrollingUp.postValue(false)

    fun onClickCreatePost() = _navigateToCreatePost.postValue(Event(true))

    override fun onClickItem() {
        // TODO("Not yet implemented")
    }

    override fun onClickPost(post: Post) = _navigateToPostDetails.postValue(Event(post))

    override fun onClickDownVote() {
        // TODO("Not yet implemented")
    }

    override fun onClickUpVote() {
        // TODO("Not yet implemented")
    }
}