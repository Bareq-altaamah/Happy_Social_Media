package com.thechance.happysocialmedia.ui.profile

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentProfileBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileBinding>() {
    override fun getLayoutID() = R.layout.fragment_profile
    override val viewModel: ProfileViewModel by viewModels()
}