package com.thechance.happysocialmedia.ui

import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseItemInteractionListener

interface PostInteractionListener: BaseItemInteractionListener {
    fun onClickItem()
    fun onClickPost(post: Post)
    fun onClickDownVote()
    fun onClickUpVote()
}