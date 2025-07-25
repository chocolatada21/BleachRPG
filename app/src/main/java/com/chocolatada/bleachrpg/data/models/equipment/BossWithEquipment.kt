package com.chocolatada.bleachrpg.data.models.equipment

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.chocolatada.bleachrpg.data.models.boss.Boss

data class BossWithEquipment(
    @Embedded val boss: Boss,
    @Relation(
        parentColumn = "bossId",
        entityColumn = "bossId",
        entity = BossEquipmentCrossRef::class
    )
    val equipment: List<EquipmentDropDetails>
)