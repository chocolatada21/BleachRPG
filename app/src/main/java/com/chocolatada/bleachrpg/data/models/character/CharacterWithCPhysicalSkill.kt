package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class CharacterWithCPhysicalSkill(
    @Embedded val character: Character,
    @Relation(
        parentColumn = "characterId",
        entityColumn = "physicalSkillId",
        associateBy = Junction(CharacterPhysicalSkillCrossRef::class)
    )
    val cPhysicalSkills: List<CPhysicalSkill>
) {
    override fun toString(): String {
        return "CharacterWithCPhysicalSkill(character=$character, cPhysicalSkills=$cPhysicalSkills)"
    }
}