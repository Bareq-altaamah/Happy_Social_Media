package com.thechance.happysocialmedia.ui.identity.login

import androidx.lifecycle.MutableLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    val repository: HappySocialRepository
) : BaseViewModel() {


    val userName = MutableLiveData<String?>()
    val password = MutableLiveData<String?>()

    fun logInWithUser() {
        //TODO:implement later
    }

}