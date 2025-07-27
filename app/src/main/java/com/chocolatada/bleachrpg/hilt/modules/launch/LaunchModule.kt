package com.chocolatada.bleachrpg.hilt.modules.launch

import com.chocolatada.bleachrpg.data.dao.character.CharacterDao
import com.chocolatada.bleachrpg.screens.launch.data.repository.LaunchScreenRepositoryImpl
import com.chocolatada.bleachrpg.screens.launch.domain.LaunchScreenRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LaunchModule {
    @Provides
    @Singleton
    fun provideLaunchScreenRepository(
        characterDao: CharacterDao
    ) : LaunchScreenRepository = LaunchScreenRepositoryImpl(characterDao)
}