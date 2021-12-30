package com.thechance.happysocialmedia.util.bindingAdapters

import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener
import androidx.recyclerview.widget.RecyclerView
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter
import com.thechance.happysocialmedia.util.extensions.log

@BindingAdapter(value = ["items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    items.log()
    (view.adapter as? BaseDataItemAdapter<T>)?.setItems(items ?: emptyList())
}

@BindingAdapter(value = ["app:setScrollState"])
fun setScrollState(recyclerView: RecyclerView, value: Boolean) {
}

@InverseBindingAdapter(attribute = "setScrollState", event = "onScrollListener")
fun getScrollState(recyclerView: RecyclerView): Boolean {
    return recyclerView.scrollState == 0
}

@BindingAdapter("onScrollListener")
fun onScrollListener(recyclerView: RecyclerView, onChangeListener: InverseBindingListener) {
    recyclerView.addOnScrollListener(object : RecyclerView.OnScrollListener() {
        override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
            onChangeListener.onChange()
        }
    })
}
