package com.chocolatada.bleachrpg.screens.launch.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chocolatada.bleachrpg.screens.launch.domain.LaunchScreenRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LaunchScreenViewModel @Inject constructor(
    private val launchScreenRepository: LaunchScreenRepository
) : ViewModel() {
    private val _doesPlayerHaveCharacters = MutableStateFlow(false)
    val doesPlayerHaveCharacters = _doesPlayerHaveCharacters.asStateFlow()
    init {
        doesPlayerHaveCharacters()
    }
    fun doesPlayerHaveCharacters() {
        viewModelScope.launch(Dispatchers.IO) {
            _doesPlayerHaveCharacters.value = launchScreenRepository.doesPlayerHaveCharacters()
        }
    }
}