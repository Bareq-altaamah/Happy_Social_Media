package com.thechance.happysocialmedia.ui.notification

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentNotificationBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationFragment: BaseFragment<FragmentNotificationBinding, NotificationViewModel>() {

    override val layoutId: Int = R.layout.fragment_notification
    override val viewModelClass: Class<NotificationViewModel> =NotificationViewModel::class.java

}