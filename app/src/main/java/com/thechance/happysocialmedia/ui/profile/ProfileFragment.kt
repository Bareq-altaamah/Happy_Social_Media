package com.thechance.happysocialmedia.ui.profile

import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentProfileBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment: BaseFragment<FragmentProfileBinding, ProfileViewModel>() {

    override val layoutId: Int = R.layout.fragment_profile
    override val viewModelClass: Class<ProfileViewModel> =ProfileViewModel::class.java

}