package com.thechance.happysocialmedia.ui.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.annotation.StyleRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.thechance.happysocialmedia.BR


abstract class BaseActivity<VDB : ViewDataBinding> : AppCompatActivity() {
    @LayoutRes
    protected abstract fun getLayoutID(): Int

    @StyleRes
    protected abstract fun getThemeID(): Int

    private lateinit var _viewDataBinding: VDB
    protected val viewDataBinding get() = _viewDataBinding

    protected abstract val viewModel: BaseViewModel
    protected open val viewModelBindingVariable get() = BR.viewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(getThemeID())
        _viewDataBinding = DataBindingUtil.setContentView<VDB>(this, getLayoutID()).apply {
            setVariable(viewModelBindingVariable, viewModel)
            lifecycleOwner = this@BaseActivity
        }
    }
}
