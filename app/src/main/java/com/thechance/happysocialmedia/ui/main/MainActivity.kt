package com.thechance.happysocialmedia.ui.main

import androidx.activity.viewModels
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.ActivityMainBinding
import com.thechance.happysocialmedia.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun getLayoutID() = R.layout.activity_main
    override fun getThemeID() = R.style.Theme_HappySocialMedia
    override val viewModel: MainViewModel by viewModels()

    override fun onResume() {
        super.onResume()
        viewDataBinding.navigation.setupWithNavController(findNavController(R.id.fragment_host))
    }

    override fun onSupportNavigateUp(): Boolean {
        findNavController(R.id.fragment_host).navigateUp()
        return true
    }
}