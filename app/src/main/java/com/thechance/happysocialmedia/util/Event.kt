package com.thechance.happysocialmedia.util

import androidx.lifecycle.Observer

open class Event<out T>(private val content: T) {
    @Suppress("MemberVisibilityCanBePrivate")
    var hasBeenHandled = false
        private set

    fun getContentIfHandled(): T? {
        return if (hasBeenHandled) {
            null
        } else {
            hasBeenHandled = true
            content
        }
    }

    fun peekContent(): T = content

}


class EventObserver<T>(private val onEventUnhandledContent: (T) -> Unit) : Observer<Event<T>> {
    override fun onChanged(event: Event<T>?) {
        event?.getContentIfHandled()?.let { it ->
            onEventUnhandledContent(it)
        }
    }
}