package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Entity

@Entity(primaryKeys = ["characterId", "equipmentId"])
data class CharacterEquipmentCrossRef(
    val characterId: Int,
    val equipmentId: Int,
)
