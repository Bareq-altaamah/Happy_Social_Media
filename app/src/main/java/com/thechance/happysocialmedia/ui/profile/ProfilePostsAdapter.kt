package com.thechance.happysocialmedia.ui.profile

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.PostInteractionListener
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter

class ProfilePostsAdapter(items: List<Post>, listener: PostInteractionListener): BaseDataItemAdapter<Post>(items, listener) {

    override fun getLayoutId() = R.layout.item_post

}

