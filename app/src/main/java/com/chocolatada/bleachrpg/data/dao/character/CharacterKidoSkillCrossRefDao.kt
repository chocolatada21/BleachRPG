package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.character.CharacterKidoSkillCrossRef
import com.chocolatada.bleachrpg.data.models.character.CharacterWithCKidoSkill

@Dao
interface CharacterKidoSkillCrossRefDao {
    @Insert
    fun insert(characterKidoSkillCrossRef: CharacterKidoSkillCrossRef)
    @Transaction
    @Query("SELECT * FROM Character")
    fun getCharacterWithCKidoSkills(): List<CharacterWithCKidoSkill>
}