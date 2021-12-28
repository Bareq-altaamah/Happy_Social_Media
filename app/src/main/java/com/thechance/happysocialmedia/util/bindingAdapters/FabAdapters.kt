package com.thechance.happysocialmedia.util.bindingAdapters

import androidx.databinding.BindingAdapter
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.thechance.happysocialmedia.util.extensions.isTrue

@BindingAdapter(value = ["app:extended"])
fun setExtendedState(view: ExtendedFloatingActionButton, value: Boolean?){
    if (value.isTrue()){
        view.extend()
    } else {
        view.shrink()
    }
}