package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Embedded
import androidx.room.Relation

data class EquipmentDropDetails(
    @Embedded val bossEquipmentCrossRef: BossEquipmentCrossRef,
    @Relation(
        parentColumn = "equipmentId",
        entityColumn = "equipmentId"
    )
    val equipment: Equipment
)
