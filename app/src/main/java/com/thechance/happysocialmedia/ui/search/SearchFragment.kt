package com.thechance.happysocialmedia.ui.search

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentSearchBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment: BaseFragment<FragmentSearchBinding, SearchViewModel>() {

    override val layoutId: Int = R.layout.fragment_search
    override val viewModelClass: Class<SearchViewModel> =SearchViewModel::class.java

}