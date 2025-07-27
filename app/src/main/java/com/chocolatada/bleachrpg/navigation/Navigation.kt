package com.chocolatada.bleachrpg.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chocolatada.bleachrpg.navigation.routes.Launch
import com.chocolatada.bleachrpg.navigation.routes.NewGame
import com.chocolatada.bleachrpg.screens.launch.presentation.view.LaunchScreen
import com.chocolatada.bleachrpg.screens.launch.presentation.viewmodel.LaunchScreenViewModel

@Composable
fun Navigation(modifier: Modifier) {
    val navController = rememberNavController()
    Box(
        modifier = modifier
    ) {
        NavHost(
            navController = navController,
            startDestination = Launch
        ) {
            composable<Launch> {
                val launchScreenViewModel = hiltViewModel<LaunchScreenViewModel>()
                LaunchScreen(
                    launchScreenViewModel = launchScreenViewModel,
                    onNewGame = { navController.navigate(NewGame) },
                    onContinueGame = {}
                )
            }
            composable<NewGame> {

            }
        }
    }
}