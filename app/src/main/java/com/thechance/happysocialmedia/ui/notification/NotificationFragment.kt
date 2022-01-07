package com.thechance.happysocialmedia.ui.notification

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentNotificationBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationFragment : BaseFragment<FragmentNotificationBinding>() {
    override fun getLayoutID() = R.layout.fragment_notification
    override val viewModel: NotificationViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerNotification.adapter = NotificationAdapter(viewModel.notification.value.orEmpty(), viewModel)
    }
}