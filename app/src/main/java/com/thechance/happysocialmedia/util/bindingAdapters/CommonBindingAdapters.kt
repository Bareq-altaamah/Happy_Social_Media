package com.thechance.happysocialmedia.util.bindingAdapters


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.thechance.happysocialmedia.ui.base.BaseDataItemAdapter
import com.thechance.happysocialmedia.util.extensions.log


@BindingAdapter(value = ["items"])
fun <T> setRecyclerItems(view: RecyclerView, items: List<T>?) {
    items.log()
    (view.adapter as? BaseDataItemAdapter<T>)?.setItems(items ?: emptyList())
}

@BindingAdapter(value = ["imageUrl"])
fun setImageFromUrl(view: ImageView, url: String?){
    view.load(url)
}