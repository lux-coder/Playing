package com.example.playing.model

data class Note(
    val creationDate: String,
    val contents: String,
    val upVotes: Int,
    val imageUrl: String,
    val creatorId: Int
)