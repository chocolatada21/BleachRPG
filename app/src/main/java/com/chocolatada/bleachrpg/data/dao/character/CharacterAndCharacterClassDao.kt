package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.character.CharacterAndCharacterClass

@Dao
interface CharacterAndCharacterClassDao {
    @Transaction
    @Query("SELECT * FROM Character")
    fun getCharacterAndCharacterClass(): List<CharacterAndCharacterClass>
}