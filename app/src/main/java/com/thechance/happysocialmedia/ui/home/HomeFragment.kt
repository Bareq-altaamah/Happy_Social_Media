package com.thechance.happysocialmedia.ui.home

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentHomeBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override fun getLayoutId() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

}