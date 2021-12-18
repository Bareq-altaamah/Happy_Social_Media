package com.thechance.happysocialmedia.ui.search

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentSearchBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override fun getLayoutID() = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModels()
}