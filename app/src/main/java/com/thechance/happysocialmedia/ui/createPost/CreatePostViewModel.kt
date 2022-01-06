package com.thechance.happysocialmedia.ui.createPost

import android.graphics.Bitmap
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class CreatePostViewModel @Inject constructor(
    private val repository: HappySocialRepository
): BaseViewModel() {

    val user = repository.getCurrentUserInfo().asLiveData(Dispatchers.IO)

    val postContent = MutableLiveData<String>()

    private val _clickUploadImageEvent =MutableLiveData<Event<Boolean>>()
    val clickUploadImageEvent: LiveData<Event<Boolean>> = _clickUploadImageEvent

    val imagePost= MutableLiveData<Bitmap?>()

    fun onClickPublish() {
        //TODO: implement this
    }

    fun onClickRemoveImage(){
        imagePost.postValue(null)
    }

    fun onClickUploadImage(){
        _clickUploadImageEvent.postValue(Event(true))
    }

}