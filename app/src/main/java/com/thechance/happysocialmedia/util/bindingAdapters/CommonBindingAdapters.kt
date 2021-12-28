package com.thechance.happysocialmedia.util.bindingAdapters


import android.annotation.SuppressLint
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import coil.load
import com.google.android.material.button.MaterialButton
import com.thechance.happysocialmedia.R

@BindingAdapter(value = ["imageUrl"])
fun setImageFromUrl(view: ImageView, url: String?){
    view.load(url)
}

@SuppressLint("ResourceType")
@BindingAdapter(value = ["app:isButtonChecked"])
fun setButtonColors(view: MaterialButton, isChecked: Boolean){
    if (isChecked){
        view.setIconTintResource(R.color.brand_color)
        view.setStrokeColorResource(R.color.brand_color)
    }else{
        view.setIconTintResource(R.color.card_background_color)
        view.setStrokeColorResource(R.color.card_background_color)
    }
}