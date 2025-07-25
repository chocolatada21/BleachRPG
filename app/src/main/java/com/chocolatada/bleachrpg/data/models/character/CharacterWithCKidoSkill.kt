package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

class CharacterWithCKidoSkill(
    @Embedded val character: Character,
    @Relation(
        parentColumn = "characterId",
        entityColumn = "kidoSkillId",
        associateBy = Junction(CharacterKidoSkillCrossRef::class)
    )
    val cKidoSkills: List<CKidoSkill>
) {
    override fun toString(): String {
        return "CharacterWithCKidoSkill(character=$character, cKidoSkills=$cKidoSkills)"
    }
}