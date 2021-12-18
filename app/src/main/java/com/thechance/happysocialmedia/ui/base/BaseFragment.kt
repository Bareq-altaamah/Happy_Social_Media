package com.thechance.happysocialmedia.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.thechance.happysocialmedia.BR

abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {
    @LayoutRes
    protected abstract fun getLayoutID(): Int

    private lateinit var _viewDataBinding: VDB
    protected val viewDataBinding get() = _viewDataBinding

    protected abstract val viewModel: BaseViewModel
    protected open val viewModelBindingVariable get() = BR.viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewDataBinding = DataBindingUtil.inflate<VDB>(inflater, getLayoutID(), container, false).apply {
            setVariable(viewModelBindingVariable, viewModel)
            lifecycleOwner = viewLifecycleOwner
        }
        return _viewDataBinding.root
    }
}