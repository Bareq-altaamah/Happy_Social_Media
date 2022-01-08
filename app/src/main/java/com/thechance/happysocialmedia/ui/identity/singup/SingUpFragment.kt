package com.thechance.happysocialmedia.ui.identity.singup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.SingupFragmentBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SingUpFragment : BaseFragment<SingupFragmentBinding>() {
    override fun getLayoutID() = R.layout.singup_fragment
    override val viewModel: SingUpViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textSignIn.setOnClickListener {
            onNavigate()
        }
    }


    private fun onNavigate() {
        findNavController().navigate(
            SingUpFragmentDirections.actionSingUpFragmentToLoginFragment()
        )
    }
}