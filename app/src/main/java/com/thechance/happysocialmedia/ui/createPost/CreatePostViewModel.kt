package com.thechance.happysocialmedia.ui.createPost

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class CreatePostViewModel @Inject constructor(
    private val repository: HappySocialRepository
): BaseViewModel() {

    val user = repository.getCurrentUserInfo().asLiveData(Dispatchers.IO)

    val postContent = MutableLiveData<String>()

    fun onClickPublish() {
        //TODO: implement this
    }

    fun onClickRemoveImage(){
        //TODO: implement this
    }
}