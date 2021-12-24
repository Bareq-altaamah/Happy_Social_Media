package com.thechance.happysocialmedia.ui.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentProfileAnimatedBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileAnimatedBinding>() {

    override fun getLayoutID() = R.layout.fragment_profile_animated
    override val viewModel: ProfileViewModel by activityViewModels()

    override val useDefaultAppBar: Boolean = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerProfilePost.adapter = ProfilePostsAdapter(viewModel.posts.value.orEmpty(), viewModel)
    }
}