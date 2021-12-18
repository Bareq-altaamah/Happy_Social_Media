package com.thechance.happysocialmedia.ui.base

import android.os.Bundle
import android.view.*
import androidx.annotation.LayoutRes
import androidx.databinding.*
import androidx.fragment.app.Fragment
import com.thechance.happysocialmedia.BR

abstract class BaseFragment<VB: ViewDataBinding, VM: BaseViewModel>: Fragment() {

    @LayoutRes
    protected abstract fun getLayoutId(): Int

    protected abstract val viewModel: VM

    private lateinit var _viewDataBinding: VB
    protected val viewDataBinding
        get() = _viewDataBinding

    protected open fun getViewModelBindingVariable() = BR.viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _viewDataBinding = DataBindingUtil.inflate<VB>(inflater, getLayoutId(), container, false).also {
            it.setVariable(getViewModelBindingVariable(), viewModel)
            it.lifecycleOwner = viewLifecycleOwner
        }

        return _viewDataBinding.root
    }

}