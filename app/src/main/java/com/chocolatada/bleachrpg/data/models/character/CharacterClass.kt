package com.chocolatada.bleachrpg.data.models.character

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class CharacterClass(
    @PrimaryKey val characterClassId: Int,
    val name: String
) {
    override fun toString(): String {
        return "CharacterClass(characterClassId=$characterClassId, name='$name')"
    }
}