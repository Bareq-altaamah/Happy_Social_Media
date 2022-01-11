package com.thechance.happysocialmedia.util.bindingAdapters

import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import androidx.databinding.BindingAdapter
import com.thechance.happysocialmedia.util.extensions.isTrue

@BindingAdapter(value = ["show"])
fun setVisibility(view: View, value: Boolean?) {
    view.visibility = if(value.isTrue()) View.VISIBLE else View.GONE
}

@BindingAdapter(value = ["animatedVisibility"])
fun setAnimatedVisibility(view: View, value: Boolean?) {
    TransitionManager.beginDelayedTransition(view.rootView as ViewGroup)
    view.visibility = if(value.isTrue()) View.VISIBLE else View.GONE
}

@BindingAdapter(value = ["app:hideIfNull"])
fun <T> hideView(view: View , value: T?){
    view.visibility = if(value == null) View.GONE else View.VISIBLE
}