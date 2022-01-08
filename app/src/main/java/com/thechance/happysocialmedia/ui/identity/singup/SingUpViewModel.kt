package com.thechance.happysocialmedia.ui.identity.singup

import androidx.lifecycle.MutableLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SingUpViewModel @Inject constructor(
    val repository: HappySocialRepository
) : BaseViewModel() {

    val email = MutableLiveData<String?>()
    val userName = MutableLiveData<String?>()
    val password = MutableLiveData<String?>()

    fun singUpWithUser() {
        //TODO:implement later
    }

}