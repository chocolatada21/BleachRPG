package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Entity

@Entity(primaryKeys = ["characterId", "physicalSkillId"])
data class CharacterPhysicalSkillCrossRef(
    val characterId: Int,
    val physicalSkillId: Int
)
