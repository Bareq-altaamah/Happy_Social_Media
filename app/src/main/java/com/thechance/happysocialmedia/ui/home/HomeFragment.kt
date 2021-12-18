package com.thechance.happysocialmedia.ui.home

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentHomeBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment: BaseFragment<FragmentHomeBinding, HomeViewModel>() {

    override val layoutId: Int = R.layout.fragment_home
    override val viewModelClass: Class<HomeViewModel> =HomeViewModel::class.java

}