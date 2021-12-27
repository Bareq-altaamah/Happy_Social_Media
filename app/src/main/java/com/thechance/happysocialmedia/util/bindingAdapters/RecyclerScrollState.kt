package com.thechance.happysocialmedia.util.bindingAdapters

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.recyclerview.widget.RecyclerView
import com.thechance.happysocialmedia.util.ScrollState

@BindingAdapter(value = ["app:setScrollingState"])
fun RecyclerView.setScrollState(value: Boolean) {
}

@InverseBindingAdapter(attribute = "setScrollingState", event = "onScrollListener")
fun RecyclerView.getScrollState(): Boolean {
    return ScrollState.SCROLL.value
}

@BindingAdapter("onScrollListener")
fun RecyclerView.onScrollListener(onChangeListener: InverseBindingListener) {
    addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            ScrollState.SCROLL.value = newState == 0
            onChangeListener.onChange()
        }
    })
}