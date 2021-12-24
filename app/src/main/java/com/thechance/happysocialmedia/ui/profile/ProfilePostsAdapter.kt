package com.thechance.happysocialmedia.ui.profile

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter
import com.thechance.happysocialmedia.ui.base.BaseItemInteractionListener

class ProfilePostsAdapter(items: List<Post>, listener: ProfilePostInteractionListener): BaseDataItemAdapter<Post>(items, listener) {

    override fun getLayoutId() = R.layout.item_post

}

interface ProfilePostInteractionListener: BaseItemInteractionListener