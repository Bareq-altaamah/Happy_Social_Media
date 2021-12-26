package com.thechance.happysocialmedia.domain.models

data class User(
    val id: Int,
    val name: String,
    val profileImageUrl: String,
    val coverImageUrl: String,
    val bio: String,
    val followers: Int,
    val following: Int,
    val upVote: Int,
    val downVote: Int,
)
