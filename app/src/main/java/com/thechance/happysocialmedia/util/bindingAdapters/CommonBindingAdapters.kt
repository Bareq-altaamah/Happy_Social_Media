package com.thechance.happysocialmedia.util.bindingAdapters


import android.annotation.SuppressLint
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.load
import com.thechance.happysocialmedia.R

@BindingAdapter(value = ["imageUrl"])
fun setImageFromUrl(view: ImageView, url: String?){
    view.load(url)
}

@SuppressLint("ResourceType")
@BindingAdapter(value = ["app:isButtonChecked"])
fun setButtonColors(view: ImageView, isChecked: Boolean){
    if (isChecked){
        view.setColorFilter(ContextCompat.getColor(view.context, R.color.brand_color))
    }else{
        view.setColorFilter(ContextCompat.getColor(view.context, R.color.shade_ternary_color))
    }
}

@BindingAdapter(value = ["app:isActive"])
fun setImageActive(view: ImageView, isActive: Boolean){
    if (isActive){
        view.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.circle))
    }
}