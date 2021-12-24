package com.thechance.happysocialmedia.util.bindingAdapters


import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter(value = ["imageUrl"])
fun setImageFromUrl(view: ImageView, url: String?){
    view.load(url)
}