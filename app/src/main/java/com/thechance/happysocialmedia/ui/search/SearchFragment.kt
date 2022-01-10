package com.thechance.happysocialmedia.ui.search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentSearchBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseFragment<FragmentSearchBinding>() {
    override fun getLayoutID() = R.layout.fragment_search
    override val viewModel: SearchViewModel by viewModels()
    override val useDefaultAppBar = false
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerSearch.adapter = SearchAdapter(emptyList())
    }
}