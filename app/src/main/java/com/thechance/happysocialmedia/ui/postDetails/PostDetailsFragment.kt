package com.thechance.happysocialmedia.ui.postDetails

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentPostDetailsBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostDetailsFragment : BaseFragment<FragmentPostDetailsBinding>() {
    override fun getLayoutID() = R.layout.fragment_post_details
    override val useDefaultAppBar: Boolean = false
    override val viewModel: PostDetailsViewModel by viewModels()

}