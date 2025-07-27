package com.chocolatada.bleachrpg.hilt.modules

import android.content.Context
import androidx.room.Room
import com.chocolatada.bleachrpg.data.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext applicationContext: Context) =
        Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "BleachRPG-DB"
        ).build()

    @Provides
    @Singleton
    fun provideCharacterDao(appDatabase: AppDatabase) = appDatabase.characterDao()
}