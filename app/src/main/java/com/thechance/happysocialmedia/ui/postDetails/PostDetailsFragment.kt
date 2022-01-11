package com.thechance.happysocialmedia.ui.postDetails

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentPostDetailsBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostDetailsFragment : BaseFragment<FragmentPostDetailsBinding>() {
    override fun getLayoutID() = R.layout.fragment_post_details
    override val useDefaultAppBar: Boolean = false
    override val viewModel: PostDetailsViewModel by viewModels()
    private val args: PostDetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        args.post?.let(viewModel::onLoadPost)
    }
}