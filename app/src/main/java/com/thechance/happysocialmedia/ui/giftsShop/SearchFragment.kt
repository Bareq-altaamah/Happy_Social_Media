package com.thechance.happysocialmedia.ui.giftsShop

import androidx.fragment.app.viewModels
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.databinding.FragmentGiftsShopBinding
import com.thechance.happysocialmedia.databinding.FragmentSearchBinding
import com.thechance.happysocialmedia.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class GiftShopFragment : BaseFragment<FragmentGiftsShopBinding>() {
    override fun getLayoutID() = R.layout.fragment_gifts_shop
    override val viewModel: GiftsShopViewModel by viewModels()
}