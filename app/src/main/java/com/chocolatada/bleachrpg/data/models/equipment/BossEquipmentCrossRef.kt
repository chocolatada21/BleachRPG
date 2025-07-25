package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Entity

@Entity(primaryKeys = ["bossId", "equipmentId"])
data class BossEquipmentCrossRef(
    val bossId: Int,
    val equipmentId: Int,
    val probability: Float,
    val goldValue: Int
)