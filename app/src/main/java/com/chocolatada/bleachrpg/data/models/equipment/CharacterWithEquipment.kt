package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.chocolatada.bleachrpg.data.models.character.Character

class CharacterWithEquipment(
    @Embedded val character: Character,
    @Relation(
        parentColumn = "characterId",
        entityColumn = "equipmentId",
        associateBy = Junction(CharacterEquipmentCrossRef::class)
    )
    val equipment: List<Equipment>
) {
    override fun toString(): String {
        return "CharacterWithEquipment(character=$character, equipment=$equipment)"
    }
}