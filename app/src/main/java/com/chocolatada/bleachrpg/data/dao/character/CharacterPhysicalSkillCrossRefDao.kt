package com.chocolatada.bleachrpg.data.dao.character

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction
import com.chocolatada.bleachrpg.data.models.character.CharacterPhysicalSkillCrossRef
import com.chocolatada.bleachrpg.data.models.character.CharacterWithCPhysicalSkill

@Dao
interface CharacterPhysicalSkillCrossRefDao {
    @Insert
    fun insert(characterPhysicalSkillCrossRef: CharacterPhysicalSkillCrossRef)
    @Transaction
    @Query("SELECT * FROM Character")
    fun getCharacterWithCPhysicalSkills(): List<CharacterWithCPhysicalSkill>
}