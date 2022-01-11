package com.thechance.happysocialmedia.ui.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentProfileAnimatedBinding
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseFragment
import com.thechance.happysocialmedia.ui.home.HomeFragmentDirections
import com.thechance.happysocialmedia.util.extensions.observe
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment<FragmentProfileAnimatedBinding>() {

    override fun getLayoutID() = R.layout.fragment_profile_animated
    override val viewModel: ProfileViewModel by activityViewModels()

    override val useDefaultAppBar: Boolean = false

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigationListener()
        binding.recyclerProfilePost.adapter = ProfilePostsAdapter(viewModel.posts.value.orEmpty(), viewModel)
    }

    private fun navigationListener() {
        viewModel.navigateToPostDetails.observe(this, { it.observe(::navigateToPostDetails) })
    }

    private fun navigateToPostDetails(post: Post?) {
        ProfileFragmentDirections.actionProfileFragmentToPostFragment(post).also(findNavController()::navigate)
    }
}