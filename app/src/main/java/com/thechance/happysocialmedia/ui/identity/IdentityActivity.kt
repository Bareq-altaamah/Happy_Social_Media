package com.thechance.happysocialmedia.ui.identity

import androidx.activity.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.ActivityIdentityBinding
import com.thechance.happysocialmedia.ui.base.BaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IdentityActivity : BaseActivity<ActivityIdentityBinding>() {
    override fun getLayoutID() = R.layout.activity_identity
    override fun getThemeID() = R.style.Theme_HappySocialMedia
    override val viewModel: IdentityViewModel by viewModels()


}