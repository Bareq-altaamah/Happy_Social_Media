package com.thechance.happysocialmedia.util.bindingAdapters

import androidx.appcompat.widget.SearchView
import androidx.databinding.BindingAdapter
import androidx.databinding.InverseBindingAdapter
import androidx.databinding.InverseBindingListener

@BindingAdapter(value = ["app:query"])
fun setQuery(searchView: SearchView, queryText: String?) {
    searchView.setQuery(queryText, false)
}

@InverseBindingAdapter(attribute = "app:query", event = "attrChanged")
fun getQuery(searchView: SearchView): String {
    return searchView.query.toString()
}

@BindingAdapter("attrChanged")
fun onQueryListener(searchView: SearchView, onChangeListener: InverseBindingListener){
    searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
        override fun onQueryTextSubmit(query: String?): Boolean {
            return true
        }
        override fun onQueryTextChange(newText: String?): Boolean {
            onChangeListener.onChange()
            return true
        }
    })
}