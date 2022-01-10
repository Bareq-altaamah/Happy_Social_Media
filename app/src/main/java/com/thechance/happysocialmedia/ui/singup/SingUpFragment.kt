package com.thechance.happysocialmedia.ui.singup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentSingUpBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SingUpFragment : BaseFragment<FragmentSingUpBinding>() {
    override fun getLayoutID() = R.layout.fragment_sing_up
    override val viewModel: SingUpViewModel by viewModels()


    private fun onNavigate() {
        findNavController().navigate(
            SingUpFragmentDirections.actionSingUpFragmentToLoginFragment()
        )
    }
}