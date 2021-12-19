package com.thechance.happysocialmedia.domain.models

data class Post(
    val id: Int,
    val name: String,
    val postImageUrl: String,
    val profileImageUrl: String,
    val content: String,
    val date: String,
    val like: Int,
    val disLike: Int,
)