package com.example.mymobile.domain.entity

data class TodoEntity(
    val title: String,
    val subtitle: String,
    val id: Int? = null
)