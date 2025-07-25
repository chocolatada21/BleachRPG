package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Entity

@Entity(primaryKeys = ["bossId", "bPhysicalSkillId"])
data class BossBPhysicalSkillCrossRef(
    val bossId: Int,
    val bPhysicalSkillId: Int
)