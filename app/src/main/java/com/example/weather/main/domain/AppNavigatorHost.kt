package com.example.weather.main.domain

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.weather.first_screen.presentation.FirstScreen
import com.example.weather.second_screen.presentation.SecondScreen
import com.example.weather.third_screen.presentation.ThirdScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
internal fun AppNavHost(
    navController: NavHostController,
    startDestination: Destination,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController,
        startDestination = startDestination.route
    ) {
        Destination.entries.forEach { destination ->
            composable(destination.route) {
                when (destination) {
                    Destination.FIRST -> FirstScreen()
                    Destination.SECOND -> SecondScreen()
                    Destination.THIRD -> ThirdScreen()
                }
            }
        }
    }
}