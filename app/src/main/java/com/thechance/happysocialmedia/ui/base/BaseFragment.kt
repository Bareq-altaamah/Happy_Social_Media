package com.thechance.happysocialmedia.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.thechance.happysocialmedia.BR
import com.thechance.happysocialmedia.R
import com.thechance.happysocialmedia.ui.main.MainActivity

abstract class BaseFragment<VDB : ViewDataBinding> : Fragment() {
    @LayoutRes
    protected abstract fun getLayoutID(): Int

    protected open val useDefaultAppBar: Boolean = true

    private lateinit var _binding: VDB
    protected val binding get() = _binding

    protected abstract val viewModel: BaseViewModel
    protected open val viewModelBindingVariable get() = BR.viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate<VDB>(inflater, getLayoutID(), container, false).apply {
            setVariable(viewModelBindingVariable, viewModel)
            lifecycleOwner = viewLifecycleOwner
        }
        (activity as MainActivity).setDefualtAppBarVisiblity(useDefaultAppBar)
        return _binding.root
    }
}