package com.thechance.happysocialmedia.ui.search

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentSearchBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import com.thechance.happysocialmedia.ui.home.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment: BaseFragment<FragmentSearchBinding, SearchViewModel>() {

    override fun getLayoutId() = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModels()

}