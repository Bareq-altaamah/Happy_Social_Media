package com.thechance.happysocialmedia.domain.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Post(
    val id: Int,
    val name: String,
    val postImageUrl: String,
    val profileImageUrl: String,
    val content: String,
    val date: String,
    val upVote: String,
    val downVote: String,
    val isUpVoted: Boolean = false,
    val isDownVoted: Boolean = false,
) : Parcelable