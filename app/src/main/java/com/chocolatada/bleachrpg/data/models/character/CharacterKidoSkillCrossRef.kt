package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Entity

@Entity(primaryKeys = ["characterId", "kidoSkillId"])
data class CharacterKidoSkillCrossRef(
    val characterId: Int,
    val kidoSkillId: Int
)