package com.thechance.happysocialmedia.ui.base

import android.view.*
import androidx.annotation.LayoutRes
import androidx.databinding.*
import androidx.recyclerview.widget.*
import com.thechance.happysocialmedia.BR

abstract class BaseDataItemAdapter<T>(
    private var items: List<T>,
    private val listener: BaseItemInteractionListener
): RecyclerView.Adapter<BaseDataItemAdapter.BaseViewHolder>(){

    @LayoutRes
    protected abstract fun getLayoutId(): Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ItemViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), getLayoutId(), parent, false))
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItem = items[position]
        holder.binding.apply {
            setVariable(BR.item, currentItem)
            setVariable(BR.listener, listener)
        }
    }

    override fun getItemCount() = items.size

    fun setItems(newItems: List<T>) {
        val diffUtil = DiffUtil.calculateDiff(DataItemDiffUtil(items, newItems, this::areItemsSame, this::areContentsSame))
        items = newItems
        diffUtil.dispatchUpdatesTo(this)
    }

    fun getItems() = items

    protected open fun areItemsSame(oldItem: T, newItem: T): Boolean{
        return false
    }

    protected open fun areContentsSame(oldItem: T, newItem: T): Boolean{
        return true
    }

    abstract class BaseViewHolder(val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root)
    class ItemViewHolder(binding: ViewDataBinding) : BaseViewHolder(binding)

    inner class DataItemDiffUtil<T>(
        private val oldItems: List<T>,
        private val newItems: List<T>,
        val areItemsSame: (T, T) -> Boolean,
        val areContentsSame: (T, T) -> Boolean,
    ) : DiffUtil.Callback(){
        override fun getOldListSize() = oldItems.size
        override fun getNewListSize() = newItems.size

        override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int) =
            areItemsSame(oldItems[oldItemPosition], newItems[newItemPosition])

        override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int) =
            areContentsSame(oldItems[oldItemPosition], newItems[newItemPosition])

    }
}

interface BaseItemInteractionListener
