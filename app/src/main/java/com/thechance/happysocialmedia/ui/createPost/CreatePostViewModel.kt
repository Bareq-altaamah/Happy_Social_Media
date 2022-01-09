package com.thechance.happysocialmedia.ui.createPost

import android.graphics.Bitmap
import androidx.lifecycle.*
import com.shahad.app.happiness_detector.HappinessCalculator
import com.shahad.app.happiness_detector.HappinessLevel
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import com.thechance.happysocialmedia.util.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class CreatePostViewModel @Inject constructor(
    private val repository: HappySocialRepository,
    private val happinessCalculator: HappinessCalculator
): BaseViewModel() {

    val user = repository.getCurrentUserInfo().asLiveData(Dispatchers.IO)

    val postContent = MutableLiveData<String>()

    private val _clickUploadImageEvent =MutableLiveData<Event<Boolean>>()
    val clickUploadImageEvent: LiveData<Event<Boolean>> = _clickUploadImageEvent

    val imagePost= MutableLiveData<Bitmap?>()

    private val _isSad = MediatorLiveData<Boolean>().apply {
        addSource(imagePost){
            it?.let { checkHappinessImage(it) } ?: this.postValue(false)
        }
    }

    val isSad: LiveData<Boolean> = _isSad

    private fun checkHappinessImage(bitmap: Bitmap) {
        happinessCalculator.analyseImageHappiness(bitmap){
            when(it){
                HappinessLevel.HAPPY , HappinessLevel.NORMAL-> {
                    _isSad.postValue(false)
                }
                HappinessLevel.SAD -> {
                    _isSad.postValue(true)
                }
            }
        }
    }


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