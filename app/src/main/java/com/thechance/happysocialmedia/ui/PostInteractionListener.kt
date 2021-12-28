package com.thechance.happysocialmedia.ui

import com.thechance.happysocialmedia.ui.base.BaseItemInteractionListener

interface PostInteractionListener: BaseItemInteractionListener {
    fun onClickItem()
    fun onClickDownVote()
    fun onClickUpVote()
}