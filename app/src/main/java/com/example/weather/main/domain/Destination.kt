package com.example.weather.main.domain

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.ui.graphics.vector.ImageVector

enum class Destination(
    val route: String,
    val label: String,
    val icon: ImageVector,

) {
    FIRST("first", "First Screen", Icons.Default.FavoriteBorder),
    SECOND("second", "Second Screen", Icons.Default.FavoriteBorder),
    THIRD("third", "Third Screen", Icons.Default.FavoriteBorder)
}