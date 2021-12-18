package com.thechance.happysocialmedia.util

fun <T> Event<T>?.observe(onEventUnhandledContent: (T) -> Unit) {
    this?.getContentIfNotHandled()?.let(onEventUnhandledContent)
}