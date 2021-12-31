package com.thechance.happysocialmedia.ui.postDetails

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PostDetailsViewModel @Inject constructor(
    private val repository: HappySocialRepository
) : BaseViewModel(){

    private val _postDetails = MutableLiveData<Post>()
    val postDetails: LiveData<Post> = _postDetails

    init {
        //TODO: remove this later
        _postDetails.postValue(
            Post(
                0,
                "Shahad Abdulhasan",
                "https://cdn.mos.cms.futurecdn.net/CAZ6JXi6huSuN4QGE627NR.jpg",
                "https://img.wattpad.com/ac774401878614400d9ff2eba27870e8cca3ba8f/68747470733a2f2f73332e616d617a6f6e6177732e636f6d2f776174747061642d6d656469612d736572766963652f53746f7279496d6167652f6a7445346c65564975635a4834773d3d2d3434393237343839362e313464363865343537326634373334323733303639343033363234382e6a7067",
                "Good Morning Elite Team , How are you?",
                "2030-12-12",
                "220",
                "3",
                isUpVoted = true,
                isDownVoted = false,
            )
        )
    }
}