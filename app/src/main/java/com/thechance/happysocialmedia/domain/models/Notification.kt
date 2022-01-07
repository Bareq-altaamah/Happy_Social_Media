package com.thechance.happysocialmedia.domain.models

data class Notification(
    val id: Int,
    val profileImageUrl: String,
    val content: String,
    val date: String,
    val isActive: Boolean,
)
