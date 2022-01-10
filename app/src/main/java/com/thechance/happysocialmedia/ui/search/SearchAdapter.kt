package com.thechance.happysocialmedia.ui.search

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.domain.models.User
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter

class SearchAdapter(items: List<User>) : BaseDataItemAdapter<User>(items, null) {
    override fun getLayoutId() = R.layout.item_search
}