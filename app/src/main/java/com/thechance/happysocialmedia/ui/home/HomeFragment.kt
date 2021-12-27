package com.thechance.happysocialmedia.ui.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentHomeBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import com.thechance.happysocialmedia.ui.profile.ProfilePostsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutID() = R.layout.fragment_home
    override val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerHomePost.adapter = ProfilePostsAdapter(viewModel.posts.value.orEmpty(), viewModel)
    }
}