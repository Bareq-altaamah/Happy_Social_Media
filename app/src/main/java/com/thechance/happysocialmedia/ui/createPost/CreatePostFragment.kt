package com.thechance.happysocialmedia.ui.createPost

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentCreatePostBinding
import com.thechance.happysocialmedia.databinding.FragmentNotificationBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CreatePostFragment : BaseFragment<FragmentCreatePostBinding>() {
    override fun getLayoutID() = R.layout.fragment_create_post
    override val viewModel: CreatePostViewModel by viewModels()
}