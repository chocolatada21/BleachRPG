package com.chocolatada.bleachrpg.data.models.boss

import androidx.room.Entity

@Entity(primaryKeys = ["bossId", "bKidoSkillId"])
data class BossBKidoSkillCrossRef(
    val bossId: Int,
    val bKidoSkillId: Int
)
