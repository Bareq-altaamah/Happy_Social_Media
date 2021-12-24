package com.thechance.happysocialmedia.util.extensions

import android.util.Log
import com.thechance.happysocialmedia.util.Constants
import com.thechance.happysocialmedia.util.Event

fun <T> T.log(tag: String = Constants.TAG): T {
    Log.i(tag, toString())
    return this
}

fun <T> Event<T>?.observe(onEventUnhandledContent: (T) -> Unit) {
    this?.getContentIfNotHandled()?.let(onEventUnhandledContent)
}