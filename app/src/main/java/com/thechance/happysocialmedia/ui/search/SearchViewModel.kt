package com.thechance.happysocialmedia.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.domain.models.User
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: HappySocialRepository
) : BaseViewModel() {

    val userName = MutableStateFlow<String?>("")

    private val _userData = MutableLiveData<List<User>?>()
    val userData: LiveData<List<User>?> = _userData

    init {
        setUserData()
    }

    private fun setUserData() {
        viewModelScope.launch {
            userName.debounce(700).collect { username ->
                repository.getUserByName(username.toString()).collect { data ->
                    _userData.postValue(data)
                }
            }
        }
    }
}