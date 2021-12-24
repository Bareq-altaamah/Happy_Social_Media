package com.thechance.happysocialmedia.util.extensions

fun Boolean?.isTrue(): Boolean = this == true

fun Boolean?.isNullOrTrue(): Boolean = this != false

fun Boolean?.isFalse(): Boolean = this == false

fun Boolean?.isNullOrFalse(): Boolean = this != true