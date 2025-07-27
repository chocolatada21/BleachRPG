package com.chocolatada.bleachrpg.screens.launch.presentation.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.chocolatada.bleachrpg.screens.launch.presentation.viewmodel.LaunchScreenViewModel

@Composable
fun LaunchScreen(
    modifier: Modifier = Modifier,
    launchScreenViewModel: LaunchScreenViewModel,
    onNewGame: () -> Unit,
    onContinueGame: () -> Unit
) {
    var doesPlayerHaveCharacters = launchScreenViewModel.doesPlayerHaveCharacters.collectAsState()
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column {
            Button(
                onClick = onNewGame
            ) {
                Text(text = "New Game")
            }
            Button(
                onClick = onContinueGame,
                enabled = doesPlayerHaveCharacters.value
            ) {
                Text(text = "Continue Game")
            }
        }
    }
}