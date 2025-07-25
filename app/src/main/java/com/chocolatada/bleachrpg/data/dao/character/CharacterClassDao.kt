package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.character.CharacterClass

@Dao
interface CharacterClassDao {
    @Insert
    fun insert(characterClass: CharacterClass)
    @Query("SELECT * FROM CharacterClass")
    fun getAll(): List<CharacterClass>
}