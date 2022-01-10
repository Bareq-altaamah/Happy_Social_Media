package com.thechance.happysocialmedia.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.FragmentNavigatorExtras
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentHomeBinding
import com.thechance.happysocialmedia.domain.models.Post
import com.thechance.happysocialmedia.ui.base.BaseFragment
import com.thechance.happysocialmedia.ui.profile.ProfilePostsAdapter
import com.thechance.happysocialmedia.util.extensions.observe
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutID() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigationListener()
        listenToRecyclerScrolls()
        binding.recyclerHomePost.adapter =
            ProfilePostsAdapter(viewModel.posts.value.orEmpty(), viewModel)
    }

    private fun navigationListener() {
        viewModel.navigateToPostDetails.observe(this, { it.observe(::navigateToPostDetails) })
        viewModel.navigateToCreatePost.observe(this, { it.observe{ navigateToCreatePost() } })
    }

    private fun navigateToPostDetails(post: Post?) {
        HomeFragmentDirections.actionHomeFragmentToPostFragment(post)
            .also(findNavController()::navigate)
    }

    private fun navigateToCreatePost() {
        HomeFragmentDirections.actionHomeFragmentToCreatePostFragment()
            .also(findNavController()::navigate)
    }

    private fun listenToRecyclerScrolls() {
        binding.recyclerHomePost.addOnScrollListener(customScrollListener)
    }

    //TODO: improve this later
    private val customScrollListener = object : RecyclerView.OnScrollListener() {
        override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
            super.onScrolled(recyclerView, dx, dy)
            if (dy > 0) {
                viewModel.setScrollUp()
            } else {
                viewModel.setScrollDown()
            }
        }
    }
}