package com.thechance.happysocialmedia.ui.identity.login

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentLoginBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    override fun getLayoutID() = R.layout.fragment_login

    override val viewModel: LoginViewModel by viewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textSingUp.setOnClickListener {
            onNavigate()
        }
    }


    private fun onNavigate() {
        findNavController().navigate(
            LoginFragmentDirections.actionLoginFragmentToSingUpFragment()
        )
    }
}