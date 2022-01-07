package com.thechance.happysocialmedia.ui.notification

import androidx.lifecycle.asLiveData
import com.thechance.happysocialmedia.data.HappySocialRepository
import com.thechance.happysocialmedia.ui.NotificationInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class NotificationViewModel @Inject constructor(
    repository: HappySocialRepository
): BaseViewModel(), NotificationInteractionListener{

    val notification = repository.getNotification().asLiveData(Dispatchers.IO)
}