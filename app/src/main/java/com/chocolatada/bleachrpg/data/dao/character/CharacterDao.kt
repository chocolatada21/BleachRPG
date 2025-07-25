package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.chocolatada.bleachrpg.data.models.character.Character

@Dao
interface CharacterDao {
    @Insert
    fun insert(character: Character)
    @Query("SELECT * FROM Character")
    fun getAll(): List<Character>
}