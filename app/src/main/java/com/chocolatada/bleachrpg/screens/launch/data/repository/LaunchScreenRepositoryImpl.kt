package com.chocolatada.bleachrpg.screens.launch.data.repository

import com.chocolatada.bleachrpg.data.dao.character.CharacterDao
import com.chocolatada.bleachrpg.screens.launch.domain.LaunchScreenRepository
import javax.inject.Inject

class LaunchScreenRepositoryImpl @Inject constructor(
    private val characterDao: CharacterDao
) : LaunchScreenRepository {
    override fun doesPlayerHaveCharacters(): Boolean {
        return characterDao.countCharacters() > 0
    }
}