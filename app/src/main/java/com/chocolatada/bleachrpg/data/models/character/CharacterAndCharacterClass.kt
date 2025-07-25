package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Embedded
import androidx.room.Relation

class CharacterAndCharacterClass(
    @Embedded val character: Character,
    @Relation(
        parentColumn = "characterId",
        entityColumn = "characterClassId"
    )
    val characterClass: CharacterClass
) {
    override fun toString(): String {
        return "CharacterAndCharacterClass(character=$character, characterClass=$characterClass)"
    }
}
