package com.thechance.happysocialmedia.ui.base

import androidx.recyclerview.widget.DiffUtil

class HappySocialDiffUtil<T>(
    private val oldList: List<T>,
    private val newList: List<T>,
    val areItemsTheSame: (Int, Int, List<T>) -> Boolean,
    val areContentSame: (Int, Int, List<T>) -> Boolean,
) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        areItemsTheSame(oldItemPosition, newItemPosition, newList)

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
        areContentSame(oldItemPosition, newItemPosition, newList)

}