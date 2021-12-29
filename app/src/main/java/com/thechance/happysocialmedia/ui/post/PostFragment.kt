package com.thechance.happysocialmedia.ui.post

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentPostBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostFragment : BaseFragment<FragmentPostBinding>() {
    override fun getLayoutID() = R.layout.fragment_post

    override val viewModel: PostViewModel by viewModels()

}