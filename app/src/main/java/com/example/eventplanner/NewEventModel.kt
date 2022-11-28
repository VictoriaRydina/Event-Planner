package com.example.eventplanner

data class NewEventModel(
    val id: Int,
    val name: String,
    val date: String,
    val location: String,
    val weather: String,
    val degree: String
)