package com.thechance.happysocialmedia.ui.notification

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.domain.models.Notification
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter
import com.thechance.happysocialmedia.ui.base.BaseItemInteractionListener

class NotificationAdapter(item: List<Notification>, listener: NotificationInteractionListener) :
    BaseDataItemAdapter<Notification>(item, listener) {
    override fun getLayoutId() = R.layout.item_notification
}
interface NotificationInteractionListener: BaseItemInteractionListener {
    fun onClickNotification()
}